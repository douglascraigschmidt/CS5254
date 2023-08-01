package edu.vandy.app.extensions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a,\u0010\u0010\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u001a,\u0010\u0017\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\t\u001a.\u0010\b\u001a\u0002H\u0018\"\b\b\u0000\u0010\u0019*\u00020\u001a\"\u0010\b\u0001\u0010\u0018\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00190\u001b*\u00020\u001aH\u0086\b\u00a2\u0006\u0002\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010\b\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u001a\u0014\u0010\u001f\u001a\u00020\u0011*\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"LINEAR_OUT_SLOW_IN_INTERPOLATOR", "Landroidx/interpolator/view/animation/LinearOutSlowInInterpolator;", "getLINEAR_OUT_SLOW_IN_INTERPOLATOR", "()Landroidx/interpolator/view/animation/LinearOutSlowInInterpolator;", "SHOW_HIDE_ANIM_DURATION", "", "getSHOW_HIDE_ANIM_DURATION", "()J", "behavior", "Lkotlin/Function0;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getBehavior", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)Lkotlin/jvm/functions/Function0;", "setBehavior", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Lkotlin/jvm/functions/Function0;)V", "animateScale", "", "show", "", "anchorId", "", "block", "animateSlide", "T", "V", "Landroid/view/View;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "(Landroid/view/View;)Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "enableBehavior", "enable", "setAnchor", "app_debug"})
public final class FabExtKt {
    
    /**
     * FAB animation helper used for showing and hiding FAB that are
     * anchored to bottom sheets. This is necessary because the default
     * implementation of the BottomSheetBehaviour class always cancels
     * any FAB animation started by either the [show] or [hide] methods.
     *
     * The animation shows a resizing effect for the FAB receiver object
     * that adds resize animation to the normal FAB translation animation.
     */
    private static final long SHOW_HIDE_ANIM_DURATION = 300L;
    @org.jetbrains.annotations.NotNull
    private static final androidx.interpolator.view.animation.LinearOutSlowInInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = null;
    
    public static final void enableBehavior(@org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton $this$enableBehavior, @org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior behavior, boolean enable) {
    }
    
    public static final void setAnchor(@org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton $this$setAnchor, int anchorId) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final kotlin.jvm.functions.Function0<com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior> getBehavior(@org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton $this$behavior) {
        return null;
    }
    
    public static final void setBehavior(@org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton $this$behavior, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior> behavior) {
    }
    
    /**
     * FAB animation helper used for showing and hiding FAB that are
     * anchored to bottom sheets. This is necessary because the default
     * implementation of the BottomSheetBehaviour class always cancels
     * any FAB animation started by either the [show] or [hide] methods.
     *
     * The animation shows a resizing effect for the FAB receiver object
     * that adds resize animation to the normal FAB translation animation.
     */
    public static final long getSHOW_HIDE_ANIM_DURATION() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.interpolator.view.animation.LinearOutSlowInInterpolator getLINEAR_OUT_SLOW_IN_INTERPOLATOR() {
        return null;
    }
    
    public static final void animateScale(@org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton $this$animateScale, boolean show, @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    int anchorId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
    
    public static final void animateSlide(@org.jetbrains.annotations.NotNull
    com.google.android.material.floatingactionbutton.FloatingActionButton $this$animateSlide, boolean show, @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    int anchorId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> block) {
    }
}