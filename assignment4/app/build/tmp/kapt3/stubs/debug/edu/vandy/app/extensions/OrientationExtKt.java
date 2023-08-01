package edu.vandy.app.extensions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001a\u00109\u001a\u00020\t*\u00020\t2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007\u001a\u001a\u0010<\u001a\u00020\t*\u00020\t2\u0006\u00100\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007\u001a\u001a\u0010=\u001a\u00020\t*\u00020\t2\u0006\u00100\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007\u001a\u001a\u0010>\u001a\u00020\u0010*\u00020\u00102\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@\"\u0011\u0010\u0000\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"(\u0010\b\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"\u0015\u0010\u000e\u001a\u00020\u0007*\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\u0007*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\"\u0015\u0010\u000e\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013\"\u0015\u0010\u000e\u001a\u00020\u0007*\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0015\"(\u0010\u0016\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r\"\u0015\u0010\u0019\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013\"\u0015\u0010\u001b\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013\"\u0015\u0010\u001d\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013\"\u0015\u0010\u001f\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0013\"\u0015\u0010!\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0013\"\u0015\u0010#\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0013\"\u0015\u0010%\u001a\u00020\u0001*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'\"(\u0010(\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u000b\"\u0004\b*\u0010\r\"(\u0010+\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\r\"\u0015\u0010.\u001a\u00020\u0007*\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u000b\"\u0015\u0010.\u001a\u00020\u0007*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0011\"\u0015\u0010.\u001a\u00020\u0007*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0013\"\u0015\u0010.\u001a\u00020\u0007*\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\b/\u0010\u0015\"(\u00100\u001a\u00020\u0007*\u0002012\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105\"(\u00106\u001a\u00020\u0007*\u0002012\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00105\u00a8\u0006B"}, d2 = {"landscape", "", "getLandscape", "()Z", "portrait", "getPortrait", "oValue", "", "oBottom", "Landroid/graphics/Rect;", "getOBottom", "(Landroid/graphics/Rect;)I", "setOBottom", "(Landroid/graphics/Rect;I)V", "oHeight", "getOHeight", "Landroid/util/Size;", "(Landroid/util/Size;)I", "Landroid/view/View;", "(Landroid/view/View;)I", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)I", "oLeft", "getOLeft", "setOLeft", "oPaddingBottom", "getOPaddingBottom", "oPaddingEnd", "getOPaddingEnd", "oPaddingLeft", "getOPaddingLeft", "oPaddingRight", "getOPaddingRight", "oPaddingStart", "getOPaddingStart", "oPaddingTop", "getOPaddingTop", "oRealized", "getORealized", "(Landroid/view/View;)Z", "oRight", "getORight", "setORight", "oTop", "getOTop", "setOTop", "oWidth", "getOWidth", "oX", "Landroid/graphics/Point;", "getOX", "(Landroid/graphics/Point;)I", "setOX", "(Landroid/graphics/Point;I)V", "oY", "getOY", "setOY", "oInset", "oDx", "oDy", "oOffset", "oOffsetTo", "oScale", "scaleX", "", "scaleY", "app_debug"})
public final class OrientationExtKt {
    
    public static final boolean getPortrait() {
        return false;
    }
    
    public static final boolean getLandscape() {
        return false;
    }
    
    public static final int getOWidth(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oWidth) {
        return 0;
    }
    
    public static final int getOHeight(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oHeight) {
        return 0;
    }
    
    public static final int getOTop(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oTop) {
        return 0;
    }
    
    public static final void setOTop(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oTop, int oValue) {
    }
    
    public static final int getOBottom(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oBottom) {
        return 0;
    }
    
    public static final void setOBottom(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oBottom, int oValue) {
    }
    
    public static final int getOLeft(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oLeft) {
        return 0;
    }
    
    public static final void setOLeft(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oLeft, int oValue) {
    }
    
    public static final int getORight(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oRight) {
        return 0;
    }
    
    public static final void setORight(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oRight, int oValue) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect oOffset(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oOffset, int oX, int oY) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect oOffsetTo(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oOffsetTo, int oX, int oY) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Rect oInset(@org.jetbrains.annotations.NotNull
    android.graphics.Rect $this$oInset, int oDx, int oDy) {
        return null;
    }
    
    public static final int getOWidth(@org.jetbrains.annotations.NotNull
    android.util.Size $this$oWidth) {
        return 0;
    }
    
    public static final int getOHeight(@org.jetbrains.annotations.NotNull
    android.util.Size $this$oHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final android.util.Size oScale(@org.jetbrains.annotations.NotNull
    android.util.Size $this$oScale, float scaleX, float scaleY) {
        return null;
    }
    
    public static final int getOX(@org.jetbrains.annotations.NotNull
    android.graphics.Point $this$oX) {
        return 0;
    }
    
    public static final void setOX(@org.jetbrains.annotations.NotNull
    android.graphics.Point $this$oX, int oValue) {
    }
    
    public static final int getOY(@org.jetbrains.annotations.NotNull
    android.graphics.Point $this$oY) {
        return 0;
    }
    
    public static final void setOY(@org.jetbrains.annotations.NotNull
    android.graphics.Point $this$oY, int oValue) {
    }
    
    public static final int getOWidth(@org.jetbrains.annotations.NotNull
    android.view.View $this$oWidth) {
        return 0;
    }
    
    public static final int getOHeight(@org.jetbrains.annotations.NotNull
    android.view.View $this$oHeight) {
        return 0;
    }
    
    public static final boolean getORealized(@org.jetbrains.annotations.NotNull
    android.view.View $this$oRealized) {
        return false;
    }
    
    public static final int getOWidth(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup $this$oWidth) {
        return 0;
    }
    
    public static final int getOHeight(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup $this$oHeight) {
        return 0;
    }
    
    public static final int getOPaddingStart(@org.jetbrains.annotations.NotNull
    android.view.View $this$oPaddingStart) {
        return 0;
    }
    
    public static final int getOPaddingEnd(@org.jetbrains.annotations.NotNull
    android.view.View $this$oPaddingEnd) {
        return 0;
    }
    
    public static final int getOPaddingLeft(@org.jetbrains.annotations.NotNull
    android.view.View $this$oPaddingLeft) {
        return 0;
    }
    
    public static final int getOPaddingRight(@org.jetbrains.annotations.NotNull
    android.view.View $this$oPaddingRight) {
        return 0;
    }
    
    public static final int getOPaddingTop(@org.jetbrains.annotations.NotNull
    android.view.View $this$oPaddingTop) {
        return 0;
    }
    
    public static final int getOPaddingBottom(@org.jetbrains.annotations.NotNull
    android.view.View $this$oPaddingBottom) {
        return 0;
    }
}