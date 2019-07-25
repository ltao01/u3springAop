package cn.kgc.aop;


/*业务类，增强类

*/

import org.aspectj.lang.ProceedingJoinPoint;




public class Handle {


    public void  check(){
        System.out.println("日志检查");
    }

    public void login(){
        System.out.println("登录检查");
    }

//    环绕增强
    public void arround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("增强类：环绕ing");
        pjp.proceed();//动态代理，代理的是切点方法
        System.out.println("增强类：环绕end");
    }

}
