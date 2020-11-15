package String;

public class Demo01String {
    public static void main(String[] args) {
        /*String str=new String();
        System.out.println(str);
        char[] array={'a','b','c'};
        String str1=new String(array);
        System.out.println(str1);
        byte[] bytearray={97,98,99};
        String str2=new String(bytearray);
        System.out.println(str2);*/
//       public bollean equals(String str)方法区分大小写比较内容
        String str1 ="Hello";
        String str2="Hello";
        char[] array={'H','e','l','l','o'};
        String str3=new String(array);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("Hello".equals(str2));
//       public bollean equalsIgnoreCase（String str）方法不区分大小写比较
        String str4="hello";
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));
//        public int length()获取字符串长度
        int num= str1.length();
        System.out.println(num);
//        public String concat(String str)将当前字符串和参数字符串拼接成为返回值新的字符串
        String str5="Java";
        System.out.println(str1);
        System.out.println(str5);
        System.out.println(str1.concat(str5));
//        public char charAt(int index)获取指定索引位置单个字符
        System.out.println("0号位置的字符："+str1.charAt(0));
//        public int indexOf(String str)查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1,只看第一次
        System.out.println(str1.indexOf("lo"));
//        截取字符串
//        public String substring（int index）获取从参数位置一直到字符串结尾，返回新的字符串
        System.out.println(str1.substring(1));
//        public String substring（int begin，int end）获取从参数位置到指定结束位置，返回新的字符串
//        左闭右开区间[1,3}
        System.out.println(str1.substring(1,3));
//        public char[] toCharArray()将字符串拆分成字符数组返回
        System.out.println(str1.toCharArray());
//        public String replace(char a,char b);将a替换为b
        System.out.println(str1.replace('l','o'));
//        public string[] split(String regex)切割字符
        String stra="aaa.bbb.ccc";
        String[] array1 =stra.split("\\.");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
}
