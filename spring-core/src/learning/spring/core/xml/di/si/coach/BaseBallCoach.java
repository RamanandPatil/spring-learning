package learning.spring.core.xml.di.si.coach;

import learning.spring.core.xml.di.common.services.FortuneService;

/**
 * Dependency Injection: Using Setter Injection Using this BaseBallCoach
 * concrete class to demo Setter Injection of reference and literal variables
 *
 * @author rkpatil
 */
public class BaseBallCoach extends AbstractCoach {

    // Define a private field for the setter injection
    // private FortuneService fortuneService;
    // private String emailAddress;
    // private String teamName;

    public FortuneService getFortuneService() {
        System.out.println("BaseBallCoach.getFortuneService()");
        return fortuneService;
    }

    @Override
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("BaseBallCoach.setFortuneService()");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        System.out.print("BaseBallCoach.getEmailAddress(): ");
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        System.out.println("BaseBallCoach.setEmailAddress()");
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        System.out.print("BaseBallCoach.getTeamName(): ");
        return teamName;
    }

    @Override
    public void setTeamName(String teamName) {
        System.out.println("BaseBallCoach.setTeamName()");
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("BaseBallCoach.getDailyWorkout(): ");
        return "Practice baseball for 30 minutes daily.";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("BaseBallCoach.getDailyFortune(): ");
        // Use fortuneService to get a fortune
        return fortuneService.getDailyFortune();
    }
}
