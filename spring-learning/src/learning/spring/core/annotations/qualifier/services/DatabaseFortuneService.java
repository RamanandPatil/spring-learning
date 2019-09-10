package learning.spring.core.annotations.qualifier.services;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.print("DatabaseFortuneService.getFortune(): ");
        return "\"DatabaseFortuneService\"";
    }

}
