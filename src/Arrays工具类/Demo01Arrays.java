package Arrays工具类;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {


        //    public static String toString(数组)将数组按默认方式变成字符串
        int[] array = {10, 20, 40};
        System.out.println(Arrays.toString(array));
        //    public static void sort(数组)按默认升序对数组元素进行排序
        int[] array1 = {1, 3, 2, 4, 6, 4, 6, 2, 8, 9, 3, 7};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String str = "fajfhfushfjebfjfojfoshfij5484a";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.println(ch[i]);
        }


    }
}
