package String;

import 数学工具类.PractisePerson;

import java.util.Scanner;

public class StringPractise {
    public static void main(String[] args) {
        int[] array={1,2,3};
        PractisePerson one=new PractisePerson();
        System.out.println(one.fromArrayToString(array));
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        char[] a=str.toCharArray();
    }
}
