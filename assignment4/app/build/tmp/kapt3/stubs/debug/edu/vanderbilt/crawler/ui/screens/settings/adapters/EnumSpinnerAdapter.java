package edu.vanderbilt.crawler.ui.screens.settings.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Ledu/vanderbilt/crawler/ui/screens/settings/adapters/EnumSpinnerAdapter;", "T", "", "Ledu/vanderbilt/crawler/ui/screens/settings/adapters/ArraySpinnerAdapter;", "context", "Landroid/content/Context;", "enumType", "Ljava/lang/Class;", "showNull", "", "(Landroid/content/Context;Ljava/lang/Class;Z)V", "app_debug"})
public class EnumSpinnerAdapter<T extends java.lang.Enum<T>> extends edu.vanderbilt.crawler.ui.screens.settings.adapters.ArraySpinnerAdapter<T> {
    
    @kotlin.jvm.JvmOverloads
    public EnumSpinnerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> enumType, boolean showNull) {
        super(null, null, false);
    }
    
    @kotlin.jvm.JvmOverloads
    public EnumSpinnerAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> enumType) {
        super(null, null, false);
    }
}