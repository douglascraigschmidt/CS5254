package edu.vandy.app.extensions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00022!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u0004\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\n"}, d2 = {"openCloseListener", "", "Landroidx/drawerlayout/widget/DrawerLayout;", "onChange", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "state", "peekDrawer", "app_debug"})
public final class DrawerLayoutExtKt {
    
    /**
     * Tricky function that simulates a long-click near drawer
     * edge to force it to peek out for a short period of time.
     */
    public static final void peekDrawer(@org.jetbrains.annotations.NotNull
    androidx.drawerlayout.widget.DrawerLayout $this$peekDrawer) {
    }
    
    /**
     * Just calls the passed [onChange] function passing true if an open
     * event is received and false if a close event is received.
     */
    public static final void openCloseListener(@org.jetbrains.annotations.NotNull
    androidx.drawerlayout.widget.DrawerLayout $this$openCloseListener, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onChange) {
    }
}