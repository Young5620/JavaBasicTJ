package functionExam;

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);
	}
	Card2(String kind , int number){
		this.kind = kind;
		this.number = number;
	}
	// Card 인스턴스(c1,c2)의 toString()을 호출하면 객체가 갖고 있는 변수 kind와 number의 값을
	// 문자열로 변환하여 반환하도록 toSting()을 오버라이딩했다. 오버라이딩 할 때 접근 제어자 public으로 선언하여 
	// Card클래스의 toString()과 동일하게 설정하였다. -> 다른 클래스일 때 지금은 같은 클래스에서 해서 public을 뺐다.
	@Override //(에너테이션)확인해줘 -> 확인해서 이거좀써줘의 의미
	public String toString() {
		return "Kind : " + kind + ", Number : " + number;
	}
}

public class ToStringExam2 {

	public static void main(String[] args) {
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
