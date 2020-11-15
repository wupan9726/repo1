package 可变参数;



//当方法的参数列表数据类型确定，参数个数不确定，就可以使用可变参数,一个方法只能由一个可变参数，如果方法参数有多个，可变参数必须写在末尾；
public class KeBian {
    public static void main(String[] args) {
      int num=  method(10,20,50,60,58);
        System.out.println(num);
}
    public static int method(int...arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
