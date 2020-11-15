package Pratice;

public class MainPlay {
    public static void main(String[] args) {
        Computer computer =new Computer();
        computer.powerOn();
        USB usb=new Mouse();
        computer.useDevice(usb);
        USB usb1=new KeyBoard();
        computer.useDevice(usb1);
        computer.powerDff();
    }
}
