package InheriEx;

class Tv {
	boolean power;
	int channel;
	void power() {}
	void channelUp() {}
	void channelDown() {}
}

class CaptionTv extends Tv{
	boolean caption; // 캡션 위의 기능이 아래로 내려옴
	void caption() {}

}

public class CaptinTV {

	public static void main(String[] args) {
		CaptionTv tv = new CaptionTv();
		tv.power(); // 부모 매서드
		tv.channel = 11; // 부모 변수
		tv.channelUp(); // 부모 매서드
		tv.channelDown();
		System.out.println(tv.channel);
		tv.caption = true;
		tv.caption();
		System.out.println(tv.caption);
	}

}
