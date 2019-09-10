package learning.spring.core.annotations.di.ci.coach;

import learning.spring.core.annotations.di.common.coach.Coach;
import learning.spring.core.annotations.di.common.services.FortuneService;
import learning.spring.core.annotations.di.common.services.HappyFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Dependency Injection: Constructor Injection Demo
 * TennisCoach class to demo Constructor Injection using Autowiring method.
 * Development Process - Constructor Injection
 * 1. Define the dependency interface and class {@link FortuneService} and {@link HappyFortuneService}
 * 2. Create a constructor in your class for injections (TennisCoach constructor)
 * 3. Configure the dependency injection with @Autowired Annotation
 *
 * Autowiring FAQ: What if there are Multiple Implementations?
 * AUTOWIRING FAQ: What if there are multiple FortuneService implementations?
 *
 * When using autowiring, what if there are multiple FortuneService
 * implementations? Like HappyFortuneService, RandomFortuneService,
 * DatabaseFortuneService, RESTFortuneService, etc...
 *
 * ANSWER:
 *
 * Spring has special support to handle this case. Use the @Qualifier
 * annotation. We'll cover this later in the course.
 *
 *=============================================================================
 *
 * FAQ: Constructor Injection - Autowired Optional?
 * Question:
 * I have finished the video "Constructor Injection - Writing Code part2".
 * I have commented the Autowired annotation. But still it worked. How did it
 * work?
 *     //@Autowired
 *     public TennisCoach(FortuneService theFortuneService) {
 *         System.out.println(" theFortuneService " + theFortuneService);
 *         fortuneService = theFortuneService;
 *     }
 *
 * ===
 *
 * Answer:
 * This is a new feature of Spring 4.3.
 * Here is the snippet from the Spring Docs.
 *
 * Section 1.9.2: Autowired:
 *
 * "As of Spring Framework 4.3, an @Autowired annotation on such a constructor
 * is no longer necessary if the target bean only defines one constructor to
 * begin with. However, if several constructors are available, at least one
 * must be annotated to teach the container which one to use."
 *
 * I personally prefer to use the @Autowired annotation because it makes the
 * code more readable. But as mentioned, the @Autowired is not required for
 * this scenario.
 * ---
 *
 * See link to the docs.
 *
 * https://docs.spring.io/spring/docs/current/spring-framework-reference/core
 * .html#beans-autowired-annotation
 *
 */
@Component
public class TennisCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        System.out.println("TennisCoach.TennisCoach(): Constructor Injection.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.print("TennisCoach.getDailyWorkout(): ");
        return "\"Practice Tennis for 45 minutes, every evening!\"";
    }

    @Override
    public String getDailyFortune() {
        System.out.print("TennisCoach.getDailyFortune(): ");
        return fortuneService.getFortune();
    }
}
