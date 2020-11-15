package 接口;

public interface MyInterfaceAbstract {
//    接口常量必须赋值，一旦赋值，不能改变,常量名称完全大写，下划线连接
    public static final int NUM =10;
    public abstract void methodAbs();
    abstract void methodAbs2();
    public void methodAbs3();
    void methodAbs4();
//    默认方法 public deafult void moRen(){}
    public default void moRen(){
        System.out.println(5);
        methodCommon();
    }
    default void moRen2(){
        System.out.println(6);
        methodCommon();
    }
//   只能通过接口名称.调用静态方法
    public static void methodStatic(){
        System.out.println(7);
        methodCommon1();
    }
//    接口中的私有方法
    private void methodCommon() {
        System.out.println(456);
        System.out.println(456);
        System.out.println(456);
    }
    private static void methodCommon1() {
        System.out.println(456);
        System.out.println(456);
        System.out.println(456);
    }
}
