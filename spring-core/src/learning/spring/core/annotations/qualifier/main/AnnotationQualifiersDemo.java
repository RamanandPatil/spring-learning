package learning.spring.core.annotations.qualifier.main;

import learning.spring.core.annotations.qualifier.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationQualifiersDemo {
    public static void main(String[] args) {
        // 1. Load the spring configuration file usually called-
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsQualifierAppContext.xml");

        // 2. Retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        // 3. Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // 4. Close the context
        context.close();
    }
}
