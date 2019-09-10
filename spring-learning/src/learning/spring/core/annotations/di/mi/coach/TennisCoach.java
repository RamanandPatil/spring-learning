package learning.spring.core.annotations.di.mi.coach;

import learning.spring.core.annotations.di.common.coach.Coach;
import learning.spring.core.annotations.di.common.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Dependency Injection: Method Injection Demo
 * TennisCoach class to demo Method Injection using Autowiring method.
 */
@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public void anyMethodToSetFortune(FortuneService fortuneService) {
        System.out.println("TennisCoach.anyMethodToSetFortune(): "
                           + "Method Injection.");
        this.fortuneService = fortuneService;
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
