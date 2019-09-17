package learning.spring.core.javaconfig.bean.lifecycle.config;

import learning.spring.core.javaconfig.bean.common.coaches.LifeCycleCoach;
import learning.spring.logging.MyJavaLoggerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logging.properties")
public class BeanLifeCyclesJavaConfig {
    @Bean
    public MyJavaLoggerConfig myJavaLoggerConfig() {
        return new MyJavaLoggerConfig();
    }

    @Bean
    public LifeCycleCoach lifeCycleCoach() {
        return new LifeCycleCoach();
    }
}
