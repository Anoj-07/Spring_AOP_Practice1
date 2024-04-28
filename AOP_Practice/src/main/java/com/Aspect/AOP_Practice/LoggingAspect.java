package com.Aspect.AOP_Practice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    /*Define what we have to run and where to call =>
    * PointCut
    * JointPoint*/

    @Before("execution(* com.Aspect.AOP_Practice.ShoppingCart.checkout(..))")
    public void Before_logger(JoinPoint jp){
       /* System.out.println(jp.getSignature());*/

       String arg =  jp.getArgs()[0].toString();
        System.out.println("Before Loggers with argument : "
        + arg);
    }

    @After("execution(* com.Aspect.AOP_Practice.ShoppingCart.checkout(..))")
    public void After_logger(){
        System.out.println("After Logger");
    }

    /*for return type method of shoppingCart method and also create method for pointcut */
    @Pointcut("execution(* com.Aspect.AOP_Practice.ShoppingCart.quantity())")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()",
    returning = "retval")
    public void afterReturning(String retval){
        System.out.println("After Returning:" + retval);
    }

    /*For if A*/
}
