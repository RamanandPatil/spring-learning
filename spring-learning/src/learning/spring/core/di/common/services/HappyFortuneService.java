package learning.spring.core.di.common.services;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        System.out.println("HappyFortuneService.getDailyFortune()");
        return "Today is your lucky day!";
    }

}
