package j20211213i;

public class LedTV implements TV {
    // LedTV클래스는 TV인터페이스를 구현했다.
    // TV에 정의된 매서드 들을 모두 구현해야만 한다.

    //@_________ : annotation 애너테이션
    // 확인요청의 의미, 필수는 아닌 선택
    @Override
    public void turnOn(){
        System.out.println("TV On");
    }
    @Override
    public void turnOff(){
        System.out.println("TV Off");
    }
    @Override
    public void ChangeVolume(int volume){
        System.out.println("volume change");
    }
    @Override
    public void ChangeChannel(int channel){
        System.out.println("channel change");
    }

}
