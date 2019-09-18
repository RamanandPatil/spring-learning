package learning.spring.core.annotations.di.fi.main;

import learning.spring.core.annotations.di.common.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency Injection: Field Injection
 * Field Injection Demo using Spring Java Annotations
 */
public class DIFIAnnotationDemo {
    public static void main(String[] args) {
        // Load and read the Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsDIFIAppContext.xml");

        // Get the bean from Spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // Call methods on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        // Close the context
        context.close();
    }
}
