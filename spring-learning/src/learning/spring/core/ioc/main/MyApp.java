package learning.spring.core.ioc.main;

import learning.spring.core.ioc.coach.Coach;
import learning.spring.core.ioc.coach.TrackCoach;

/**
 * Simple MyApp example without using Spring Inversion Of Control or Dependency
 * Injection.
 *
 * @author rkpatil
 */
public class MyApp {

    public static void main(String[] args) {
        // 1. Create the object
        // Coach theCoach = new BaseBallCoach();

        /*
         * Now if we want to change the type of the coach to TrackCoach from
         * Baseball Coach, We need to modify the source code like shown below
         *  using Spring, this can be done without source code modification.
         * We can use use any of the 3 approaches(xml, annotation,
         * properties) to achieve this. Please refer to SpringIOCDemo.java
         * class in this package.
         */

        // 1-b. Create the new object
        Coach theCoach = new TrackCoach();

        // 2. Use the object
        System.out.println(theCoach.getDailyWorkout());
    }

}
