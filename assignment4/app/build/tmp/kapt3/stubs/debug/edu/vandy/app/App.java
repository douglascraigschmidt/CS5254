package edu.vandy.app;

/**
 * The application made to be easily accessible as a singleton.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Ledu/vandy/app/App;", "Landroid/app/Application;", "()V", "compositeUnsubscriber", "Ledu/vandy/app/preferences/CompositeUnsubscriber;", "getCompositeUnsubscriber", "()Ledu/vandy/app/preferences/CompositeUnsubscriber;", "picasso", "Lcom/squareup/picasso/Picasso;", "getPicasso", "()Lcom/squareup/picasso/Picasso;", "setPicasso", "(Lcom/squareup/picasso/Picasso;)V", "onCreate", "", "onTerminate", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.extensions.NotNullSingleValueVar<?> instance$delegate = null;
    public com.squareup.picasso.Picasso picasso;
    
    /**
     * For extension or Object ObservablePreference declarations
     * (probably not necessary to unsubscribe from object singletons
     * or for extension properties, but it never hurts to be careful).
     */
    @org.jetbrains.annotations.NotNull
    private final edu.vandy.app.preferences.CompositeUnsubscriber compositeUnsubscriber = null;
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.App.Companion Companion = null;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.squareup.picasso.Picasso getPicasso() {
        return null;
    }
    
    public final void setPicasso(@org.jetbrains.annotations.NotNull
    com.squareup.picasso.Picasso p0) {
    }
    
    /**
     * For extension or Object ObservablePreference declarations
     * (probably not necessary to unsubscribe from object singletons
     * or for extension properties, but it never hurts to be careful).
     */
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.preferences.CompositeUnsubscriber getCompositeUnsubscriber() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public void onTerminate() {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.App getInstance() {
        return null;
    }
    
    public static final void setInstance(@org.jetbrains.annotations.NotNull
    edu.vandy.app.App p0) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R1\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Ledu/vandy/app/App$Companion;", "", "()V", "<set-?>", "Ledu/vandy/app/App;", "instance", "getInstance$annotations", "getInstance", "()Ledu/vandy/app/App;", "setInstance", "(Ledu/vandy/app/App;)V", "instance$delegate", "Ledu/vandy/app/extensions/NotNullSingleValueVar;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final edu.vandy.app.App getInstance() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        @java.lang.Deprecated
        public static void getInstance$annotations() {
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull
        edu.vandy.app.App p0) {
        }
    }
}