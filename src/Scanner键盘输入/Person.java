package Scanner键盘输入;

import java.util.Scanner;

public class Person {
    String name;
    public void showName(){
        System.out.println(name);
    }
    public void methodParam(Scanner sc){
        int num=sc.nextInt();
        System.out.println(num);
    }
    public Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
