package learning.spring.core.annotations.bean.common.coaches;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleCoach implements Coach {

    @PostConstruct
    public static void myInitMethod() {
        System.out.println("LifeCycleCoach.myInitMethod()");
    }

    @PreDestroy
    public void myDestroyMethod() {
        System.out.println("LifeCycleCoach.myDestroyMethod()");
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("LifeCycleCoach.getDailyWorkout(): ");
        return "\"Exercise daily for 1 hour.\"";
    }
}
