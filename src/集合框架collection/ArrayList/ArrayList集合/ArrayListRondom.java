package 集合框架collection.ArrayList.ArrayList集合;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListRondom {
    public void Rondom01(ArrayList<Integer> list,int num){
        Random r=new Random();
        for (int i = 0; i < num; i++) {
            list.add(r.nextInt(33) + 1);

        }
        System.out.println(list);

    }
    public void print(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public void print01(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            int num=list.size();
            if(i==num-1) {
                System.out.print(list.get(i) + "}");
            }else {
                System.out.print(list.get(i)+"@");
            }
        }
    }
    public void randomArray(ArrayList<Integer> list,int num){
        Random r=new Random();
        for (int i = 0; i <num; i++) {
            list.add(r.nextInt(100)+1);
        }
    }
    public void getSmalllist(ArrayList<Integer> list){
        ArrayList<Integer> smalllist=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                smalllist.add(list.get(i));
            }
        }
        System.out.println(smalllist);
    }
    public void enterNUm(ArrayList<Integer> list,int num){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
    }
}
