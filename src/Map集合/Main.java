package Map集合;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhou", 18);//向map集合中添加元素
        map.put("ju", 19);
        map.put("lin", 20);
        map.put("wu", 21);
        Integer wu = map.put("wu", 22);//覆盖原值，并把旧值返回
        System.out.println(wu);
        System.out.println(map);//无序，键值相同时用新Value值覆盖原值
        boolean zhou = map.remove("pan", 18);//用键值删除会返回所对应的vaule值，同时使用键值和vaule值不会返回,会返回是否删除成功，担都能达到删除效果
        System.out.println(map);
        System.out.println(zhou);
        Integer ju = map.get("ju");//通过键值取得对应的vaule值并返回
        System.out.println(ju);
        boolean a = map.containsKey("lin");//containskey方法通过键值判断表中是否有这个元素。返回booiean值
        System.out.println(a);
        //遍历Map表的第一种方式keyset
        //1.使用map中的keyset方法将map表转化成set表，表中存储键值
        //2.使用迭代器或增强for遍历键值
        // 3.在使用map.get方法取出value值

        System.out.println("======================");
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("wu",12);
        map1.put("pan",13);
        map1.put("zhou",14);
        map1.put("lin",15);
        Set<String> strings = map1.keySet();
        Iterator<String> it =strings.iterator();
       /* while(it.hasNext()){
            String next = it.next();
            Integer in = map1.get(next);
            System.out.println(next+"="+in);
        }
*/
        for (String s : strings) {
            Integer num = map1.get(s);
            System.out.println(s+"="+num);
        }
        System.out.println("============================");
        //Map表遍历的第二种方式entrykey
        //1.使用map中的entrykey转变为set表
        //2.然后直接遍历，或者用过getkey和getvalue方法遍历。推荐直接遍历对象即可
        HashMap<String,Integer> map2=new HashMap<>();
        map2.put("wu",21);
        map2.put("lin",22);
        map2.put("zhou",26);
        map2.put("pan",27);
        Set<Map.Entry<String, Integer>> set = map2.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println(entry);
        }
        System.out.println("============================");
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> all = iterator.next();
            System.out.println(all.getKey()+"="+all.getValue());

//            System.out.println(all);
        }
    }
}
