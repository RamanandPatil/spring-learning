package learning.spring.core.xml.di.pi;

import learning.spring.core.xml.di.si.coach.AbstractCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class to demonstrate Dependency Injection using properties file.
 * The example class @{@link learning.spring.core.xml.di.pi.coach.PropertyFileCoach}
 * is used for Injection demo, as these are exactly same as setter injection.
 * The only differences are the setter injection is done via properties file
 * and configuration file. Please refer to
 */
public class DIPropsFileInjectionDemo {

    public static void main(String[] args) {
        // 1. Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreDISIPIAppContext.xml");

        // 2. Retrieve bean from spring container
        AbstractCoach myCoachDISIPI = context.getBean("myCoachDISIPI",
                                                      AbstractCoach.class);

        /*
         * Setter Injection using PropertyFile and any of the Coach concrete
         * classes:
         * Setter Injection: Includes Instance(Reference) Injection and
         * Literal(value) Injection.
         * Please see the concrete classes extending @AbstractCoach and
         * springCoreDISIPIAppContext.xml and @sport.properties file for how the
         * setter injection is configured. Since, the Coach interface didn't
         * have the email and teamName fields, we had to create a Abstract class
         * @AbstractCoach class to implement the same and to change the
         * instance of Coach via configuration file without modifying the code.
         */
        System.out.println("\nSetter Injection: Using Property File, using " +
                           myCoachDISIPI.getClass().getSimpleName());

        // 3.a Call methods on the bean
        System.out.println(myCoachDISIPI.getDailyWorkout());

        // 3.b Let's call our new method for fortunes
        System.out.println(myCoachDISIPI.getDailyFortune());

        // 3.c Call the getter methods, these methods will print non-null
        // values, if our setter injection is successful.
        System.out.println(myCoachDISIPI.getEmailAddress());
        System.out.println(myCoachDISIPI.getTeamName());

        // 4. Close the context
        context.close();
    }

}
