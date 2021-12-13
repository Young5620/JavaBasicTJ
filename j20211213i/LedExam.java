package j20211213i;

public class LedExam {
    public static void main(String[] args) {
        TV tv = new LedTV();
        tv.turnOn();
        tv.ChangeVolume(8);
        tv.ChangeChannel(39);
        tv.turnOff();
    }
}
