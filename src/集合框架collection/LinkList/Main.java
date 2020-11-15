package 集合框架collection.LinkList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("there");
        System.out.println(list);
        list.addFirst("one1");
        list.addLast("there1");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("two");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
