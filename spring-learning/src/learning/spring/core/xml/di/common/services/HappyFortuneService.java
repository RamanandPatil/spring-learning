package learning.spring.core.xml.di.common.services;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getDailyFortune() {
        System.out.println("HappyFortuneService.getDailyFortune()");
        return "Today is your lucky day!";
    }

}
