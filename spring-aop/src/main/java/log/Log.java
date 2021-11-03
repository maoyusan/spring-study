package log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
    @Before(("execution(* service.UserServiceImpl.*(..))"))
    public void before() {
        System.out.println("方法执行前");
    }

    @After("execution(* service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后");

    }

    @AfterReturning(pointcut = "execution(* service.UserServiceImpl.*(..))",
            returning = "returnValue")
    public void afterReturn(  Object returnValue) {

    }
}
