package learning.spring.core.javaconfig.ioc.withcompscan.main;

import learning.spring.core.javaconfig.ioc.withcompscan.coach.Coach;
import learning.spring.core.javaconfig.ioc.withcompscan.config.SportConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Inversion Of Control(IOC) demo class using Java Configuration
 * without any XML part.
 *
 * @author rkpatil
 */
public class SpringCoreIOCJavaConfigDemo {

    public static void main(String[] args) {
        // 1. Load the spring Java configuration file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // 2. Retrieve bean from spring container
        Coach theCoach = context.getBean("baseBallCoach", Coach.class);

        // 3. Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // 4. Close the context
        context.close();
    }
}
