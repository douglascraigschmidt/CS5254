package edu.vandy.app.extensions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001e\u0010\b\u001a\u00020\t*\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f\u001a\u0012\u0010\r\u001a\u00020\t*\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001a\n\u0010\u0010\u001a\u00020\t*\u00020\u0003\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"state", "", "bottomSheetState", "Landroid/view/View;", "getBottomSheetState", "(Landroid/view/View;)I", "setBottomSheetState", "(Landroid/view/View;I)V", "peekBottomSheet", "", "peekHeight", "peekTime", "", "showBottomSheet", "show", "", "toggleBottomSheetVisibility", "app_debug"})
public final class BottomSheetViewKt {
    
    public static final int getBottomSheetState(@org.jetbrains.annotations.NotNull
    android.view.View $this$bottomSheetState) {
        return 0;
    }
    
    public static final void setBottomSheetState(@org.jetbrains.annotations.NotNull
    android.view.View $this$bottomSheetState, int state) {
    }
    
    /**
     * Shows or hides a BottomSheet style view by
     * settings it's BottomSheetBehavior state.
     */
    public static final void showBottomSheet(@org.jetbrains.annotations.NotNull
    android.view.View $this$showBottomSheet, boolean show) {
    }
    
    /**
     * Toggles the visibility state of a bottom sheet style
     * view setting it's BottomSheet state.
     */
    public static final void toggleBottomSheetVisibility(@org.jetbrains.annotations.NotNull
    android.view.View $this$toggleBottomSheetVisibility) {
    }
    
    /**
     * Peeks a bottom sheet for the specified [peekTime] millisecond
     * value using the optional [peekHeight] distance. If [peekHeight]
     * is not specified, the BottomSheetBehavior's default peek
     * height will be used. If [peekTime] is not specified, a default
     * value of 1500 milliseconds is used.
     */
    public static final void peekBottomSheet(@org.jetbrains.annotations.NotNull
    android.view.View $this$peekBottomSheet, int peekHeight, long peekTime) {
    }
}