package learning.spring.core.xml.di.si.main;

import learning.spring.core.xml.di.si.coach.AbstractCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DISetterInjectionDemo {

    public static void main(String[] args) {
        // 1. Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreDISIAppContext.xml");

        // 2. Retrieve bean from spring container
        AbstractCoach myCoachDISI = context.getBean("myCoachDISI",
                                                    AbstractCoach.class);

        /*
         * Setter Injection using any of the Coach concrete classes:
         * Setter Injection: Includes Instance(Reference) Injection and
         * Literal(value) Injection.
         * Please see the concrete classes extending @AbstractCoach and
         * springCoreDISIAppContext.xml file for how the setter injection is
         * configured. Since, the Coach interface didn't had the email
         * and teamName fields, we had to create a Abstract class
         * @AbstractCoach class to implement the same and to change the
         * instance of Coach via configuration file without modifying the code.
         */
        System.out.println("\nSetter Injection: Using " +
                           myCoachDISI.getClass().getSimpleName());

        // 3.a Call methods on the bean
        System.out.println(myCoachDISI.getDailyWorkout());

        // 3.b Let's call our new method for fortunes
        System.out.println(myCoachDISI.getDailyFortune());

        // 3.c Call the getter methods, these methods will print non-null
        // values, if our setter injection is successful.
        System.out.println(myCoachDISI.getEmailAddress());
        System.out.println(myCoachDISI.getTeamName());

        // 4. Close the context
        context.close();
    }

}
