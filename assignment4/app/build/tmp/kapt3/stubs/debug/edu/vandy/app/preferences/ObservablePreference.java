package edu.vandy.app.preferences;

/**
 * Can be used to observe shared preference changes as an alternative
 * to simply declaring a shared preference property using
 * "by Preference(...)".
 *
 * TODOx:
 * I really don't like using this class because it requires way too
 * much ceremony. Here is what it looks like using this class:
 *
 * <pre>{@code
 *  private val compositeUnsubscriber = CompositeUnsubscriber()
 *  private var crawlSpeed: Int by ObservablePreference(
 *    default = Settings.DEFAULT_CRAWL_SPEED,
 *    name = Settings.CRAWL_SPEED_PREF,
 *    subscriber = object : Subscriber<Int> {
 *    override val subscriber: (Int) -> Unit
 *      get() = {
 *        speedSeekBar?.progress = it
 *        viewModel.crawlSpeed = it
 *      }
 *
 *      override fun unsubscribe(callback: () -> Unit) {
 *        compositeUnsubscriber.add(callback)
 *      }
 *   })
 * }</pre>
 *
 * Since a class can't use reified type parameters, this class
 * is forced to redefine the preference get function without
 * using the inline/reified keywords. Also this means that
 * all complex objects require an adapter since gson is not able
 * to automatically determine the correct type adapter to use
 * when converting to/from JSON.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B5\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Ledu/vandy/app/preferences/ObservablePreference;", "T", "", "Ledu/vandy/app/preferences/Preference;", "default", "name", "", "adapter", "Ledu/vandy/app/preferences/Adapter;", "subscriber", "Ledu/vandy/app/preferences/Subscriber;", "(Ljava/lang/Object;Ljava/lang/String;Ledu/vandy/app/preferences/Adapter;Ledu/vandy/app/preferences/Subscriber;)V", "listener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "app_debug"})
public final class ObservablePreference<T extends java.lang.Object> extends edu.vandy.app.preferences.Preference<T> {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener listener = null;
    
    public ObservablePreference(@org.jetbrains.annotations.NotNull
    T p0_772401952, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    edu.vandy.app.preferences.Adapter<T> adapter, @org.jetbrains.annotations.NotNull
    edu.vandy.app.preferences.Subscriber<T> subscriber) {
        super(null, null, null, null);
    }
}