package learning.spring.core.di.si.coach;

import learning.spring.core.di.common.services.FortuneService;

public class TrackCoach extends AbstractCoach {

    @Override
    public FortuneService getFortuneService() {
        System.out.println("TrackCoach.getFortuneService");
        return this.fortuneService;
    }

    @Override
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TrackCoach.setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getEmailAddress() {
        System.out.println("TrackCoach.getEmailAddress");
        return this.emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        System.out.println("TrackCoach.setEmailAddress");
        this.emailAddress = emailAddress;
    }

    @Override
    public String getTeamName() {
        System.out.println("TrackCoach.getTeamName");
        return this.teamName;
    }

    @Override
    public void setTeamName(String teamName) {
        System.out.println("TrackCoach.setTeamName");
        this.teamName = teamName;
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
