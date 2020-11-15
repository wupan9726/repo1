package Data类;


public class main {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        DemoData one=new DemoData();
        one.Datamethod();
        one.DemoDate01();
        one.DemoDate02();
        demo();

    }

    private static void demo() {

            long l = System.currentTimeMillis();
            for (int i = 0; i < 9999; i++) {
                System.out.println(i);
            }
            long s=System.currentTimeMillis();
            System.out.println(s-l);
        }
    }

