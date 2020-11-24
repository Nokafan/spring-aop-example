package mate.academy.aopexample.aspects.statistic;

import mate.academy.aopexample.model.TaskResult;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StatisticsAspect {

    @AfterReturning(pointcut =
            "execution(* mate.academy.aopexample.service.TaskChecker.check(..))",
            returning = "retVal")
    public TaskResult sendTaskExecutionStatistic(JoinPoint joinPoint, Object retVal) {
        TaskResult taskResult = (TaskResult) retVal;
        System.out.println("Retrieve information about current user ... ");
        System.out.println("Sending statistic to a third party API ...");
        System.out.println("Aspect completed. `check` method was called " +
                "from the class " + joinPoint.getSourceLocation().getWithinType().getName()) ;
        return taskResult;
    }

}
