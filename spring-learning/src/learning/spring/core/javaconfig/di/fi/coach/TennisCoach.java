package learning.spring.core.javaconfig.di.fi.coach;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * TennisCoach class to demonstrate Dependency Injection:
 * Field Injection with Java Config without ComponentScan.
 * Please note that, I have not added @Component annotation to this class.
 * Instead this will be defined as a @Bean in the Java Config file.
 */
public class TennisCoach implements Coach {
    @Autowired
    FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("TennisCoach.TennisCoach() Field Injection with "
                           + "Java config");
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
