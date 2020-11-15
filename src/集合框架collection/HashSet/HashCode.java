package 集合框架collection.HashSet;

import java.util.HashSet;

public class HashCode {
    public static void main(String[] args) {
        HashSet<Integer> set =new HashSet<>();
        HashSet<Integer> set1 =new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(8);
        set.add(2);
        System.out.println(set);
        System.out.println(set.hashCode());

    }
}
