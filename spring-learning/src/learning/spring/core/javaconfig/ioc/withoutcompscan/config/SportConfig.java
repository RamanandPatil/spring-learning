package learning.spring.core.javaconfig.ioc.withoutcompscan.config;

import learning.spring.core.javaconfig.ioc.withoutcompscan.coach.Coach;
import learning.spring.core.javaconfig.ioc.withoutcompscan.coach.CricketCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// TODO: Find how to setup logging without using ComponentScan
// @ComponentScan("learning.spring.logging")
public class SportConfig {
    @Bean
    public Coach cricketCoach() {
        return new CricketCoach();
    }
}
