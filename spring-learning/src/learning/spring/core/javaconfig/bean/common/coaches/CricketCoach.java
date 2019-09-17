package learning.spring.core.javaconfig.bean.common.coaches;

public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.print("CricketCoach.getDailyWorkout(): ");
        return "\"Practice fast bowling for 30 minutes\"";
    }

}
