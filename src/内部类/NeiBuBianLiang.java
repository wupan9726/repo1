package 内部类;

public class NeiBuBianLiang {
    int num=10;
    public class NeiBu {
        int num = 20;

        public void method() {
            int num = 40;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(NeiBuBianLiang.this.num);
        }
    }
        public void method1(){
             class juBu{//修饰符什么都不能写，局部内部类
            int num=100;
            public void method2(){
                System.out.println(num);
            }
            }
            juBu jubu=new juBu();
             jubu.method2();
        }
        public void method3(){
        final int num=200;//局部变量必须不可改变，内容不发生改变才能用该变量
        class Inner{
            public void method4(){
                System.out.println(num);
            }
        }
        Inner inner =new Inner();
        inner.method4();
        }
    }

