package learning.spring.core.javaconfig.di.fi.config;

import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import learning.spring.core.javaconfig.di.common.services.HappyFortuneService;
import learning.spring.core.javaconfig.di.fi.coach.TennisCoach;
import learning.spring.logging.MyJavaLoggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// This @PropertySource is required if @ComponentScan is not used.
// Please see MyJavaLoggerConfig class for the detailed explanation.
@PropertySource("classpath:logging.properties")
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
    public Coach tennisCoach() {
        return new TennisCoach();
    }

}
