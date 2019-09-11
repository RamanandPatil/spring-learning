package learning.spring.core.annotations.bean.scopes;

import learning.spring.core.annotations.bean.common.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopesDemo {
    public static void main(String[] args) {
        // 1. Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsScopesLCAppContext.xml");

        // 2. Retrieve the singleton bean from spring container
        Coach baseBallCoach1 = context.getBean("baseBallCoach", Coach.class);
        Coach baseBallCoach2 = context.getBean("baseBallCoach", Coach.class);

        System.out.println("baseBallCoach1: " + baseBallCoach1.hashCode());
        System.out.println("baseBallCoach2: " + baseBallCoach2.hashCode());

        // check if they are the same
        boolean result1 = (baseBallCoach1 == baseBallCoach2);

        // print out the results
        System.out.println("Pointing to the same object: " + result1);


        System.out.println();

        // 3. Retrieve the prototype bean from spring container
        Coach cricketCoach1 = context.getBean("cricketCoach", Coach.class);
        Coach cricketCoach2 = context.getBean("cricketCoach", Coach.class);

        System.out.println("cricketCoach1: " + cricketCoach1.hashCode());
        System.out.println("cricketCoach2: " + cricketCoach2.hashCode());

        // check if they are the same
        boolean result2 = (cricketCoach1 == cricketCoach2);

        // print out the results
        System.out.println("Pointing to the same object: " + result2);


        // 4. Close the context
        context.close();

    }

}
