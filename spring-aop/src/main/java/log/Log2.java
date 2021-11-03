package log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

public class Log2 {
    public void before() {
        System.out.println("方法执行前");
    }

    public void after() {
        System.out.println("方法执行后");

    }

    public void afterReturn() {

    }
}
