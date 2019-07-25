package cn.kgc.annio;

import org.springframework.stereotype.Service;

/*
* 功能类,目标类
* */
@Service
public class User {
   public void insert(){
       System.out.println("新增模拟");
   }

   public void update(){
       System.out.println("修改模拟");
       int i=1/0;
   }
}

