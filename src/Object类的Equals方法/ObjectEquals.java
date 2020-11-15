package Object类的Equals方法;

import Object类的tostring方法.Person;

import java.util.Objects;
import java.util.Random;

public class ObjectEquals {
    public static void main(String[] args) {
        Person one=new Person("周林菊",20);
        Person two=new Person("周林菊",20);
        boolean b=one.equals(two);
        System.out.println(b);
        //Object的equlas方法默认比较对象地址值
        boolean b1=one.equals(two);
        System.out.println(b1);
        Random r=new Random();
        boolean b2=one.equals(r);
        System.out.println(b2);
        boolean equals = Objects.equals(one, two);
        System.out.println(equals);

    }

}
