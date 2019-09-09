package learning.spring.core.xml.ioc.main;

import learning.spring.core.xml.ioc.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring Inversion Of Control(IOC) demo class.
 *
 * @author rkpatil
 */
public class SpringCoreIOCDemo {

    public static void main(String[] args) {
        // 1. Load the spring configuration file usually called-
        // "applicationContext.xml"
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreIOCAppContext.xml");

        // 2. Retrieve bean from spring container
        Coach theCoach = context.getBean("myCoachIOC", Coach.class);

        /*
         * The above line will not change, when you want to change the coach
         * type, as it is defined in the springCoreIOCAppContext.xml. We can
         * edit the xml file and change the class name as per our
         * requirements, without modifying the source code of the project.
         * In other words, we are doing inversion of  control of how we create
         * and use objects in our application. Control is inverted from source
         * code to outside source code.
         * Please try to edit the springCoreIOCAppContext.xml file and make
         * use of all the types of Coach classes one by one.
         */

        // 3. Call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // 4. Close the context
        context.close();
    }
}
