package edu.vandy.app.preferences;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&R\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Ledu/vandy/app/preferences/Subscriber;", "T", "", "subscriber", "Lkotlin/Function1;", "", "getSubscriber", "()Lkotlin/jvm/functions/Function1;", "unsubscribe", "callback", "Lkotlin/Function0;", "app_debug"})
public abstract interface Subscriber<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.jvm.functions.Function1<T, kotlin.Unit> getSubscriber();
    
    public abstract void unsubscribe(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> callback);
}