package learning.spring.core.annotations.di.fi.coach;

import learning.spring.core.annotations.di.common.coach.Coach;
import learning.spring.core.annotations.di.common.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Dependency Injection: Field Injection Demo
 * TennisCoach class to demo Field Injection using Autowiring method.
 */
@Component
public class TennisCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach.TennisCoach(): Field Injection.");
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("TennisCoach.getDailyWorkout(): ");
        return "\"Practice Tennis for 45 minutes, every evening!\"";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("TennisCoach.getDailyFortune(): ");
        return fortuneService.getFortune();
    }
}
