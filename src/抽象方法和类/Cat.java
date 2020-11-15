package 抽象方法和类;

public class Cat extends Animals{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    @Override
    public void leg(){
        System.out.println("猫腿");
    }

    @Override
    public void sleep() {

    }

}
