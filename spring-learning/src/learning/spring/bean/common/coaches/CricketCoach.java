package learning.spring.bean.common.coaches;

public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.println("CricketCoach.getDailyWorkout()");
        return "Practice fast bowling for 30 minutes";
    }

}
