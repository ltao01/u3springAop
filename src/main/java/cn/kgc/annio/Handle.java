package cn.kgc.annio;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
/*业务类，增强类*/
@Service
@Aspect//表示当前类是切面类
public class Handle {

//    前置
    @Before("execution(* cn.kgc.annio.User.insert(..))")
    public void  check(){
        System.out.println("日志检查");
    }

    //@AfterReturning
    public void login(){
        System.out.println("登录检查");
    }

//    环绕增强
    @Around("execution(* cn.kgc.annio.User.insert(..))")
    public void arround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("增强类：环绕ing");
        pjp.proceed();//动态代理，代理的是切点方法
        System.out.println("增强类：环绕end");
    }

}
