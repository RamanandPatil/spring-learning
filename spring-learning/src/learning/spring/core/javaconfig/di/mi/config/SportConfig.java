package learning.spring.core.javaconfig.di.mi.config;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import learning.spring.core.javaconfig.di.common.services.HappyFortuneService;
import learning.spring.core.javaconfig.di.mi.coach.TennisCoach;
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
    public Coach tennisCoach() {
        return new TennisCoach();
    }

}
