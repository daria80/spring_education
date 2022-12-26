package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*())")
    public void beforeGetBookAdvice() {
        System.out.println("Попытка взять книгу");
    }

    @Before("execution( * returnBook())")
    public void beforezReturnBookAdvice() {
        System.out.println("Попытка вернуть книгу");
    }
}
