package edu.vandy.app.preferences;

/**
 * Shared preferences object that supports [] style access and
 * returns sensible default values when no default is specified.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010J.\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\u0006\b\u0000\u0010\u0015\u0018\u00012\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0018H\u0086\b\u00a2\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u001b\u001a\u00020\u0012\"\u0006\b\u0000\u0010\u0015\u0018\u00012\u0006\u0010\u001c\u001a\u0002H\u0015H\u0086\b\u00a2\u0006\u0002\u0010\u001dJ$\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\u0006\b\u0000\u0010\u0015\u0018\u0001*\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0012H\u0086\b\u00a2\u0006\u0002\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006 "}, d2 = {"Ledu/vandy/app/preferences/PreferenceProvider;", "", "()V", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "setPrefs", "(Landroid/content/SharedPreferences;)V", "addListener", "", "listener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "clear", "custom", "context", "Landroid/content/Context;", "name", "", "default", "fromJson", "T", "json", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "removeListener", "toJson", "value", "(Ljava/lang/Object;)Ljava/lang/String;", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "app_debug"})
public final class PreferenceProvider {
    @org.jetbrains.annotations.NotNull
    private static android.content.SharedPreferences prefs;
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.preferences.PreferenceProvider INSTANCE = null;
    
    private PreferenceProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences p0) {
    }
    
    /**
     * Custom preferences is not currently used.
     */
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences custom(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    /**
     * Registers the passed [listener] to receive
     * shared preference changes notifications.
     */
    public final void addListener(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
    
    /**
     * Unregisters the passed [listener] from receiving
     * shared preference change notifications.
     */
    public final void removeListener(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
    
    /**
     * Clears all preferences stored with this provider.
     */
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void clear() {
    }
}