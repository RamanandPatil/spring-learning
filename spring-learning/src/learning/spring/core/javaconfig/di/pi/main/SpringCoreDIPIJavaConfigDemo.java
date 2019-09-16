package learning.spring.core.javaconfig.di.pi.main;

import learning.spring.core.javaconfig.di.pi.coach.CricketCoach;
import learning.spring.core.javaconfig.di.pi.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Dependency Injection:
 * Property file Injection demo class using Java Configuration without any XML.
 *
 * @author rkpatil
 */
public class SpringCoreDIPIJavaConfigDemo {

    public static void main(String[] args) {
        // 1. Load the spring Java configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // 2. Retrieve bean from spring container
        CricketCoach theCoach =
                context.getBean("cricketCoach", CricketCoach.class);

        // 3. Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getName());
        System.out.println(theCoach.getEmail());

        // 4. Close the context
        context.close();
    }
}
