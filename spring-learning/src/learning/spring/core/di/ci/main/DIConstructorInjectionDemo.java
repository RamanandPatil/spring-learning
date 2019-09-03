package learning.spring.core.di.ci.main;

import learning.spring.core.di.ci.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIConstructorInjectionDemo {

    public static void main(String[] args) {
        // 1. Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreDICIAppContext.xml");

        // 2. Retrieve bean from spring container
        Coach myCoachDICI = context.getBean("myCoachDICI", Coach.class);

        /*
         * Constructor Injection using Coach implementing classes: Please
         * refer to individual classes and springCoreDICIAppContext.xml to see
         * how the fortune service is injected via constructor.
         */
        System.out.println("\nDependency Injection: Using " +
                           myCoachDICI.getClass().getSimpleName() +
                           " Constructor -> \"Constructor Injection\"");

        // 3-a. Call methods on the bean
        System.out.println(myCoachDICI.getDailyWorkout());

        // 3-b. Let's call our new method for fortunes
        System.out.println(myCoachDICI.getDailyFortune());

        // 4. Close the context
        context.close();

    }

}
