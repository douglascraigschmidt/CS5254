package edu.vandy.app.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Ledu/vandy/app/utils/KtLogger;", "", "loggerTag", "", "getLoggerTag", "()Ljava/lang/String;", "app_debug"})
public abstract interface KtLogger {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getLoggerTag();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull
        public static java.lang.String getLoggerTag(@org.jetbrains.annotations.NotNull
        edu.vandy.app.utils.KtLogger $this) {
            return null;
        }
    }
}