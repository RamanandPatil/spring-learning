package learning.spring.core.xml.bean.scopes;

import learning.spring.core.xml.bean.common.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBeanScopesDemo {
    public static void main(String[] args) {
        // 1. Load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springBeanScopesAppContext.xml");

        // 2. Retrieve the singleton bean from spring container
        Coach baseBallCoach1 = context.getBean("singletonCoach", Coach.class);
        Coach baseBallCoach2 = context.getBean("singletonCoach", Coach.class);

        System.out.println("baseBallCoach1: " + baseBallCoach1.hashCode());
        System.out.println("baseBallCoach2: " + baseBallCoach2.hashCode());

        // check if they are the same
        boolean result1 = (baseBallCoach1 == baseBallCoach2);

        // print out the results
        System.out.println("Pointing to the same object: " + result1);


        System.out.println();

        // 3. Retrieve the prototype bean from spring container
        Coach cricketCoach1 = context.getBean("prototypeCoach", Coach.class);
        Coach cricketCoach2 = context.getBean("prototypeCoach", Coach.class);

        System.out.println("cricketCoach1: " + cricketCoach1.hashCode());
        System.out.println("cricketCoach2: " + cricketCoach2.hashCode());

        // check if they are the same
        boolean result = (cricketCoach1 == cricketCoach2);

        // print out the results
        System.out.println("Pointing to the same object: " + result);


        // 4. Close the context
        context.close();

    }

}
