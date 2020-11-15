package Data类;

import java.util.Date;

public class DemoData {
    public void Datamethod(){
        Date data=new Date();
        System.out.println(data);
    }

    public void DemoDate01(){
        Date d1=new Date(2546115515616l);
        System.out.println(d1);
    }
    public void DemoDate02(){
        Date date=new Date();
        long time = date.getTime();
        System.out.println(time);
        int day = date.getDay();
        System.out.println(day);
        System.out.println(date.getDate());
        System.out.println(date.getYear());
        System.out.println(date.getMonth());

    }


}
