package edu.vandy.app.extensions;

/**
 * Image downloader singleton that manages Picasso and Glide
 * cache access. It also uses a shared preference that can
 * be exposed in the UI to choose between either downloader.
 * View extensions are included that provide asynchronous
 * download extension functions.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u0015R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Ledu/vandy/app/extensions/ImageDownloader;", "", "()V", "<set-?>", "Ledu/vandy/app/extensions/ImageDownloader$Type;", "type", "getType", "()Ledu/vandy/app/extensions/ImageDownloader$Type;", "setType", "(Ledu/vandy/app/extensions/ImageDownloader$Type;)V", "type$delegate", "Ledu/vandy/app/preferences/ObservablePreference;", "clearCache", "", "deleteContents", "dir", "Ljava/io/File;", "deleteRecursive", "fileOrDirectory", "installPicasso", "context", "Landroid/content/Context;", "Type", "app_debug"})
public final class ImageDownloader {
    
    /**
     * Current strategy used for downloading images.
     */
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.ObservablePreference type$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.extensions.ImageDownloader INSTANCE = null;
    
    private ImageDownloader() {
        super();
    }
    
    public final void installPicasso(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    /**
     * Current strategy used for downloading images.
     */
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.extensions.ImageDownloader.Type getType() {
        return null;
    }
    
    /**
     * Current strategy used for downloading images.
     */
    public final void setType(@org.jetbrains.annotations.NotNull
    edu.vandy.app.extensions.ImageDownloader.Type p0) {
    }
    
    /**
     * Clears the current downloader cache.
     */
    public final void clearCache() {
    }
    
    /**
     * Recursively delete contents of [dir].
     */
    private final void deleteContents(java.io.File dir) {
    }
    
    /**
     * Recursively delete [fileOrDirectory].
     */
    private final void deleteRecursive(java.io.File fileOrDirectory) {
    }
    
    /**
     * Download managers.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Ledu/vandy/app/extensions/ImageDownloader$Type;", "", "(Ljava/lang/String;I)V", "PICASSO", "GLIDE", "app_debug"})
    public static enum Type {
        /*public static final*/ PICASSO /* = new PICASSO() */,
        /*public static final*/ GLIDE /* = new GLIDE() */;
        
        Type() {
        }
    }
}