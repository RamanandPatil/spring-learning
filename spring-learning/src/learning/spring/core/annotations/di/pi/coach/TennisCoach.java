package learning.spring.core.annotations.di.pi.coach;

import learning.spring.core.annotations.di.common.coach.Coach;
import learning.spring.core.annotations.di.common.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Dependency Injection: Setter Injection Demo
 * TennisCoach class to demo Setter Injection using Autowiring method.
 */
@Component
public class TennisCoach implements Coach {
    @Value("${props.name}")
    private String name;

    @Value("${props.email}")
    private String email;

    private FortuneService fortuneService;

    public String getName() {
        System.out.print("TennisCoach.getName(): ");
        return name;
    }

    public String getEmail() {
        System.out.print("TennisCoach.getEmail(): ");
        return email;
    }

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach.setFortuneService(): "
                           + "Setter Injection with Property file.");
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
