package learning.spring.core.annotations.pi.main;

import learning.spring.core.annotations.pi.coach.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency Injection: Property File Injection
 * Property file Injection Demo using Spring Java Annotations
 */
public class DIPIAnnotationDemo {
    public static void main(String[] args) {
        // Load and read the Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsDIPIAppContext.xml");

        // Get the bean from Spring container
        TennisCoach tennisCoach =
                context.getBean("tennisCoach", TennisCoach.class);

        // Call methods on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        System.out.println(tennisCoach.getName());
        System.out.println(tennisCoach.getEmail());


        // Close the context
        context.close();
    }
}
