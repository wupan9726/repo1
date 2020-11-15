/*
package 继承Extends;
//局部变量直接写
//本类this.
//父类super.
//方法重名。对象是谁就调用谁的方法。没有就向上找
//重写（override）
public class MainPlay {
    public static void main(String[] args) {
        Extends01 zi=new Extends01();
//        zi.print();
//        System.out.println(zi.name);
//        父类子类重名，用谁创建的对象，优先用谁
//        System.out.println(zi.num);
//        优先使用本类，没有在向上找
//        zi.methodZi();
        Extends fu=new Extends();
//        fu.methodFu();
//        方法属于父类，重名成员变量，优先用父类
//        zi.methodFu();
            zi.show();
            zi.call();
            zi.send();
            fu.show();
            zi.methodZi();
            zi.print();
            fu.print();
    }
}
*/
