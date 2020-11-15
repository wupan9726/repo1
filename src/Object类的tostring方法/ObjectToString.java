package Object类的tostring方法;


import java.util.Scanner;

public class ObjectToString {
    public static void main(String[] args) {
        Person one =new Person("张三",18);
        String s=one.toString();
        System.out.println(s);
        System.out.println(one);//直接打印对象名相当于调用Object类中的ToString方法  one=one.ToString
        // 重写ToString方法后，调用的就是重写后的ToString方法
        Scanner sc =new Scanner(System.in);
        System.out.println(sc);
    }


}
