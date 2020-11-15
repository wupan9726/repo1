package 内部类;

public class Main {
    public static void main(String[] args) {
        NeiBuBianLiang.NeiBu neibu=new NeiBuBianLiang(). new NeiBu();
        neibu.method();
        NeiBuBianLiang text =new NeiBuBianLiang();
        text.method1();
        text.method3();
         new InterFace(){

            @Override
            public void niMing() {
                System.out.println("匿名内部类");

            }
        }.niMing();
         InterFace interFace=new InterFace() {
             @Override
             public void niMing() {
                 System.out.println("匿名内部类2");
             }
         };
         interFace.niMing();

    }
}
