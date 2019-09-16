package learning.spring.core.javaconfig.di.pi.config;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import learning.spring.core.javaconfig.di.common.services.HappyFortuneService;
import learning.spring.core.javaconfig.di.pi.coach.CricketCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// TODO: Find how to setup logging without using ComponentScan
// @ComponentScan("learning.spring.logging")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach cricketCoach() {
        return new CricketCoach();
    }

}
