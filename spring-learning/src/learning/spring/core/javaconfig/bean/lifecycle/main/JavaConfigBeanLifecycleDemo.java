package learning.spring.core.javaconfig.bean.lifecycle.main;

import learning.spring.core.javaconfig.bean.common.coaches.Coach;
import learning.spring.core.javaconfig.bean.lifecycle.config.BeanLifeCyclesJavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Class to demo the bean lifecycle methods init and destroy.
 */
public class JavaConfigBeanLifecycleDemo {
    public static void main(String[] args) {
        // 1. Read the spring configuration java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        BeanLifeCyclesJavaConfig.class);

        // 2. Retrieve the bean from spring container
        Coach lifeCycleCoach = context.getBean("lifeCycleCoach", Coach.class);

        // 4. Call methods on the bean
        System.out.println(lifeCycleCoach.getDailyWorkout());

        // 4. Close the context
        context.close();
    }
}
