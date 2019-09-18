package learning.spring.core.javaconfig.ioc.withoutcompscan.config;

import learning.spring.core.javaconfig.ioc.withoutcompscan.coach.Coach;
import learning.spring.core.javaconfig.ioc.withoutcompscan.coach.CricketCoach;
import learning.spring.logging.MyJavaLoggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logging.properties")
public class SportConfig {
    @Bean
    public MyJavaLoggerConfig myJavaLoggerConfig() {
        return new MyJavaLoggerConfig();
    }
    @Bean
    public Coach cricketCoach() {
        return new CricketCoach();
    }
}
