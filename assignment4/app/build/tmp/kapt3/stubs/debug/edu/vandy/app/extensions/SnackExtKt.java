package edu.vandy.app.extensions;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\u0010\r\u001a*\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\nH\u0086\b\u00a2\u0006\u0002\u0010\u0011\u001a+\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\b\u0014\u001a+\u0010\u0015\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\b\u0014\u001a5\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\b\u0014\u001a5\u0010\u0016\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\u0002\b\u0014\"\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0018"}, d2 = {"contentView", "Landroid/view/View;", "Landroid/app/Activity;", "getContentView", "(Landroid/app/Activity;)Landroid/view/View;", "action", "", "Lcom/google/android/material/snackbar/Snackbar;", "", "color", "", "listener", "Lkotlin/Function1;", "(Lcom/google/android/material/snackbar/Snackbar;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "findOptional", "T", "id", "(Landroid/app/Activity;I)Landroid/view/View;", "longSnack", "message", "Lkotlin/ExtensionFunctionType;", "shortSnack", "snack", "length", "app_debug"})
public final class SnackExtKt {
    
    /**
     * Extensions for displaying Snackbar.
     */
    public static final void snack(@org.jetbrains.annotations.NotNull
    android.view.View $this$snack, @org.jetbrains.annotations.NotNull
    java.lang.String message, int length, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.android.material.snackbar.Snackbar, kotlin.Unit> action) {
    }
    
    public static final void action(@org.jetbrains.annotations.NotNull
    com.google.android.material.snackbar.Snackbar $this$action, @org.jetbrains.annotations.NotNull
    java.lang.String action, @org.jetbrains.annotations.Nullable
    java.lang.Integer color, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> listener) {
    }
    
    public static final void shortSnack(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$shortSnack, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.android.material.snackbar.Snackbar, kotlin.Unit> action) {
    }
    
    public static final void longSnack(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$longSnack, @org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.android.material.snackbar.Snackbar, kotlin.Unit> action) {
    }
    
    public static final void snack(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$snack, @org.jetbrains.annotations.NotNull
    java.lang.String message, int length, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.google.android.material.snackbar.Snackbar, kotlin.Unit> action) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final android.view.View getContentView(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$contentView) {
        return null;
    }
}