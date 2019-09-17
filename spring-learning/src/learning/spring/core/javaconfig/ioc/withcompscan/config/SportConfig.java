package learning.spring.core.javaconfig.ioc.withcompscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:logging.properties")
@ComponentScan("learning.spring.logging")
@ComponentScan("learning.spring.core.javaconfig.ioc.withcompscan")
public class SportConfig {

}
