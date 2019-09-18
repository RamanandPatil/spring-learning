package learning.spring.core.javaconfig.di.fi.main;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.fi.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Dependency Injection-
 * Field Injection demo class using Java Configuration without any XML.
 *
 * @author rkpatil
 */
public class SpringCoreDIFIJavaConfigDemo {

    public static void main(String[] args) {
        // 1. Load the spring Java configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // 2. Retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // 3. Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // 4. Close the context
        context.close();
    }
}
