package learning.spring.core.annotations.qualifier.coaches;

import learning.spring.core.annotations.qualifier.services.DatabaseFortuneService;
import learning.spring.core.annotations.qualifier.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Class to demonstrate the @{@link Qualifier} Annotation and it's usage.
 * See the setFortuneService setter method where
 * '@Qualifier("databaseFortuneService")' is used to tell Spring that the
 * dependency which needs to be injected here is the bean named
 * databaseFortuneService
 * which is @{@link DatabaseFortuneService}
 *
 *
 * Annotations - Default Bean Names - The Special Case
 * Annotations - Default Bean Names ... and the Special Case
 *
 * In general, when using Annotations, for the default bean name, Spring uses
 * the following rule.
 *
 * If the annotation's value doesn't indicate a bean name, an appropriate
 * name will be built based on the short name of the class (with the first
 * letter lower-cased).
 *
 * For example:
 *
 * HappyFortuneService --> happyFortuneService
 *
 * ---
 *
 * However, for the special case of when BOTH the first and second characters
 * of the class name are upper case, then the name is NOT converted.
 *
 * For the case of RESTFortuneService
 *
 * RESTFortuneService --> RESTFortuneService
 *
 * No conversion since the first two characters are upper case.
 *
 * Behind the scenes, Spring uses the Java Beans Introspector to generate the
 * default bean name.
 *
 * Also, here's a link to the documentation.
 *
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/beans/Introspector.html#decapitalize-java.lang.String-">decapitalize</a>
 *
 * ---
 *
 * As always, you can give explicit names to your beans.
 * <pre>@Component("foo")
 * public class RESTFortuneService .... {
 *
 * }</pre>
 * Then you can access it using the name of "foo". Nothing tricky to worry
 * about :-)
 */
@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    // @Qualifier("databaseFortuneService")
    // @Qualifier("happyFortuneService")
    // @Qualifier("randomFortuneService")
    @Qualifier("randomFileFortuneService")
    // @Qualifier("RESTFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("TennisCoach.setFortuneService() "
                           + "Setter Injection with @Qualifier.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("TennisCoach.getDailyWorkout() ");
        return "\"Practice tennis for 45 minutes, daily evening!\"";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("TennisCoach.getDailyFortune() ");
        return fortuneService.getFortune();
    }
}
