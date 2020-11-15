package 集合框架collection.ArrayList.ArrayList集合;

import java.util.ArrayList;

public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);
        list.add("mou");
        list.add("小周");
        list.add("吴攀");
        System.out.println(list);
        String str=list.get(1);
        System.out.println(str);
        list.remove(1);
        System.out.println(list);
       /* int size=list.size();
        System.out.println(size);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
      /* ArrayList<Integer> list=new ArrayList<>();
       list.add(100);
       list.add(200);
       list.add(300);
        System.out.println(list);
        int num=list.get(2);
        System.out.println(num);
        list.remove(1);
        System.out.println(list);
        int n=list.size();
        System.out.println(n);
        ArrayList<Integer> list=new ArrayList<>();
        ArrayListRondom one=new ArrayListRondom();
        one.enterNUm(list,10);
        one.Rondom01(list,6);
        one.print(list);
        one.print01(list);
        one.randomArray(list,20);
        System.out.println(list);
        one.getSmalllist(list);
        Random r=new Random();*/

    }
//
}
