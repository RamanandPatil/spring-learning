package learning.spring.core.annotations.bean.common.coaches;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.print("CricketCoach.getDailyWorkout(): ");
        return "\"Practice fast bowling for 30 minutes\"";
    }

}
