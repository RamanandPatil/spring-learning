package learning.spring.core.annotations.qualifier.services;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // String array of fortunes
    private String[] fortunes = {
            "You will be smart and cunning!",
            "You will be the guy/girl who will be able to solve any problem "
            + "anyone throws at you!",
            "You are very serious about your future!",
            "Beware of the wolf in sheep's clothing.",
            "Diligence is the mother of good luck.",
            "The journey is the reward."
    };

    // create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        System.out.print("RandomFortuneService.getFortune(): ");
        return "\"" + fortunes[random.nextInt(fortunes.length)] + "\"";
    }

}
