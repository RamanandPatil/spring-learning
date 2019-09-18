package learning.spring.core.javaconfig.practice.coach;

import learning.spring.core.javaconfig.practice.services.FortuneService;

public class WrestlingCoach implements Coach {

    private FortuneService fortuneService;

    public WrestlingCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("WrestlingCoach.getDailyWorkout(): ");
        return "\"Practice your double leg takedown.\"";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("WrestlingCoach.getDailyFortune(): ");
        return fortuneService.getFortune();
    }

}
