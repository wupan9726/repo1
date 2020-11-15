package 继承Extends;

import java.util.ArrayList;

public class MainRedBag {
    public static void main(String[] args) {
        Boss boss=new Boss("老板",100);
        Member one=new Member("A",0);
        Member two=new Member("b",0);
        Member there=new Member("c",0);
        boss.show();
        one.show();
        two.show();
        there.show();
        ArrayList<Integer> list=new ArrayList<>();
        list=boss.redbag(35,3);
        one.recive(list);
        two.recive(list);
        there.recive(list);
        boss.show();
        one.show();
        two.show();
        there.show();
    }
}
