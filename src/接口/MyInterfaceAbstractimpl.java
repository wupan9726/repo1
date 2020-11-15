package 接口;

public class MyInterfaceAbstractimpl<methodStatic> implements MyInterfaceAbstract {

    @Override
    public void methodAbs() {
        System.out.println(1);
    }

    @Override
    public void methodAbs2() {
        System.out.println(2);
    }

    @Override
    public void methodAbs3() {
        System.out.println(3);
    }

    @Override
    public void methodAbs4() {
        System.out.println(4);
    }
//    默认方法覆盖重写不能加default关键字
    @Override
    public void moRen(){
        System.out.println(250);
    }
@Override
    public void moRen2(){
    System.out.println(555);
}
}
