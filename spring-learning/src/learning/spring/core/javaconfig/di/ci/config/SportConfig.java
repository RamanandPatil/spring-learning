package learning.spring.core.javaconfig.di.ci.config;

import learning.spring.core.javaconfig.di.ci.coach.SwimCoach;
import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import learning.spring.core.javaconfig.di.common.services.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// TODO: Find how to setup logging without using ComponentScan
// @ComponentScan("learning.spring.logging")
public class SportConfig {
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }

}
