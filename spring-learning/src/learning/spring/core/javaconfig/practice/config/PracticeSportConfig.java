package learning.spring.core.javaconfig.practice.config;

import learning.spring.core.javaconfig.practice.coach.Coach;
import learning.spring.core.javaconfig.practice.coach.WrestlingCoach;
import learning.spring.core.javaconfig.practice.services.FortuneService;
import learning.spring.core.javaconfig.practice.services.HappyFortuneService;
import learning.spring.logging.MyJavaLoggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logging.properties")
public class PracticeSportConfig {
    @Bean
    public MyJavaLoggerConfig myJavaLoggerConfig() {
        return new MyJavaLoggerConfig();
    }

    // define bean for our happy fortune service
    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach wrestlingCoach() {
        return new WrestlingCoach(happyFortuneService());
    }

}








