package learning.spring.core.javaconfig.bean.common.coaches;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleCoach implements Coach {

    @PostConstruct
    public static void myInitMethod() {
        System.out.println("LifeCycleCoach.myInitMethod():: "
                           + "\"@PostConstruct\"");
    }

    @PreDestroy
    public void myDestroyMethod() {
        System.out.println("LifeCycleCoach.myDestroyMethod():: "
                           + "\"@PreDestroy\"");
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("LifeCycleCoach.getDailyWorkout(): ");
        return "\"Exercise daily for 1 hour.\"";
    }
}
