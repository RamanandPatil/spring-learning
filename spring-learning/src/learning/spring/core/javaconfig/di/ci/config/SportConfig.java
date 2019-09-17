package learning.spring.core.javaconfig.di.ci.config;

import learning.spring.core.javaconfig.di.ci.coach.SwimCoach;
import learning.spring.core.javaconfig.di.common.coach.Coach;
import learning.spring.core.javaconfig.di.common.services.FortuneService;
import learning.spring.core.javaconfig.di.common.services.HappyFortuneService;
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
    public Coach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }

}
