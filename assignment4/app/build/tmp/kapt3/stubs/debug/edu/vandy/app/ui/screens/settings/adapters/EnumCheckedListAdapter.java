package edu.vandy.app.ui.screens.settings.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\'\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\u0017\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0017\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0014\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011H\u0014J \u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J \u0010\'\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Ledu/vandy/app/ui/screens/settings/adapters/EnumCheckedListAdapter;", "T", "", "Ledu/vanderbilt/crawler/ui/screens/settings/adapters/BindingAdapter;", "context", "Landroid/content/Context;", "enumType", "Ljava/lang/Class;", "checkedList", "", "", "showNull", "(Landroid/content/Context;Ljava/lang/Class;Ljava/util/List;Z)V", "enumConstants", "", "[Ljava/lang/Enum;", "nullOffset", "", "bindView", "", "item", "position", "view", "Landroid/view/View;", "(Ljava/lang/Enum;ILandroid/view/View;)V", "getCount", "getItem", "(I)Ljava/lang/Enum;", "getItemId", "", "getName", "", "(Ljava/lang/Enum;)Ljava/lang/String;", "isChecked", "newDropDownView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "newView", "app_debug"})
public class EnumCheckedListAdapter<T extends java.lang.Enum<T>> extends edu.vanderbilt.crawler.ui.screens.settings.adapters.BindingAdapter<T> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Boolean> checkedList = null;
    private final boolean showNull = false;
    @org.jetbrains.annotations.NotNull
    private final T[] enumConstants = null;
    private final int nullOffset = 0;
    
    public EnumCheckedListAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> enumType, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Boolean> checkedList, boolean showNull) {
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
    protected java.lang.String getName(@org.jetbrains.annotations.Nullable
    T item) {
        return null;
    }
    
    protected boolean isChecked(int position) {
        return false;
    }
}