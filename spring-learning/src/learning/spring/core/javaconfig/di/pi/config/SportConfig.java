package learning.spring.core.javaconfig.di.pi.config;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import learning.spring.core.javaconfig.di.common.services.HappyFortuneService;
import learning.spring.core.javaconfig.di.pi.coach.CricketCoach;
import learning.spring.logging.MyJavaLoggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logging.properties")
@PropertySource("classpath:sport.properties")
public class SportConfig {
    @Bean
    public MyJavaLoggerConfig myJavaLoggerConfig() {
        return new MyJavaLoggerConfig();
    }

    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach cricketCoach() {
        return new CricketCoach();
    }

}
