package learning.spring.core.annotations.bean.lifecycle;

import learning.spring.core.annotations.bean.common.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class to demo the bean lifecycle methods inti and destroy.
 * Please refer to
 *
 * @{@link learning.spring.core.xml.bean.common.coaches.LifeCycleCoach}
 *         class to see how the methods are defined and
 * @springBeanLifeCycleAppContext.xml to see how those are configured.
 *
 *
 *         Special Note about Destroy Lifecycle and Prototype Scope
 *         There is a subtle point you need to be aware of with "prototype"
 *         scoped
 *         beans.
 *
 *         For "prototype" scoped beans, Spring does not call the destroy
 *         method.
 *
 *         In contrast to the other scopes, Spring does not manage the complete
 *         lifecycle of a prototype bean: the container instantiates,
 *         configures, and
 *         otherwise assembles a prototype object, and hands it to the
 *         client, with
 *         no further record of that prototype instance.
 *
 *         Thus, although initialization lifecycle callback methods are
 *         called on all
 *         objects regardless of scope, in the case of prototypes, configured
 *         destruction lifecycle callbacks are not called. The client code
 *         must clean
 *         up prototype-scoped objects and release expensive resources that the
 *         prototype bean(s) are holding.
 *
 *         This also applies to both XML configuration and Annotation-based
 *         configuration.
 */
public class AnnotationBeanLifecycleDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "springCoreAnnotationsScopesLCAppContext.xml");

        Coach lifeCycleCoach = context.getBean("lifeCycleCoach", Coach.class);

        System.out.println(lifeCycleCoach.getDailyWorkout());

        context.close();
    }
}
