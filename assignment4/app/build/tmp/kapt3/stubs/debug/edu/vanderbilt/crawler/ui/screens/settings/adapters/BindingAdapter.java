package edu.vanderbilt.crawler.ui.screens.settings.adapters;

/**
 * An implementation of [BaseAdapter] which uses the new/forActivity pattern for its views.
 *
 * NOTE!!
 * Make sure that any implementation that uses this adapter that creates a set of widgets
 * of a given type, always assigns a unique ID to each widget. This will ensure that the
 * widget's default save/restore state handler will work as expected.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\'\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010\u0011J\'\u0010\u0012\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a2\u0006\u0002\u0010\u0011J\"\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\r\u001a\u00020\u000eH&\u00a2\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H&R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Ledu/vanderbilt/crawler/ui/screens/settings/adapters/BindingAdapter;", "T", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "inflater", "Landroid/view/LayoutInflater;", "bindDropDownView", "", "item", "position", "", "view", "Landroid/view/View;", "(Ljava/lang/Object;ILandroid/view/View;)V", "bindView", "getDropDownView", "container", "Landroid/view/ViewGroup;", "getItem", "(I)Ljava/lang/Object;", "getView", "newDropDownView", "newView", "app_debug"})
public abstract class BindingAdapter<T extends java.lang.Object> extends android.widget.BaseAdapter {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final android.view.LayoutInflater inflater = null;
    
    public BindingAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    /**
     * Returns the adapter item at [position].
     */
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public abstract T getItem(int position);
    
    /**
     * Create a new instance of a view for the specified position.
     */
    @org.jetbrains.annotations.NotNull
    public abstract android.view.View newView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, int position, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container);
    
    /**
     * Bind the data for the specified `position` to the view.
     */
    public abstract void bindView(@org.jetbrains.annotations.Nullable
    T item, int position, @org.jetbrains.annotations.NotNull
    android.view.View view);
    
    /**
     * Creates and binds a view. If a [view] is not null, then the
     * passed view is bound.
     */
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View getView(int position, @org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View getDropDownView(int position, @org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    /**
     * Create a new instance of a drop-down view for the specified position.
     */
    @org.jetbrains.annotations.NotNull
    public android.view.View newDropDownView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, int position, @org.jetbrains.annotations.NotNull
    android.view.ViewGroup container) {
        return null;
    }
    
    /**
     * Bind the data for the specified `position` to the drop-down view.
     */
    public void bindDropDownView(@org.jetbrains.annotations.Nullable
    T item, int position, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
}