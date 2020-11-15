package 数学工具类;

public class PractisePerson {
    public String fromArrayToString(int[] array){
        String str="{";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str+="word"+array[i]+"}";
            }else{

                str+="word"+array[i]+"#";
            }
        }
        return str;
    }
    public int countUpper(char[] charArray){
        int count=0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>='A'&&charArray[i]<='Z'){
                count++;
            }
        }
        return count;
    }
    public int countLower(char[] charArray){
        int count=0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>='a'&&charArray[i]<='z'){
                count++;
            }
        }return count;
    }
    public int cuontNumber(char[] charArray){
        int count=0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>='0'&&charArray[i]<='9'){
                count++;
            }
        }return count;
    }
}
