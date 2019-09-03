package learning.spring.core.di.ci.coach;

import learning.spring.core.di.common.services.FortuneService;

/**
 * Dependency Injection: Using Constructor Injection Using this BaseBallCoach
 * concrete class to demo Constructor Injection.
 *
 * @author rkpatil
 */
public class BaseBallCoach implements Coach {

    // Define a private field for the constructor dependency
    private FortuneService fortuneService;

    // Define a constructor for Dependency Injection
    public BaseBallCoach(FortuneService theFortuneService) {
        System.out.println("Injecting FortuneService via BaseBallCoach " +
                           "Constructor: BaseBallCoach()");
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("BaseBallCoach.getDailyWorkout()");
        return "Practice baseball for 30 minutes daily.";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("BaseBallCoach.getDailyFortune()");
        // Use fortuneService to get a fortune
        return fortuneService.getDailyFortune();
    }
}
