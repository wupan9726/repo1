package 泛型;

import java.util.ArrayList;

public class ShiaXian {
    public void method(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
