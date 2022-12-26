package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods() {}

    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Попытка взять книгу/журнал ");
    }


    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книги/журнала ");
    }

//    @Before("execution(* get*())")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: Попытка взять книгу/журнал ");
//    }
//
//
//    @Before("execution(* get*())")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: Проверка прав на получение книги/журнала ");
//    }

//    @Before("execution( * returnBook())")
//    public void beforezReturnBookAdvice() {
//        System.out.println("Попытка вернуть книгу");
//    }
}
