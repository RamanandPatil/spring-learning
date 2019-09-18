package learning.spring.core.javaconfig.di.ci.coach;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;

/**
 * SwimCoach class to demonstrate Dependency Injection:
 * Constructor Injection with Java Config without ComponentScan.
 * Please note that, I have not added @Component annotation to this class.
 * Instead this will be defined as a @Bean in the Java Config file.
 */
public class SwimCoach implements Coach {
    FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService) {
        System.out.println("SwimCoach.SwimCoach(): Constructor "
                           + "Injection with Java config");
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("SwimCoach.getDailyWorkout(): ");
        return "\"Swim 1000 meters as a warm up!.\"";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("SwimCoach.getDailyFortune(): ");
        return fortuneService.getFortune();
    }

}
