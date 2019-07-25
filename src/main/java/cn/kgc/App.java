package cn.kgc;

import cn.kgc.aop.Handle;
import cn.kgc.aop.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        执行调用user中的方法，在其方法之前调用日志检查
        User user = new User();
        user.insert();
        Handle handle = new Handle();
        handle.check();
        


    }
}
