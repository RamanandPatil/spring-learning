package learning.spring.core.annotations.bean.common.coaches;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BaseBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        System.out.print("BaseBallCoach.getDailyWorkout() ");
        return "\"Spend 30 minutes on batting practice\"";
    }
}
