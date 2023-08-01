package edu.vandy.app.ui.widgets;

/**
 * A circular loader is integrated with a floating action button.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0002&\'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\f\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015J2\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014J(\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0014J\u0012\u0010\"\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Ledu/vandy/app/ui/widgets/ProgressFab;", "Landroid/widget/FrameLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$AttachedBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "animState", "", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "progressBar", "Landroid/widget/ProgressBar;", "ringSize", "ensureChildrenExist", "", "getBehavior", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "hide", "runAfter", "Lkotlin/Function0;", "measureChildWithMargins", "child", "Landroid/view/View;", "parentWidthMeasureSpec", "widthUsed", "parentHeightMeasureSpec", "heightUsed", "onSizeChanged", "w", "h", "oldw", "oldh", "onViewAdded", "shouldAnimateVisibilityChange", "", "show", "Behavior", "Companion", "app_debug"})
public final class ProgressFab extends android.widget.FrameLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.interpolator.view.animation.FastOutLinearInInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = null;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_SHOWING = 2;
    private int animState;
    @org.jetbrains.annotations.Nullable
    private android.widget.ProgressBar progressBar;
    @org.jetbrains.annotations.Nullable
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    private int ringSize;
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.ui.widgets.ProgressFab.Companion Companion = null;
    
    public ProgressFab(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<?> getBehavior() {
        return null;
    }
    
    @java.lang.Override
    public void onViewAdded(@org.jetbrains.annotations.Nullable
    android.view.View child) {
    }
    
    @java.lang.Override
    protected void measureChildWithMargins(@org.jetbrains.annotations.Nullable
    android.view.View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
    }
    
    @java.lang.Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    private final void ensureChildrenExist() {
    }
    
    private final boolean shouldAnimateVisibilityChange() {
        return false;
    }
    
    public final void hide(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> runAfter) {
    }
    
    public final void show(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> runAfter) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0002J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0002\u00a8\u0006\u0017"}, d2 = {"Ledu/vandy/app/ui/widgets/ProgressFab$Behavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Ledu/vandy/app/ui/widgets/ProgressFab;", "()V", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isBottomSheet", "", "view", "Landroid/view/View;", "isSnackBar", "layoutDependsOn", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "dependency", "onBottomSheetChanged", "", "onDependentViewChanged", "onSnackbarChanged", "app_debug"})
    public static final class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<edu.vandy.app.ui.widgets.ProgressFab> {
        
        public Behavior() {
            super();
        }
        
        public Behavior(@org.jetbrains.annotations.Nullable
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.util.AttributeSet attrs) {
            super();
        }
        
        @java.lang.Override
        public boolean layoutDependsOn(@org.jetbrains.annotations.NotNull
        androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull
        edu.vandy.app.ui.widgets.ProgressFab child, @org.jetbrains.annotations.NotNull
        android.view.View dependency) {
            return false;
        }
        
        @java.lang.Override
        public boolean onDependentViewChanged(@org.jetbrains.annotations.NotNull
        androidx.coordinatorlayout.widget.CoordinatorLayout parent, @org.jetbrains.annotations.NotNull
        edu.vandy.app.ui.widgets.ProgressFab child, @org.jetbrains.annotations.NotNull
        android.view.View dependency) {
            return false;
        }
        
        /**
         * Bottom sheet calculation uses absolute position values to
         * determine the FAB offset. This calculation is NOT generic
         * and is intended to only work for bottom sheet used in this
         * ImageCrawler application.
         */
        private final void onBottomSheetChanged(androidx.coordinatorlayout.widget.CoordinatorLayout parent, edu.vandy.app.ui.widgets.ProgressFab child, android.view.View dependency) {
        }
        
        /**
         * Snack bar calculation uses y translation value of Snackbar to
         * determine FAB offset.
         */
        private final void onSnackbarChanged(edu.vandy.app.ui.widgets.ProgressFab child, android.view.View dependency) {
        }
        
        private final boolean isBottomSheet(android.view.View view) {
            return false;
        }
        
        private final boolean isSnackBar(android.view.View view) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Ledu/vandy/app/ui/widgets/ProgressFab$Companion;", "", "()V", "ANIM_STATE_HIDING", "", "getANIM_STATE_HIDING", "()I", "ANIM_STATE_NONE", "getANIM_STATE_NONE", "ANIM_STATE_SHOWING", "getANIM_STATE_SHOWING", "FAST_OUT_LINEAR_IN_INTERPOLATOR", "Landroidx/interpolator/view/animation/FastOutLinearInInterpolator;", "getFAST_OUT_LINEAR_IN_INTERPOLATOR", "()Landroidx/interpolator/view/animation/FastOutLinearInInterpolator;", "NAME", "", "getNAME", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNAME() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.interpolator.view.animation.FastOutLinearInInterpolator getFAST_OUT_LINEAR_IN_INTERPOLATOR() {
            return null;
        }
        
        public final int getANIM_STATE_NONE() {
            return 0;
        }
        
        public final int getANIM_STATE_HIDING() {
            return 0;
        }
        
        public final int getANIM_STATE_SHOWING() {
            return 0;
        }
    }
}