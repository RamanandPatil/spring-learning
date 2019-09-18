package learning.spring.core.annotations.ioc.coach;

import org.springframework.stereotype.Component;

/**
 * Example class with explicit Component name - myBaseBallCoach
 * This name can be anything.
 */
@Component("myBaseBallCoach")
public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.print("BaseBallCoach.getDailyWorkout(): ");
        return "\"Spend 30 minutes daily on batting practice.\"";
    }
}
