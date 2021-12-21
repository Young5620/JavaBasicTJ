/* 선언 위치에 따른 변수의 종류
 - 클래스변수(class variable), 인스턴스(객체)변수(instance variable), 지역변수(local variable)
 - static 붙은 변수는 클래스 변수 / static이 붙지 않으면 객체 변수
 
 class x {
 	int iv; 객체변수(객체 생성시 생성)
 	static int cv; 클래스 변수(공유변수, 클래스가 메모리에 올라갈 때 생성)
 	void methodY(){
 		int iv = 0; 지역변수(매서드 안에서 변수선언)
 	}
 }
 
 인스턴스 변수 즉 객체 변수는 객체가 생성될 때 마다 함께 생성되므로 객체마다 각기 다른 값을 유지할 수 있다.
 반면, 클래스 변수는 모든 객체들이 하나의 저장공간을 공유한다. 따라서 항상 같은 공통된 값을 갖는다.
 
 */

package OopExam;

public class VariableExam {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.width = " + Card.height);
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", "+ c1.number);
		System.out.println("c2은 " + c2.kind + ", "+ c2.number);
		
		c1.width = 50; //c1을 수정하였으나 Card.width도 변경
		c1.height = 150;
		System.out.println(" - 클래스 변수 출력 - ");
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.width = " + Card.height);
		System.out.println(" - c1 변수 출력 - ");
		System.out.println("c1.width = " + c1.width);
		System.out.println("c1.width = " + c1.height);
		System.out.println(" - c2 변수 출력 - ");
		System.out.println("c2.width = " + c2.width);
		System.out.println("c2.width = " + c2.height);
	}
}

class Card {
	String kind; //객체변수
	int number; //객체변수
	static int width = 100; //클래스변수
	static int height = 250; //클래스변수
}