package edu.vandy.app.ui.widgets;

/**
 * Toolbar interface with default handling of the
 * most common operations.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0016\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u0096\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Ledu/vandy/app/ui/widgets/ToolbarManager;", "", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "value", "", "toolbarTitle", "getToolbarTitle", "()Ljava/lang/String;", "setToolbarTitle", "(Ljava/lang/String;)V", "attachToScroll", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "createUpDrawable", "Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;", "enableHomeAsUp", "up", "Lkotlin/Function0;", "initToolbar", "app_debug"})
public abstract interface ToolbarManager {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.appcompat.widget.Toolbar getToolbar();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getToolbarTitle();
    
    public abstract void setToolbarTitle(@org.jetbrains.annotations.NotNull
    java.lang.String value);
    
    public abstract void initToolbar();
    
    public abstract void enableHomeAsUp(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> up);
    
    public abstract void attachToScroll(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView);
    
    /**
     * Toolbar interface with default handling of the
     * most common operations.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        public static java.lang.String getToolbarTitle(@org.jetbrains.annotations.NotNull
        edu.vandy.app.ui.widgets.ToolbarManager $this) {
            return null;
        }
        
        public static void setToolbarTitle(@org.jetbrains.annotations.NotNull
        edu.vandy.app.ui.widgets.ToolbarManager $this, @org.jetbrains.annotations.NotNull
        java.lang.String value) {
        }
        
        public static void initToolbar(@org.jetbrains.annotations.NotNull
        edu.vandy.app.ui.widgets.ToolbarManager $this) {
        }
        
        public static void enableHomeAsUp(@org.jetbrains.annotations.NotNull
        edu.vandy.app.ui.widgets.ToolbarManager $this, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function0<kotlin.Unit> up) {
        }
        
        private static androidx.appcompat.graphics.drawable.DrawerArrowDrawable createUpDrawable(edu.vandy.app.ui.widgets.ToolbarManager $this) {
            return null;
        }
        
        public static void attachToScroll(@org.jetbrains.annotations.NotNull
        edu.vandy.app.ui.widgets.ToolbarManager $this, @org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.RecyclerView recyclerView) {
        }
    }
}