package edu.vandy.app.preferences;

/**
 * A single preference entry that maps a key to a default value and
 * provides an optional adapter and optional subscriber.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Ledu/vandy/app/preferences/PreferenceEntry;", "T", "", "key", "", "value", "adapter", "Ledu/vandy/app/preferences/Adapter;", "subscriber", "Ledu/vandy/app/preferences/Subscriber;", "(Ljava/lang/String;Ljava/lang/Object;Ledu/vandy/app/preferences/Adapter;Ledu/vandy/app/preferences/Subscriber;)V", "getAdapter", "()Ledu/vandy/app/preferences/Adapter;", "getKey", "()Ljava/lang/String;", "getSubscriber", "()Ledu/vandy/app/preferences/Subscriber;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_debug"})
public final class PreferenceEntry<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String key = null;
    private final T value = null;
    @org.jetbrains.annotations.Nullable
    private final edu.vandy.app.preferences.Adapter<T> adapter = null;
    @org.jetbrains.annotations.Nullable
    private final edu.vandy.app.preferences.Subscriber<T> subscriber = null;
    
    public PreferenceEntry(@org.jetbrains.annotations.NotNull
    java.lang.String key, T value, @org.jetbrains.annotations.Nullable
    edu.vandy.app.preferences.Adapter<T> adapter, @org.jetbrains.annotations.Nullable
    edu.vandy.app.preferences.Subscriber<T> subscriber) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return null;
    }
    
    public final T getValue() {
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
}