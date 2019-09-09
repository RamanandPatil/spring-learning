package learning.spring.core.xml.bean.common.coaches;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.println("BaseBallCoach.getDailyWorkout()");
        return "Spend 30 minutes on batting practice";
    }
}
