package edu.vandy.app.preferences;

/**
 * Adapter interface to support custom encoding and decoding
 * an object of type [T] to and from a String.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2 = {"Ledu/vandy/app/preferences/Adapter;", "T", "", "decode", "string", "", "(Ljava/lang/String;)Ljava/lang/Object;", "encode", "value", "(Ljava/lang/Object;)Ljava/lang/String;", "app_debug"})
public abstract interface Adapter<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String encode(T value);
    
    @org.jetbrains.annotations.Nullable
    public abstract T decode(@org.jetbrains.annotations.NotNull
    java.lang.String string);
}