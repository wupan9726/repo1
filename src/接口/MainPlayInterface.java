package 接口;

public class MainPlayInterface {
    public static void main(String[] args) {
        MyInterfaceAbstractimpl one=new MyInterfaceAbstractimpl();
        one.methodAbs();
        one.methodAbs2();
        one.methodAbs3();
        one.methodAbs4();
        one.moRen();
        one.moRen2();
        MyInterfaceAbstract.methodStatic();
        System.out.println(one.NUM);
        one.moRen();
        one.moRen2();

    }
}
