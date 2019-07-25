package cn.kgc.tx;

public interface Dao {
//    转账一个参数表示进账，一个表示参数金额
    public void outAceount(String outCard,Double money);
//    进账
public void inAceount(String inCard,Double money);

}
