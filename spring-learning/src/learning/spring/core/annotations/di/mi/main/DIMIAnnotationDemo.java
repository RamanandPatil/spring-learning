package learning.spring.core.annotations.di.mi.main;

import learning.spring.core.annotations.di.common.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency Injection: Method Injection
 * Method Injection Demo using Spring Java Annotations
 * This is same as Setter Injection, and just to demo that we can use
 * Autowiring with any methods, not only with setter methods.
 */
public class DIMIAnnotationDemo {
    public static void main(String[] args) {
        // Load and read the Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsDIMIAppContext.xml");

        // Get the bean from Spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // Call methods on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
