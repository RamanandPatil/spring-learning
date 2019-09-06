package learning.spring.bean.common.coaches;

public class LifeCycleCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.print("LifeCycleCoach.getDailyWorkout(): ");
        return "\"Exercise daily for 1 hour.\"";
    }

    // The init method name can be anything, return type can be anything
    // (void is preferred as there is no use of giving any other return type
    // because the method return value will not be used.)
    public static void myInitMethod() {
        System.out.println("LifeCycleCoach.myInitMethod()");
    }

    public void myDestroyMethod() {
        System.out.println("LifeCycleCoach.myDestroyMethod()");
    }
}
