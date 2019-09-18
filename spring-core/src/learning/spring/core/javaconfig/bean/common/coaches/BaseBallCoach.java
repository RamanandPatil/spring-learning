package learning.spring.core.javaconfig.bean.common.coaches;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.print("BaseBallCoach.getDailyWorkout() ");
        return "\"Spend 30 minutes on batting practice\"";
    }
}
