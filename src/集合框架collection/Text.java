package 集合框架collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//remove  删除集合元素
//clear   清空集合
//bollean result=coll.contains 判断是否包含某个元素
//isempty 判断集合是否为空
//.size 获取集合长度
//toarray 将集合转为数组，遍历数组
//迭代器 Iterator 是一个接口
//使用步骤
//1.使用集合方法中的iterator()获取迭代器的实现类对象，使用Iterator接口接收
//2.使用hasnext判断下一元素
//3.使用next去处xiay元素
//bolean hasnext() 判断集合中是否还有元素
//next() 返回迭代的下一元素 取出集合中的下一元素
public class Text {
    public static void main(String[] args) {
        Collection<Integer> coll=new ArrayList<>();
        coll.add(5);
        coll.add(6);
        coll.add(7);
        coll.add(8);
        System.out.println(coll);
       /* boolean result =coll.remove(5);
        System.out.println(coll);*/
//        coll.remove(6);
//        System.out.println(coll);
//        coll.clear();
//        System.out.println(coll);
//        boolean result1 =coll.contains(7);
//        System.out.println(result1);
//        boolean result2=coll.isEmpty();
//        System.out.println(result2);
//        System.out.println(coll.size());
        Iterator<Integer> iterator = coll.iterator();
      /*  for (int i = 0; i < coll.size(); i++) {
            boolean b = iterator.hasNext();
            System.out.println(b);
            int num=iterator.next();
            System.out.println(num);
        }*/
        while(iterator.hasNext()){
            boolean b = iterator.hasNext();
            int num=iterator.next();
            System.out.println(num);
        }



    }
}
