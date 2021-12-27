/* tostring
 객체에 대한 정보(객체 변수에 저장된 값들)를 문자열로 반환하는 매서드(함수)
 */

package functionExam;


class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind , int number) {
		this.kind = kind;
		this.number = number;
	}
	public String toString() {
		return "Kind : " + kind + ", Number : " + number; //오버라이딩
	}
	
}

public class TostringExam {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		
		//Card객체2개 생성 후 각 객체에 toString을 호출하였다. 그결과로 해시코드가 출력됐다.
		//클래스의 이름은 같아도 객체는 다르다는 것을 확인할 수 있다.
		//functionExam.Card@e580929
		//functionExam.Card@1d251891
		
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		
		System.out.println(today);
		System.out.println(today.toString());
		//String 클래스와 Date 클래스ㅢ toString()을 호출했더니 클래스 이름과 해시코드 대신에 다른 결과가 출력됐다.
		//String클래스의 toString()은 String객체가 가진 문자열을 반환하도록 오버라이딩 되어있다.
		//Date클래스의 경우 date객체가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 되어있다.
		//이처럼 toString()은 일반적으로 객체나 클래스에 대한 벙보 또는 객체 변수들의 값을 문자열로 변환하여 반환하도록 오버라이딩 되는것이 보통이다.
	}

}
