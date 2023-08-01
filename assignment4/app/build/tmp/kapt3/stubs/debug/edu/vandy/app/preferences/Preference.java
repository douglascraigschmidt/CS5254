package edu.vandy.app.preferences;

/**
 * Preferences delegate class. Note that any collection based preferences will
 * not automatically update their associated shared preference entries when
 * elements of their collection are added, removed, or modified. To overcome
 * this limitation, shared preference collections should be declared as
 * immutable objects and any editing of these objects should be performed in
 * a temporary copy of the collection and then the original shared preference
 * property should be reassigned the temporary edited collection object.
 *
 * It would be nice to have this class implement ReadWriteProperty<Any?, T>
 * but that isn't possible because if getValue uses <reified T: Any?> which
 * is results in a different signature from the getValue declaration in
 * the ReadWriteProperty interface.
 *
 * The benefit of using a reified getValue method is that non-standard
 * property types can be automatically saved and restored using typed
 * Gson Strings rather than requiring delegate declarations to specify
 * typed Gson adapter.
 *
 * It would be really nice to somehow allow property values to access this
 * Preference delegate to directly call it's methods, but Kotlin generics
 * only make it possible to find the delegate instance based on data type
 * which would only work if there was just one Preference<Type> declaration
 * per class. If there are two or more, there is no way to use generics
 * to determine the correct instance to use for declared values that
 * delegate to the common Preference<Type> signature. The reason why
 * it would be nice to be able to access the Preference instance would be
 * to allow calling property.clear() to clear a shared preference or, to
 * set a shared preference change Observer on any given preference key value.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B=\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J&\u0010\u001e\u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u0002H\u0001H\u0086\b\u00a2\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\b\u0010!\u001a\u0004\u0018\u00010\u00022\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#H\u0086\n\u00a2\u0006\u0002\u0010$J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00028\u0000H\u0007\u00a2\u0006\u0002\u0010\'J,\u0010(\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\u00022\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010&\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010)R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006*"}, d2 = {"Ledu/vandy/app/preferences/Preference;", "T", "", "default", "name", "", "adapter", "Ledu/vandy/app/preferences/Adapter;", "subscriber", "Ledu/vandy/app/preferences/Subscriber;", "(Ljava/lang/Object;Ljava/lang/String;Ledu/vandy/app/preferences/Adapter;Ledu/vandy/app/preferences/Subscriber;)V", "actualName", "getActualName", "()Ljava/lang/String;", "setActualName", "(Ljava/lang/String;)V", "getAdapter", "()Ledu/vandy/app/preferences/Adapter;", "getDefault", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getName", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "getSubscriber", "()Ledu/vandy/app/preferences/Subscriber;", "clear", "", "get", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "set", "value", "(Ljava/lang/String;Ljava/lang/Object;)V", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "app_debug"})
public class Preference<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final edu.vandy.app.preferences.Adapter<T> adapter = null;
    @org.jetbrains.annotations.Nullable
    private final edu.vandy.app.preferences.Subscriber<T> subscriber = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences prefs = null;
    public java.lang.String actualName;
    
    public Preference(@org.jetbrains.annotations.NotNull
    T p0_772401952, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    edu.vandy.app.preferences.Adapter<T> adapter, @org.jetbrains.annotations.Nullable
    edu.vandy.app.preferences.Subscriber<T> subscriber) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final T getDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final edu.vandy.app.preferences.Adapter<T> getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final edu.vandy.app.preferences.Subscriber<T> getSubscriber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActualName() {
        return null;
    }
    
    public final void setActualName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void setValue(@org.jetbrains.annotations.Nullable
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull
    kotlin.reflect.KProperty<?> property, @org.jetbrains.annotations.NotNull
    T value) {
    }
    
    /**
     * Sets this shared preference instance to the specified [value].
     */
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void set(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    T value) {
    }
    
    /**
     * Clears the current value of this shared preference instance.
     */
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void clear(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
}