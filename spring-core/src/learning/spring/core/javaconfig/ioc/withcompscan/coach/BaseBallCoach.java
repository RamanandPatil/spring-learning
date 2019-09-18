package learning.spring.core.javaconfig.ioc.withcompscan.coach;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
    public BaseBallCoach() {
        System.out.println("BaseBallCoach.BaseBallCoach(): Using Java Config,"
                           + " with Component scan and without XML!");
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("BaseBallCoach.getDailyWorkout(): ");
        return "Spend 30 minutes on batting practice.";
    }
}
