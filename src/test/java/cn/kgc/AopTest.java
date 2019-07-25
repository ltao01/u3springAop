package cn.kgc;


import cn.kgc.annio.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-annio.xml"})
public class AopTest {

    @Autowired
    private User user;

    @Test
    public void test(){
        user.insert();
    }

}
