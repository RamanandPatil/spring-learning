package learning.spring.core.javaconfig.di.pi.coach;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * CricketCoach class to demonstrate Dependency Injection using Properties
 * file with Java Config without ComponentScan.
 * Please note that, I have not added @Component annotation to this class.
 * Instead this will be defined as a @Bean in the Java Config file.
 */
public class CricketCoach implements Coach {
    @Autowired
    private FortuneService fortuneService;

    @Value("${props.name}")
    private String name;

    @Value("${props.email}")
    private String email;

    public CricketCoach() {
        System.out.println("CricketCoach.CricketCoach(): Property file "
                           + "Injection with Java config.");
    }

    public String getName() {
        System.out.print("CricketCoach.getName(): ");
        return name;
    }

    public String getEmail() {
        System.out.print("CricketCoach.getEmail(): ");
        return email;
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("CricketCoach.getDailyWorkout(): ");
        return "Practice fast bowling for 30 minutes.";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("CricketCoach.getDailyFortune(): ");
        return fortuneService.getFortune();
    }

}
