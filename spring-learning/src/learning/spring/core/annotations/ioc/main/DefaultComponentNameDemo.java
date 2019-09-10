package learning.spring.core.annotations.ioc.main;

import learning.spring.core.annotations.ioc.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Inversion of Control demo with Java Annotations using default Component
 * name.
 */
public class DefaultComponentNameDemo {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsIOCAppContext.xml");

        // get the bean from spring container
        Coach myCoach = context.getBean("cricketCoach", Coach.class);

        // call a method on the bean
        System.out.println(myCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
