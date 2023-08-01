package edu.vandy.app.extensions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0012\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002\u001a\u0012\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002\u001a\u001a\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a\"\u0010\u000f\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013\u001a\n\u0010\u0017\u001a\u00020\u0002*\u00020\u0013\u001a\n\u0010\u0018\u001a\u00020\u0013*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0004\u00a8\u0006\u0019"}, d2 = {"bottomLeft", "Landroid/graphics/Point;", "Landroid/graphics/Rect;", "getBottomLeft", "(Landroid/graphics/Rect;)Landroid/graphics/Point;", "bottomRight", "getBottomRight", "topLeft", "getTopLeft", "topRight", "getTopRight", "centerFit", "bounds", "centerHorizontally", "centerInside", "set", "", "point", "size", "Landroid/util/Size;", "left", "", "top", "toRect", "toSize", "app_debug"})
public final class RectExtKt {
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point getTopLeft(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$topLeft) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point getTopRight(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$topRight) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point getBottomLeft(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$bottomLeft) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Point getBottomRight(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$bottomRight) {
        return null;
    }
    
    /**
     * Rect extension to center fit a rectangle in
     * the specified [bounds] rectangle.
     */
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect centerFit(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$centerFit, @org.jetbrains.annotations.NotNull
    android.graphics.Rect bounds) {
        return null;
    }
    
    /**
     * Rect extension to center fit a rectangle in
     * the specified [bounds] rectangle.
     */
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect centerInside(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$centerInside, @org.jetbrains.annotations.NotNull
    android.graphics.Rect bounds) {
        return null;
    }
    
    /**
     * Rect extension to center fit a rectangle in
     * the specified [bounds] rectangle.
     */
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect centerHorizontally(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$centerHorizontally, @org.jetbrains.annotations.NotNull
    android.graphics.Rect bounds) {
        return null;
    }
    
    /**
     * @return A [Size] with set to the width and height of the receiver [Rect].
     */
    @org.jetbrains.annotations.NotNull
    public static final android.util.Size toSize(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$toSize) {
        return null;
    }
    
    /**
     * @return A [Rect] with [Rect.right]set to the [Size] receiver
     * width and [Rect.bottom] set to [Size] receiver height.
     */
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect toRect(@org.jetbrains.annotations.NotNull
    android.util.Size $this$toRect) {
        return null;
    }
    
    /**
     * Convenience function that initialize the receiver [Rect]
     * top left coordinates to the passed [point] and width and
     * height from the passed [size].
     */
    public static final void set(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$set, @org.jetbrains.annotations.NotNull
    android.graphics.Point point, @org.jetbrains.annotations.NotNull
    android.util.Size size) {
    }
    
    /**
     * Convenience function that initialize the receiver [Rect]
     * using [top] [left] coordinate and a passed [size].
     */
    public static final void set(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$set, int left, int top, @org.jetbrains.annotations.NotNull
    android.util.Size size) {
    }
}