# SpringAOP-AroundAdvice
Aspect Oriented Programming (AOP) compliments OOPs in the sense that it also provides modularity. But the key unit of modularity is aspect than class.

AOP breaks the program logic into distinct parts (called concerns). It is used to increase modularity by cross-cutting concerns.
Around advice:
This advice surrounds the target execution. That means, on a target method execution, the advice runs and calls the target method. Because of this, the advice gets full control over applying additional code before and after method execution.
In above example is for @Around annotation. @Around annotation intercepts method before and after calling it.

```
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
```
### OUTPUT:
```
Inside RunBeforeExecution.before() method...
Running before advice...
************************************
Running business logic
************************************
Inside RunAfterExecution.afterReturning() method...
Running after advice...
```
