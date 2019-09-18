package learning.spring.core.javaconfig.ioc.withoutcompscan.coach;

import learning.spring.core.javaconfig.ioc.withoutcompscan.config.SportConfig;

/**
 * CricketCoach class to demonstrate IOC with Java Config without ComponentScan.
 * Please note that, I have not added @Component annotation to this class.
 * Instead this will be defined as a @Bean in the Java Config file
 * named SportConfig. Please see {@link SportConfig} class for more details.
 */
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("CricketCoach.CricketCoach(): Using only Java "
                           + "Config, no Java Component scan and no XML!");
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("CricketCoach.getDailyWorkout(): ");
        return "Practice fast bowling for 30 minutes.";
    }

}
