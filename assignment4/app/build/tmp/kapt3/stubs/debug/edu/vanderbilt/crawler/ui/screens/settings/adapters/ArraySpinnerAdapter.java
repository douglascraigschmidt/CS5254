package edu.vanderbilt.crawler.ui.screens.settings.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\'\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\fH\u0016J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0017\u0010\u0019\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0004\u00a2\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001eJ \u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010$\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\"\u001a\u00020#H\u0016R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Ledu/vanderbilt/crawler/ui/screens/settings/adapters/ArraySpinnerAdapter;", "T", "Ledu/vanderbilt/crawler/ui/screens/settings/adapters/BindingAdapter;", "context", "Landroid/content/Context;", "array", "", "showNull", "", "(Landroid/content/Context;[Ljava/lang/Object;Z)V", "[Ljava/lang/Object;", "nullOffset", "", "bindView", "", "item", "position", "view", "Landroid/view/View;", "(Ljava/lang/Object;ILandroid/view/View;)V", "getCount", "getItem", "(I)Ljava/lang/Object;", "getItemId", "", "getName", "", "(Ljava/lang/Object;)Ljava/lang/String;", "getPositionForValue", "value", "(Ljava/lang/Object;)Ljava/lang/Integer;", "newDropDownView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "newView", "app_debug"})
public class ArraySpinnerAdapter<T extends java.lang.Object> extends edu.vanderbilt.crawler.ui.screens.settings.adapters.BindingAdapter<T> {
    @org.jetbrains.annotations.NotNull
    private final T[] array = null;
    private final boolean showNull = false;
    private final int nullOffset = 0;
    
    @kotlin.jvm.JvmOverloads
    public ArraySpinnerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    T[] array, boolean showNull) {
        super(null);
    }
    
    @java.lang.Override
    public int getCount() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public T getItem(int position) {
        return null;
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View newView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, int position, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override
    public void bindView(@org.jetbrains.annotations.Nullable
    T item, int position, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View newDropDownView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, int position, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getName(@org.jetbrains.annotations.Nullable
    T item) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPositionForValue(T value) {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads
    public ArraySpinnerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    T[] array) {
        super(null);
    }
}