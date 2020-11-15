package 多态;

public class Zi1 extends Fu{
    public void methodZi1(){
        System.out.println("第二个儿子");
    }

    @Override
    public void method() {
        System.out.println(2);
    }
}
