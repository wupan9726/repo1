package Pratice;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerDff(){
        System.out.println("电脑关机");
    }
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse=(Mouse) usb;
            mouse.kick();
        }
      else  if(usb instanceof KeyBoard){
            KeyBoard keyboard =(KeyBoard) usb;
            keyboard.scanner();
        }
        usb.off();
    }
}
