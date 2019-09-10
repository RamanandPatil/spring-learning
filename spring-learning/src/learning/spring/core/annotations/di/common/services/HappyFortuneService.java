package learning.spring.core.annotations.di.common.services;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.print("HappyFortuneService.getFortune(): ");
        return "\"Today is your lucky day!\"";
    }

}
