package 多态;

public class Mainplay {
    public static void main(String[] args) {
        Fu one=new Zi1();
        System.out.println(one.num);
        one.method();
//        Zi two =(Zi) one;
//        two.methodZi();
        if(one instanceof Zi){
            Zi zi=(Zi) one;
            zi.methodZi();
        }
        if(one instanceof Zi1){
            Zi1 zi1=(Zi1) one;
            zi1.methodZi1();
        }
    }

}
