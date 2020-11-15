package 集合框架collection.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetD {
    public static void main(String[] args) {
        java.util.LinkedHashSet<String> set=new java.util.LinkedHashSet();
        set.add("wu");
        set.add("lin");
        set.add("zhou");
        set.add("pan");
        System.out.println(set);//linkedHashSet 有序不能重复
        HashSet<String> set1=new HashSet();
        set1.add("wu");
        set1.add("lin");
        set1.add("zhou");
        set1.add("pan");
        System.out.println(set1);//HashSet 无序，不重复；
    }
}