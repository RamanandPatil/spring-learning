package learning.spring.core.xml.bean.common.coaches;

/**
 * Special Note about init and destroy Method Signatures
 *
 * When using XML configuration, I want to provide additional details
 * regarding the method signatures of the init-method  and destroy-method.
 *
 * Access modifier:
 * The method can have any access modifier (public, protected, private)
 *
 * Return type:
 * The method can have any return type. However, "void' is most commonly used.
 * If you give a return type just note that you will not be able to capture
 * the return value. As a result, "void" is commonly used.
 *
 * Method name:
 * The method can have any method name.
 *
 * Arguments
 * The method can not accept any arguments. The method should be no-arg.
 */
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
