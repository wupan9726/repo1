package 继承Extends;

import java.util.ArrayList;

public class Boss extends User {

    public Boss(){
        super();
    }
    public Boss(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> redbag(int money,int count){
        ArrayList<Integer> list=new ArrayList<>();
        int num=super.getMoney();
        if(num<money){
            System.out.println("余额不足");
            return list;
        }
        super.setMoney(num-money);
        int avg=money/count;
        int rest=avg+money%count;
        for (int i = 0; i < count-1; i++) {
            list.add(avg);
        }
        list.add(rest);
        return list;
    }

}
