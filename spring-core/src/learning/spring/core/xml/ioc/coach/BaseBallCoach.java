package learning.spring.core.xml.ioc.coach;

public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.println("BaseBallCoach.getDailyWorkout()");
        return "Spend 30 minutes on batting practice";
    }
}
