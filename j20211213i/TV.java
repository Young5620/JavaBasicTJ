package j20211213i;

public interface TV {
    //변수를 대문자로 설정하면 상수의 의미로 사용
    public int MIN_VOLUME=0;
    public int MAX_VOLUME=100;

    public void turnOn();
    public void turnOff();
    public void ChangeVolume(int volume);
    public void ChangeChannel(int channel);

}
