package learning.spring.logging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


/**
 * <a href="https://gist.github.com/darbyluv2code/a49009fe1f92f95a30d2d5f7ac987ce5">MyLoggerConfig.java</a>
 */
@Configuration
@PropertySource("classpath:logging.properties")
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
