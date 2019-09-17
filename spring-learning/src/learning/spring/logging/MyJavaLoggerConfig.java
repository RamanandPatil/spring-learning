package learning.spring.logging;

import learning.spring.core.javaconfig.ioc.withoutcompscan.config.SportConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Below {@link PropertySource} annotation will be used only when
 * ComponentScan is enabled (via other config file) or we load Spring context
 * using "MyJavaLoggerConfig.class", as below:
 * AnnotationConfigApplicationContext context =
 * new AnnotationConfigApplicationContext(MyJavaLoggerConfig.class);
 *
 * If we want to use {@link MyJavaLoggerConfig} as a Bean only and load Spring
 * AnnotationConfigApplicationContext using another config(here
 * {@link SportConfig}), then that config should have {@link PropertySource}
 * annotation, otherwise the
 * logger will not work and the properties will not be injected.
 * That is the reason, {@link SportConfig} class has
 * "@PropertySource("classpath:logging.properties")" annotation, when it has
 * not enabled ComponentScan(without @ComponentScan).
 *
 * Since I have commented the {@link PropertySource} of this class, it is
 * mandatory to include it into the main java config file which will be used
 * and loaded by the main application class.(i.e. here all the
 * {@link SportConfig} classes defined in all the sub-packages of
 * "learning.spring.core.javaconfig").
 * This is true for any java config class which has not enabled
 * {@link ComponentScan}
 *
 * <a href="https://gist.github.com/darbyluv2code/a49009fe1f92f95a30d2d5f7ac987ce5">MyLoggerConfig.java</a>
 */
@Configuration
// @PropertySource("classpath:logging.properties")
public class MyJavaLoggerConfig {

    @Value("${root.logger.level}")
    private String rootLoggerLevel;

    @Value("${printed.logger.level}")
    private String printedLoggerLevel;

    @PostConstruct
    public void MyJavaLoggerConfig() {

        // parse levels
        Level rootLevel = Level.parse(rootLoggerLevel);
        Level printedLevel = Level.parse(printedLoggerLevel);

        // get logger for app context
        Logger applicationContextLogger = Logger.getLogger(
                AnnotationConfigApplicationContext.class.getName());

        // get parent logger
        Logger loggerParent = applicationContextLogger.getParent();

        // set root logging level
        loggerParent.setLevel(rootLevel);

        // set up console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printedLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        // add handler to the logger
        loggerParent.addHandler(consoleHandler);
    }

}
