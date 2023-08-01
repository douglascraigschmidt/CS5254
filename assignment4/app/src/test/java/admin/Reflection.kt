package admin

import java.lang.reflect.Field
import java.lang.reflect.Modifier.*
import kotlin.reflect.KClass

inline fun <reified T> Any.value(vararg types: Class<*>): T {
    val field = if (types.isEmpty()) {
        this::class.java.findField(T::class.java)
    } else {
        this::class.java.findField(*types)
    }
    return field.runWithAccess {
        field.get(this@value) as T
    }
}

inline fun <reified T> Any.setField(value: T, type: Class<*>, name: String = "") {
    javaClass.findField(type, name).let {
        it.runWithAccess {
            it.set(this@setField, value)
        }
    }
}

@SuppressWarnings("deprecation")
inline fun <reified T> Any.getField(name: String, type: Class<*>): T {
    return javaClass.findField(type, name).runWithAccess {
        get(this@getField) as T
    }
}

inline fun <reified T> T.injectInto(parent: Any, name: String = ""): T {
    val type = when (this) {
        is Int -> Int::class.javaPrimitiveType
        is Float -> Float::class.javaPrimitiveType
        is Double -> Double::class.javaPrimitiveType
        is Short -> Short::class.javaPrimitiveType
        else -> T::class.java
    }
    val field = parent::class.java.findField(type!!, name)
    parent.setField(this, type, field.name)
    return this
}

inline fun <reified T> T.injectInto(parent: Any, vararg types: Class<*>): T {
    val field = parent::class.java.findField(*types)
    parent.setField(this, field.type, field.name)
    return this
}

fun Class<*>.findField(vararg types: Class<*>): Field {
    types.forEach { type ->
        try {
            return findField(type, "")
        } catch (t: Throwable) {
        }
    }
    throw Exception("Unable to field types $types in $this.name")
}

fun Class<*>.findField(type: Class<*>, name: String = ""): Field {
    try {
        return declaredFields.firstOrNull {
            val wasAccessible = it.isAccessible
            try {
                it.isAccessible = true
                (name.isBlank() || it.name == name) && type.isAssignableFrom(it.type)
            } finally {
                it.isAccessible = wasAccessible
            }
        } ?: superclass!!.findField(type, name)
    } catch (e: Exception) {
        throw Exception("Class field $name with type $type does not exist")
    }
}

inline fun <reified T> Any.primitiveValue(type: KClass<*>, name: String = ""): T {
    return javaClass.findField(type.javaPrimitiveType!!, name).let {
        val wasAccessible = it.isAccessible
        it.isAccessible = true
        val result = it.get(this)
        it.isAccessible = wasAccessible
        result as T
    }
}

fun Any.primitiveValueHasModifier(modifier: Int, type: KClass<*>, name: String = ""): Boolean {
    return javaClass.findField(type.javaPrimitiveType!!, name).let {
        val wasAccessible = it.isAccessible
        it.isAccessible = true
        val result = (it.modifiers and modifier) != 0
        it.isAccessible = wasAccessible
        result
    }
}

inline fun <T> Field.runWithAccess(block: Field.() -> T): T {
    val wasAccessible = isAccessible
    isAccessible = true
    val result = block()
    isAccessible = wasAccessible
    return result
}

fun Field.hasModifiers(vararg modifiers: String): Boolean {
    return modifiers.map {
        modifierFromString(it)
    }.reduce { acc, modifier ->
        acc or modifier
    } and this.modifiers != 0
}

fun modifierFromString(modifier: String): Int {
    return when (modifier) {
        "public" -> PUBLIC
        "protected" -> PROTECTED
        "private" -> PRIVATE
        "static" -> STATIC
        "final" -> FINAL
        "transient" -> TRANSIENT
        "volatile" -> VOLATILE
        else -> 0x0
    }
}