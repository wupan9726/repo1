package 泛型;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Demo<String> p=new Demo<>();
        p.method("");
        Demo1 p1=new Demo1();
        p1.method(2);
        p1.method("wupan");
        InterfaceImpl in=new InterfaceImpl();
        in.method("oooo");*/
        ArrayList<Integer> list =new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(6);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("there");
        list1.add("four");
       ShiaXian one=new ShiaXian();
       one.method(list);
       one.method(list1);
    }
}
