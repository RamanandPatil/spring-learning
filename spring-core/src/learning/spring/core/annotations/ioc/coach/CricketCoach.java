package learning.spring.core.annotations.ioc.coach;

import org.springframework.stereotype.Component;

/**
 * Example class with implicit Component name - cricketCoach
 * This name will be given by Spring container by taking class name as it is
 * and making first letter of the class name to lower case.
 * If there are more than one CAPITAL starting letters then the component
 * name will be same as the class name, no lowercase conversion will happen.
 *
 */
@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.print("CricketCoach.getDailyWorkout(): ");
        return "\"Practice fast bowling for 30 minutes everyday.\"";
    }

}
