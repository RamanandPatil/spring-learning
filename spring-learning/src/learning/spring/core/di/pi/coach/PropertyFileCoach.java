package learning.spring.core.di.pi.coach;

import learning.spring.core.di.common.services.FortuneService;
import learning.spring.core.di.si.coach.AbstractCoach;

public class PropertyFileCoach extends AbstractCoach {

    // Define a private field for the setter injection
    private FortuneService fortuneService;
    private String emailAddress;
    private String teamName;

    @Override
    public FortuneService getFortuneService() {
        System.out.println("PropertyFileCoach.getFortuneService");
        return fortuneService;
    }

    @Override
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("PropertyFileCoach.setFortuneService");
        this.fortuneService = fortuneService;

    }

    @Override
    public String getEmailAddress() {
        System.out.println("PropertyFileCoach.getEmailAddress");
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        System.out.println("PropertyFileCoach.setEmailAddress");
        this.emailAddress = emailAddress;
    }

    @Override
    public String getTeamName() {
        System.out.println("PropertyFileCoach.getTeamName");
        return teamName;
    }

    @Override
    public void setTeamName(String teamName) {
        System.out.println("PropertyFileCoach.setTeamName");
        this.teamName = teamName;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println("PropertyFileCoach.getDailyWorkout");
        return "Create a new Property file!";
    }

    @Override
    public String getDailyFortune() {
        System.out.println("PropertyFileCoach.getDailyFortune");
        return fortuneService.getDailyFortune();
    }
}
