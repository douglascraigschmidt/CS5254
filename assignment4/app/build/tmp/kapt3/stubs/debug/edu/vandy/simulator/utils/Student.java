package edu.vandy.simulator.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u00a8\u0006\f"}, d2 = {"Ledu/vandy/simulator/utils/Student;", "", "()V", "type", "", "Ledu/vandy/simulator/utils/Student$Type;", "getType$annotations", "is", "", "isGraduate", "isUndergraduate", "Type", "app_debug"})
public final class Student {
    
    /**
     * TODO: (Graduate students) - remove "Undergraduate" from the set below.
     * TODO: (Undergraduate students) - remove "Graduate" from the set below.
     */
    @org.jetbrains.annotations.NotNull
    private static java.util.Set<? extends edu.vandy.simulator.utils.Student.Type> type;
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.simulator.utils.Student INSTANCE = null;
    
    private Student() {
        super();
    }
    
    /**
     * TODO: (Graduate students) - remove "Undergraduate" from the set below.
     * TODO: (Undergraduate students) - remove "Graduate" from the set below.
     */
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    private static void getType$annotations() {
    }
    
    @kotlin.jvm.JvmStatic
    public static final boolean is(@org.jetbrains.annotations.NotNull
    edu.vandy.simulator.utils.Student.Type type) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    public static final boolean isGraduate() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    public static final boolean isUndergraduate() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Ledu/vandy/simulator/utils/Student$Type;", "", "(Ljava/lang/String;I)V", "Graduate", "Undergraduate", "app_debug"})
    public static enum Type {
        @kotlin.jvm.JvmStatic
        /*public static final*/ Graduate /* = new Graduate() */,
        @kotlin.jvm.JvmStatic
        /*public static final*/ Undergraduate /* = new Undergraduate() */;
        
        Type() {
        }
    }
}