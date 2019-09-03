package learning.spring.core.di.ci.coach;

import learning.spring.core.di.common.services.FortuneService;

public class CricketCoach implements Coach {
    // Define a private field for the constructor dependency
    private FortuneService fortuneService;

    // Define a constructor for Dependency Injection
    public CricketCoach(FortuneService theFortuneService) {
        System.out.println("Injecting FortuneService via CricketCoach " +
                           "Constructor: CricketCoach()");
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("CricketCoach.getDailyWorkout()");
        return "Practice fast-bowling for 30 minutes";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("CricketCoach.getDailyFortune()");
        return fortuneService.getDailyFortune();
    }

}
