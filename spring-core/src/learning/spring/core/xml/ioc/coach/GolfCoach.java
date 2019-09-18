package learning.spring.core.xml.ioc.coach;

public class GolfCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.println("GolfCoach.getDailyWorkout()");
        return "Practice your putting skills for 2 hours today";
    }
}
