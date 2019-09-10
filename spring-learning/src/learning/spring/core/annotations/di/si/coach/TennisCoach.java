package learning.spring.core.annotations.di.si.coach;

import learning.spring.core.annotations.di.common.coach.Coach;
import learning.spring.core.annotations.di.common.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Dependency Injection: Setter Injection Demo
 * TennisCoach class to demo Setter Injection using Autowiring method.
 */
@Component
public class TennisCoach implements Coach {
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach.setFortuneService(): "
                           + "Setter Injection.");
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;

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
