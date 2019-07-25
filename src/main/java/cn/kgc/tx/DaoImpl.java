package cn.kgc.tx;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl extends JdbcTemplate implements Dao {
    @Override
    public void outAceount(String outCard, Double money) {
//        1,编写sql语句
        String sql="update account set money=money-? where card=?";
//          2,执行sql语句
        this.update(sql,money,outCard);
    }

    @Override
    public void inAceount(String inCard, Double money) {
//        1,编写sql语句
        String sql="update account set money=money+? where card=?";
//          2,执行sql语句
        this.update(sql,money,inCard);
    }
    }

