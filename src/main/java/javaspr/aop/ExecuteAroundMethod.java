package javaspr.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class ExecuteAroundMethod {

    @Around("execution(* javaspr.bean.MyBusinessService.runMyBusinessLogic(..))")
    public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Inside RunBeforeExecution.before() method...");
        System.out.println("Running before advice...");
        try {
            Object result = joinPoint.proceed();
            System.out.println("Inside RunAfterExecution.afterReturning() method...");
            System.out.println("Running after advice...");
            return result;
        } catch (Exception ne) {
            throw ne;
        }
    }
}