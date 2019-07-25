package cn.kgc;


import cn.kgc.tx.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxTest {


    @Test
    public void test(){

//        1,读取加载核心配置文件
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-tx.xml");
        AccountService accountService = (AccountService) app.getBean("service");
        accountService.transAccount("1001001","2002002",1000d);


        //        2,获取bean文件，相当于对类进行了实例化操作
}
    }