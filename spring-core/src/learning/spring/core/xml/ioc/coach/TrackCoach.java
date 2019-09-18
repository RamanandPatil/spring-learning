package learning.spring.core.xml.ioc.coach;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.println("TrackCoach.getDailyWorkout()");
        return "Run a hard 5k";
    }

}
