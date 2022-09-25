package learning.spring.core.xml.di.si.coach;

import learning.spring.core.xml.di.common.services.FortuneService;

public class CricketCoach extends AbstractCoach {
    // private FortuneService fortuneService;
    // private String emailAddress;
    // private String teamName;

    @Override
    public FortuneService getFortuneService() {
        System.out.println("CricketCoach.getFortuneService");
        return this.fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println(
                "Injecting CricketCoach FortuneService via setter - "
                + "setFortuneService()");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        System.out.println("CricketCoach.getEmailAddress()");
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach.setEmailAddress()");
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        System.out.println("CricketCoach.getTeamName()");
        return teamName;
    }

    public void setTeamName(String teamName) {
        System.out.println("CricketCoach.setTeamName()");
        this.teamName = teamName;
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
