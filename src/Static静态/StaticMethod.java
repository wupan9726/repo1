package Static静态;

public class StaticMethod {
    int num=8;
    static int numStatic=5;
    public void method(){
        System.out.println("普通方法");
        System.out.println(num);
        System.out.println(numStatic);
    }
//    静态方法不能直接访问非静态变量
    public static void staticMethod(){
        System.out.println("静态方法");
        System.out.println(numStatic);
    }
//   静态代码块,只执行唯一一次
    static {

        System.out.println("静态代码块");

    }

    public StaticMethod() {
        System.out.println("构造方法执行");
    }
}

