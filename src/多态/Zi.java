package 多态;

public class Zi extends Fu {
    int num=20;

    @Override
    public void method() {
        super.method();
        System.out.println(3);
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
