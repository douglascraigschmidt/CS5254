package edu.vandy.app.preferences;

/**
 * Preference adapter class for Range<Int> required since
 * PreferenceObserver can't automatically handle complex objects.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a2\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u0011"}, d2 = {"Ledu/vandy/app/preferences/EnumAdapter;", "T", "", "Ledu/vandy/app/preferences/Adapter;", "enumType", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "enumConstants", "", "[Ljava/lang/Enum;", "decode", "string", "", "(Ljava/lang/String;)Ljava/lang/Enum;", "encode", "value", "(Ljava/lang/Enum;)Ljava/lang/String;", "app_debug"})
public class EnumAdapter<T extends java.lang.Enum<T>> implements edu.vandy.app.preferences.Adapter<T> {
    @org.jetbrains.annotations.NotNull
    private final T[] enumConstants = null;
    
    public EnumAdapter(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> enumType) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String encode(@org.jetbrains.annotations.NotNull
    T value) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public T decode(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
        return null;
    }
}