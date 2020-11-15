package Static静态;

import Static静态.StaticMethod;

public class Demo01Static {
    public static void main(String[] args) {
       /* Demo01StaticStudent one=new Demo01StaticStudent("张三",56);
        Demo01StaticStudent two=new Demo01StaticStudent("李四",55);
        Demo01StaticStudent.room="博学楼101";
        System.out.println(one.getAge()+one.getName()+Demo01StaticStudent.room+one.getId());
        System.out.println(two.getAge()+two.getName()+Demo01StaticStudent.room+two.getId());*/
        StaticMethod obj=new StaticMethod();
        StaticMethod obj1=new StaticMethod();
//        obj.method();
//        推荐使用类名调用静态方法
//        StaticMethod.staticMethod();
//        int num=StaticMethod.numStatic;
//        System.out.println(num);


    }
}
