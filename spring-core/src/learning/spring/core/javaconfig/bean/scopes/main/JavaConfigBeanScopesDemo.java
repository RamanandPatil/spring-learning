package learning.spring.core.javaconfig.bean.scopes.main;

import learning.spring.core.javaconfig.bean.common.coaches.Coach;
import learning.spring.core.javaconfig.bean.scopes.config.BeanScopesJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigBeanScopesDemo {
    public static void main(String[] args) {
        // 1. Read the spring configuration java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        BeanScopesJavaConfig.class);

        System.out.println("Testing Singleton scope:");
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

        System.out.println("Testing Prototype scope:");
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
