package edu.vandy.app.extensions;

/**
 * Custom Picasso singleton so that the rest of the app
 * can use Picasso.with(context) as if using the normal
 * Picasso singleton. Files should only import this class
 * and not the real com.squareup.picasso.Picasso otherwise
 * two picasso instances will exist and possibly produce
 * unstable results.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Ledu/vandy/app/extensions/Picasso;", "", "()V", "clearCache", "", "with", "Lcom/squareup/picasso/Picasso;", "context", "Landroid/content/Context;", "app_debug"})
public final class Picasso {
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.extensions.Picasso INSTANCE = null;
    
    private Picasso() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.squareup.picasso.Picasso with(@kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void clearCache() {
    }
}