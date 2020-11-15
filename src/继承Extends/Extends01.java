package 继承Extends;
//局部变量直接写
//本类this.
//父类super.

public class Extends01 extends Extends {
    String name="张三";
    int num=30;
    public void methodZi(){
        int num=40;
        System.out.println(num);//40
        System.out.println(this.num);//30
        System.out.println(super.num);//20
    }

    @Override
    public void show() {
        super.show();
        System.out.println("显示头像");
        System.out.println("显示颜色");
    }
    @Override
    public void print(){
        System.out.println("父类执行");
    }
}
