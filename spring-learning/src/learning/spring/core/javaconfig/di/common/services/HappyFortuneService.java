package learning.spring.core.javaconfig.di.common.services;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.print("HappyFortuneService.getDailyFortune(): ");
        return "\"Today is your lucky day!\"";
    }

}
