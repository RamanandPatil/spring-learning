package learning.spring.core.annotations.ioc.main;

import learning.spring.core.annotations.ioc.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Inversion of Control demo with Java Annotations using explicit Component
 * name.
 * TODO: Find how to change the bean type or Coach type below without modifying
 * TODO the source code. Is it even possible?
 */
public class ExplicitComponentNameDemo {
    public static void main(String[] args) {
        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsIOCAppContext.xml");

        // get the bean from spring container
        Coach myCoach = context.getBean("myBaseBallCoach", Coach.class);

        // call a method on the bean
        System.out.println(myCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
