package edu.vandy.app.extensions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001\u001a\u0010\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f\u001aI\u0010\u0010\u001a\u00020\u0007*\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0015\u001aA\u0010\u0019\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u0015\u001aA\u0010\u0019\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u0015\u001aA\u0010\u001d\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u0015\u001aA\u0010\u001d\u001a\u00020\u0007*\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012#\b\u0002\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00070\u0015\u001a\n\u0010\u001e\u001a\u00020\u0007*\u00020\u001a\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\u00a8\u0006\u001f"}, d2 = {"IMAGE_VIEW_NO_PLACEHOLDER", "", "getIMAGE_VIEW_NO_PLACEHOLDER", "()I", "IMAGE_VIEW_PLACEHOLDER", "getIMAGE_VIEW_PLACEHOLDER", "checkPlacholder", "", "placeholder", "getImageBytes", "", "caching", "", "hasImageExtension", "url", "", "asyncFetchImage", "Landroid/content/Context;", "width", "height", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isImage", "asyncLoad", "Landroid/widget/ImageView;", "imageId", "status", "asyncLoadGif", "clear", "app_debug"})
public final class ImageExtKt {
    
    /**
     * Can be used to specify that no placeholder by used
     * by load functions. This is only for readability
     * because any value <= 0 will be interpreted as a
     * request to not use a placeholder.
     */
    private static final int IMAGE_VIEW_NO_PLACEHOLDER = -1;
    private static final int IMAGE_VIEW_PLACEHOLDER = 0;
    
    /**
     * Can be used to specify that no placeholder by used
     * by load functions. This is only for readability
     * because any value <= 0 will be interpreted as a
     * request to not use a placeholder.
     */
    public static final int getIMAGE_VIEW_NO_PLACEHOLDER() {
        return 0;
    }
    
    public static final int getIMAGE_VIEW_PLACEHOLDER() {
        return 0;
    }
    
    /**
     * Check for common image extensions.
     */
    public static final boolean hasImageExtension(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
        return false;
    }
    
    /**
     * Loads the gif resource identified by the resource id [imageId].
     * A gif placeholder [placeholder] can be specified. The download
     * requires the imageDownloader to be set to ImageDownloader.GLIDE.
     */
    public static final void asyncLoadGif(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$asyncLoadGif, int imageId, int placeholder, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    /**
     * Loads the gif resource identified by the URL path [url].
     * A gif placeholder [placeholder] can be specified. The download
     * requires the imageDownloader to be set to ImageDownloader.GLIDE.
     */
    public static final void asyncLoadGif(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$asyncLoadGif, @org.jetbrains.annotations.NotNull
    java.lang.String url, int placeholder, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    public static final void checkPlacholder(@kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    int placeholder) {
    }
    
    /**
     * Loads the image or gif (if [asGif] is true) resource identified by
     * the resource id [imageId]. A default placeholder [IMAGE_VIEW_PLACEHOLDER]
     * is used unless a custom [placeholder] value is specified. The download
     * is performed by the currently selected imageDownloader strategy.
     */
    public static final void asyncLoad(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$asyncLoad, int imageId, int placeholder, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    /**
     * Loads the image or gif (if [asGif] is true) from the specified [url].
     * A default placeholder [IMAGE_VIEW_PLACEHOLDER] is used unless a custom
     * [placeholder] value is specified. The download is performed by the
     * currently selected imageDownloader strategy.
     */
    public static final void asyncLoad(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$asyncLoad, @org.jetbrains.annotations.NotNull
    java.lang.String url, int placeholder, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    /**
     * Clears the image from the downloader cache.
     */
    public static final void clear(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$clear) {
    }
    
    /**
     * Asynchronously attempts to fetch an image and then calls [block]
     * in the the calling thread passing in the state of the fetch operation.
     */
    public static final void asyncFetchImage(@org.jetbrains.annotations.NotNull
    android.content.Context $this$asyncFetchImage, @org.jetbrains.annotations.NotNull
    java.lang.String url, int width, int height, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final byte[] getImageBytes(boolean caching) {
        return null;
    }
}