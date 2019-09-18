package learning.spring.core.annotations.qualifier.services;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        System.out.print("RESTFortuneService.getFortune(): ");
        return "\"RESTFortuneService\"";
    }

}
