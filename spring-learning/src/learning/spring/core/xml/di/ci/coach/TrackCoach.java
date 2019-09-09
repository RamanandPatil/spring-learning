package learning.spring.core.xml.di.ci.coach;

import learning.spring.core.xml.di.common.services.FortuneService;

public class TrackCoach implements Coach {
    // Define a private field for the constructor dependency
    private FortuneService fortuneService;

    // Define a constructor for Dependency Injection
    public TrackCoach(FortuneService theFortuneService) {
        System.out.println("Injecting FortuneService via TrackCoach " +
                           "Constructor: TrackCoach()");
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("TrackCoach.getDailyWorkout()");
        return "Run 5k daily";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("TrackCoach.getDailyFortune()");
        return "TrackCoach: Just Do It-> " + fortuneService.getDailyFortune();
    }

}
