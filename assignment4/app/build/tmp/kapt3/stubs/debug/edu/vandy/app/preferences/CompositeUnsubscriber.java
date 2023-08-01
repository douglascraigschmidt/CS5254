package edu.vandy.app.preferences;

/**
 * Keeps tracks of a collection of unsubscribe handlers which
 * are invoked when when this composite unsubscriber is invoked.
 * Currently, this class is only used to remove shared preference
 * listeners when an activity is being destroyed.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Ledu/vandy/app/preferences/CompositeUnsubscriber;", "", "()V", "invoked", "", "unsubscribers", "", "Lkotlin/Function0;", "", "add", "unsubscriber", "invoke", "app_debug"})
public final class CompositeUnsubscriber {
    @org.jetbrains.annotations.NotNull
    private final java.util.Collection<kotlin.jvm.functions.Function0<kotlin.Unit>> unsubscribers = null;
    private boolean invoked = false;
    
    public CompositeUnsubscriber() {
        super();
    }
    
    public final boolean add(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> unsubscriber) {
        return false;
    }
    
    public final void invoke() {
    }
}