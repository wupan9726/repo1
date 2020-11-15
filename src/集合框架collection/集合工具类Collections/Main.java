package 集合框架collection.集合工具类Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      /*  ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(0);
        list.add(4);
        Collections.addAll(list,1,2,5,2,4,2,4,2,42);//一次性加入多个元素
        Collections.shuffle(list);//打乱集合元素
        Collections.sort(list);//默认升序排列,重写comparable进行改变排序方法
        System.out.println(list);*/
        ArrayList<Person> list01=new ArrayList<>();
        list01.add(new Person("wupan",18));
        list01.add(new Person("wu",14));
        list01.add(new Person("pan",12));
        Collections.sort(list01);
        System.out.println(list01);

    }
}
