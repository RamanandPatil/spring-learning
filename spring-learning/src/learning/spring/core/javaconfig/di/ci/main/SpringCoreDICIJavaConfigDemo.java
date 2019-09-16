package learning.spring.core.javaconfig.di.ci.main;

import learning.spring.core.javaconfig.di.ci.config.SportConfig;
import learning.spring.core.javaconfig.di.common.coach.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Dependency Injection-
 * Constructor Injection demo class using Java Configuration without any XML.
 *
 * @author rkpatil
 */
public class SpringCoreDICIJavaConfigDemo {

    public static void main(String[] args) {
        // 1. Load the spring Java configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // 2. Retrieve bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

        // 3. Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // 4. Close the context
        context.close();
    }
}
