package cn.kgc;

import cn.kgc.aop.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest 
{



    @Test
    public void test(){
//        1,读取加载核心配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-xml.xml");
//        2,获取bean文件，相当于对类进行了实例化操作
        User user = (User) context.getBean("user");/*以bean标签的id属性值*/
        user.insert();
        user.update();
}


}
