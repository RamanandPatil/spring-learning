package learning.spring.core.javaconfig.practice.services;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.print("HappyFortuneService.getFortune(): ");
        return "\"Today is your lucky day!\"";
    }

}
