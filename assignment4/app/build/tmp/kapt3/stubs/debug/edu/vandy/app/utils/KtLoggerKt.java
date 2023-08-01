package edu.vandy.app.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0015\u0010\u0007\u001a\u00020\b\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\nH\u0086\b\u001a\u0012\u0010\u0007\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u000e2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0002\u001a\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0001H\u0086\b\u001ag\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u00012\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00140\u001a2\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u001cH\u0082\b\u001a \u0010\u001d\u001a\u00020\u0014*\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0086\b\u00f8\u0001\u0000\u001a \u0010\u001d\u001a\u00020\u0014*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u001a \u0010\u001f\u001a\u00020\u0014*\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0086\b\u00f8\u0001\u0000\u001a \u0010\u001f\u001a\u00020\u0014*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u001a\r\u0010 \u001a\u00020\u000e*\u00020\u0018H\u0086\b\u001a \u0010!\u001a\u00020\u0014*\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0086\b\u00f8\u0001\u0000\u001a \u0010!\u001a\u00020\u0014*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u001a \u0010\"\u001a\u00020\u0014*\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0086\b\u00f8\u0001\u0000\u001a \u0010\"\u001a\u00020\u0014*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u001a \u0010#\u001a\u00020\u0014*\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0086\b\u00f8\u0001\u0000\u001a \u0010#\u001a\u00020\u0014*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u001a \u0010$\u001a\u00020\u0014*\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\"\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006%"}, d2 = {"globalLogLevel", "", "getGlobalLogLevel", "()Ljava/lang/Integer;", "setGlobalLogLevel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "KtLogger", "Ledu/vandy/app/utils/KtLogger;", "T", "", "clazz", "Ljava/lang/Class;", "tag", "", "getTag", "isLoggable", "", "level", "log", "", "logger", "message", "thr", "", "f", "Lkotlin/Function2;", "fThrowable", "Lkotlin/Function3;", "debug", "Lkotlin/Function0;", "error", "getStackTraceString", "info", "verbose", "warn", "wtf", "app_debug"})
@kotlin.Suppress(names = {"NAME_SHADOWING", "NOTHING_TO_INLINE"})
public final class KtLoggerKt {
    @org.jetbrains.annotations.Nullable
    private static java.lang.Integer globalLogLevel;
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer getGlobalLogLevel() {
        return null;
    }
    
    public static final void setGlobalLogLevel(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    public static final boolean isLoggable(@org.jetbrains.annotations.NotNull
    java.lang.String tag, int level) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.KtLogger KtLogger(@org.jetbrains.annotations.NotNull
    java.lang.Class<?> clazz) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.KtLogger KtLogger(@org.jetbrains.annotations.NotNull
    java.lang.String tag) {
        return null;
    }
    
    /**
     * Send a log message with the [Log.VERBOSE] severity.
     * Note that the log message will not be written if the current log level is above [Log.VERBOSE].
     * The default log level is [Log.INFO].
     *
     * @param message the message text to log. `null` value will be represent as "null", for any other value
     *  the [Any.toString] will be invoked.
     * @param thr an exception to log (optional).
     *
     * @see [Log.v].
     */
    public static final void verbose(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$verbose, @org.jetbrains.annotations.Nullable
    java.lang.Object message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable thr) {
    }
    
    /**
     * Send a log message with the [Log.DEBUG] severity.
     * Note that the log message will not be written if the current log level is above [Log.DEBUG].
     * The default log level is [Log.INFO].
     *
     * @param message the message text to log. `null` value will be represent as "null", for any other value
     *  the [Any.toString] will be invoked.
     * @param thr an exception to log (optional).
     *
     * @see [Log.d].
     */
    public static final void debug(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$debug, @org.jetbrains.annotations.Nullable
    java.lang.Object message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable thr) {
    }
    
    /**
     * Send a log message with the [Log.INFO] severity.
     * Note that the log message will not be written if the current log level is above [Log.INFO]
     *  (it is the default level).
     *
     * @param message the message text to log. `null` value will be represent as "null", for any other value
     *  the [Any.toString] will be invoked.
     * @param thr an exception to log (optional).
     *
     * @see [Log.i].
     */
    public static final void info(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$info, @org.jetbrains.annotations.Nullable
    java.lang.Object message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable thr) {
    }
    
    /**
     * Send a log message with the [Log.WARN] severity.
     * Note that the log message will not be written if the current log level is above [Log.WARN].
     * The default log level is [Log.INFO].
     *
     * @param message the message text to log. `null` value will be represent as "null", for any other value
     *  the [Any.toString] will be invoked.
     * @param thr an exception to log (optional).
     *
     * @see [Log.w].
     */
    public static final void warn(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$warn, @org.jetbrains.annotations.Nullable
    java.lang.Object message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable thr) {
    }
    
    /**
     * Send a log message with the [Log.ERROR] severity.
     * Note that the log message will not be written if the current log level is above [Log.ERROR].
     * The default log level is [Log.INFO].
     *
     * @param message the message text to log. `null` value will be represent as "null", for any other value
     *  the [Any.toString] will be invoked.
     * @param thr an exception to log (optional).
     *
     * @see [Log.e].
     */
    public static final void error(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$error, @org.jetbrains.annotations.Nullable
    java.lang.Object message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable thr) {
    }
    
    /**
     * Send a log message with the "What a Terrible Failure" severity.
     * Report an exception that should never happen.
     *
     * @param message the message text to log. `null` value will be represent as "null", for any other value
     *  the [Any.toString] will be invoked.
     * @param thr an exception to log (optional).
     *
     * @see [Log.wtf].
     */
    public static final void wtf(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$wtf, @org.jetbrains.annotations.Nullable
    java.lang.Object message, @org.jetbrains.annotations.Nullable
    java.lang.Throwable thr) {
    }
    
    /**
     * Send a log message with the [Log.VERBOSE] severity.
     * Note that the log message will not be written if the current log level is above [Log.VERBOSE].
     * The default log level is [Log.INFO].
     *
     * @param message the function that returns message text to log.
     *  `null` value will be represent as "null", for any other value the [Any.toString] will be invoked.
     *
     * @see [Log.v].
     */
    public static final void verbose(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$verbose, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends java.lang.Object> message) {
    }
    
    /**
     * Send a log message with the [Log.DEBUG] severity.
     * Note that the log message will not be written if the current log level is above [Log.DEBUG].
     * The default log level is [Log.INFO].
     *
     * @param message the function that returns message text to log.
     *  `null` value will be represent as "null", for any other value the [Any.toString] will be invoked.
     *
     * @see [Log.d].
     */
    public static final void debug(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$debug, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends java.lang.Object> message) {
    }
    
    /**
     * Send a log message with the [Log.INFO] severity.
     * Note that the log message will not be written if the current log level is above [Log.INFO].
     * The default log level is [Log.INFO].
     *
     * @param message the function that returns message text to log.
     *  `null` value will be represent as "null", for any other value the [Any.toString] will be invoked.
     *
     * @see [Log.i].
     */
    public static final void info(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$info, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends java.lang.Object> message) {
    }
    
    /**
     * Send a log message with the [Log.WARN] severity.
     * Note that the log message will not be written if the current log level is above [Log.WARN].
     * The default log level is [Log.INFO].
     *
     * @param message the function that returns message text to log.
     *  `null` value will be represent as "null", for any other value the [Any.toString] will be invoked.
     *
     * @see [Log.w].
     */
    public static final void warn(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$warn, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends java.lang.Object> message) {
    }
    
    /**
     * Send a log message with the [Log.ERROR] severity.
     * Note that the log message will not be written if the current log level is above [Log.ERROR].
     * The default log level is [Log.INFO].
     *
     * @param message the function that returns message text to log.
     *  `null` value will be represent as "null", for any other value the [Any.toString] will be invoked.
     *
     * @see [Log.e].
     */
    public static final void error(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.KtLogger $this$error, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends java.lang.Object> message) {
    }
    
    /**
     * Return the stack trace [String] of a throwable.
     */
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getStackTraceString(@org.jetbrains.annotations.NotNull
    java.lang.Throwable $this$getStackTraceString) {
        return null;
    }
    
    private static final void log(edu.vandy.app.utils.KtLogger logger, java.lang.Object message, java.lang.Throwable thr, int level, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> f, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.Throwable, kotlin.Unit> fThrowable) {
    }
    
    private static final java.lang.String getTag(java.lang.Class<?> clazz) {
        return null;
    }
}