package edu.vandy.app.extensions;

/**
 * Helpful delegated extensions.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005\u00a2\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t\"\u0004\b\u0000\u0010\u0005\u00a8\u0006\n"}, d2 = {"Ledu/vandy/app/extensions/DelegatesExt;", "", "()V", "delegateVal", "Ledu/vandy/app/extensions/DelegateValue;", "T", "value", "(Ljava/lang/Object;)Ledu/vandy/app/extensions/DelegateValue;", "notNullSingleValue", "Ledu/vandy/app/extensions/NotNullSingleValueVar;", "app_debug"})
public final class DelegatesExt {
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.extensions.DelegatesExt INSTANCE = null;
    
    private DelegatesExt() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>edu.vandy.app.extensions.DelegateValue<T> delegateVal(T value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final <T extends java.lang.Object>edu.vandy.app.extensions.NotNullSingleValueVar<T> notNullSingleValue() {
        return null;
    }
}