package 泛型;

public class InterfaceImpl implements MyInterface<String> {

    @Override
    public void method(String num) {
        System.out.println(num);
    }
}
