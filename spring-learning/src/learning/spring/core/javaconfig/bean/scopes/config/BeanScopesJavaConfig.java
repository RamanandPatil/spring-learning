package learning.spring.core.javaconfig.bean.scopes.config;

import learning.spring.core.javaconfig.bean.common.coaches.BaseBallCoach;
import learning.spring.core.javaconfig.bean.common.coaches.CricketCoach;
import learning.spring.logging.MyJavaLoggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:logging.properties")
public class BeanScopesJavaConfig {
    @Bean
    public MyJavaLoggerConfig myJavaLoggerConfig() {
        return new MyJavaLoggerConfig();
    }

    @Bean
    @Scope("singleton")
    public BaseBallCoach baseBallCoach() {
        return new BaseBallCoach();
    }

    @Bean
    @Scope("prototype")
    public CricketCoach cricketCoach() {
        return new CricketCoach();
    }

}
