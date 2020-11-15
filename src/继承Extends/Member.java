package 继承Extends;

import java.util.ArrayList;
import java.util.Random;
import java.util.Spliterator;

public class Member extends User {
    public Member(){

    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void recive(ArrayList<Integer> list){
        Random r=new Random();
        int num=r.nextInt(list.size());
        int delta=list.remove(num);
        int now=super.getMoney();
        super.setMoney(delta+now);
    }
    }

