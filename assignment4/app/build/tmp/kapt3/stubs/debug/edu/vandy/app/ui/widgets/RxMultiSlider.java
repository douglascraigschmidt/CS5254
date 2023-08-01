package edu.vandy.app.ui.widgets;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Ledu/vandy/app/ui/widgets/RxMultiSlider;", "", "()V", "Companion", "MultiSliderChangeObservable", "app_debug"})
public final class RxMultiSlider {
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.ui.widgets.RxMultiSlider.Companion Companion = null;
    
    public RxMultiSlider() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Ledu/vandy/app/ui/widgets/RxMultiSlider$Companion;", "", "()V", "changes", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "Ledu/vandy/app/utils/Range;", "", "view", "Lio/apptik/widget/MultiSlider;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.CheckResult
        @org.jetbrains.annotations.NotNull
        public final com.jakewharton.rxbinding2.InitialValueObservable<edu.vandy.app.utils.Range<java.lang.Integer>> changes(@org.jetbrains.annotations.NotNull
        io.apptik.widget.MultiSlider view) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u001e\u0010\f\u001a\u00020\r2\u0014\u0010\t\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Ledu/vandy/app/ui/widgets/RxMultiSlider$MultiSliderChangeObservable;", "Lcom/jakewharton/rxbinding2/InitialValueObservable;", "Ledu/vandy/app/utils/Range;", "", "view", "Lio/apptik/widget/MultiSlider;", "(Lio/apptik/widget/MultiSlider;)V", "checkMainThread", "", "observer", "Lio/reactivex/Observer;", "getInitialValue", "subscribeListener", "", "Listener", "app_debug"})
    static final class MultiSliderChangeObservable extends com.jakewharton.rxbinding2.InitialValueObservable<edu.vandy.app.utils.Range<java.lang.Integer>> {
        @org.jetbrains.annotations.NotNull
        private final io.apptik.widget.MultiSlider view = null;
        
        public MultiSliderChangeObservable(@org.jetbrains.annotations.NotNull
        io.apptik.widget.MultiSlider view) {
            super();
        }
        
        @java.lang.Override
        protected void subscribeListener(@org.jetbrains.annotations.NotNull
        io.reactivex.Observer<? super edu.vandy.app.utils.Range<java.lang.Integer>> observer) {
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        protected edu.vandy.app.utils.Range<java.lang.Integer> getInitialValue() {
            return null;
        }
        
        private final boolean checkMainThread(io.reactivex.Observer<?> observer) {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J,\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\n\u0010\u000e\u001a\u00060\u000fR\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Ledu/vandy/app/ui/widgets/RxMultiSlider$MultiSliderChangeObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Lio/apptik/widget/MultiSlider$OnThumbValueChangeListener;", "view", "Lio/apptik/widget/MultiSlider;", "observer", "Lio/reactivex/Observer;", "Ledu/vandy/app/utils/Range;", "", "(Lio/apptik/widget/MultiSlider;Lio/reactivex/Observer;)V", "onDispose", "", "onValueChanged", "multiSlider", "thumb", "Lio/apptik/widget/MultiSlider$Thumb;", "thumbIndex", "value", "app_debug"})
        public static final class Listener extends io.reactivex.android.MainThreadDisposable implements io.apptik.widget.MultiSlider.OnThumbValueChangeListener {
            @org.jetbrains.annotations.NotNull
            private final io.apptik.widget.MultiSlider view = null;
            @org.jetbrains.annotations.NotNull
            private final io.reactivex.Observer<? super edu.vandy.app.utils.Range<java.lang.Integer>> observer = null;
            
            public Listener(@org.jetbrains.annotations.NotNull
            io.apptik.widget.MultiSlider view, @org.jetbrains.annotations.NotNull
            io.reactivex.Observer<? super edu.vandy.app.utils.Range<java.lang.Integer>> observer) {
                super();
            }
            
            @java.lang.Override
            public void onValueChanged(@org.jetbrains.annotations.NotNull
            io.apptik.widget.MultiSlider multiSlider, @org.jetbrains.annotations.NotNull
            io.apptik.widget.MultiSlider.Thumb thumb, int thumbIndex, int value) {
            }
            
            @java.lang.Override
            protected void onDispose() {
            }
        }
    }
}