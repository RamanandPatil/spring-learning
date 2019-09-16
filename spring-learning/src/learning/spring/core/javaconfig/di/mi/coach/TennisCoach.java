package learning.spring.core.javaconfig.di.mi.coach;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * TennisCoach class to demonstrate Dependency Injection:
 * Method Injection with Java Config without ComponentScan.
 * Please note that, I have not added @Component annotation to this class.
 * Instead this will be defined as a @Bean in the Java Config file.
 */
public class TennisCoach implements Coach {
    FortuneService fortuneService;

    @Autowired
    public void methodInjection(FortuneService fortuneService) {
        System.out.println("TennisCoach.setFortuneService() Method Injection "
                           + "with Java config");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("TennisCoach.getDailyWorkout(): ");
        return "\"Practice your backhand volley.\"";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("TennisCoach.getDailyFortune(): ");
        return fortuneService.getFortune();
    }

}
