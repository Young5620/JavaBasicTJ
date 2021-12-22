/*
 생성자 Constructor
 생성자는 객체가 생성될 때 자동으로 제일 먼저 호출되는 '초기화 매세드'
 따라서 객체 변수의 초기화 작업에 주로 사용된다.
 웹 개발에서도 게시물이나 사용자 정보들을 데이터베이스에서 가져와서 생성자를 통해 객체로 만들어 사용된다.
 생성자도 결국 매서드이므로 오버로딩이 사용된다.
 
 1. 클래스 명과 동일한 이름을 사용한다.
 2. 리턴형 없고 리턴도 없다.
 
 기본생성자 default constructor
 생성자를 모르고도 클래스를 통해서 객체를 생성해 왔지만 사실 모든 클래스에는 반드시 하나 이상의 생성자가 정의 되어야만 한다.
 그러나 생성자를 정의하지 않고서도 사용할 수 있었던 이유는 기본생성자 덕분이다.
 생성자가 하나도 정의되지 않은 경우 자바가 자동으로 기본생성자를 하나 추가해주기 때문에 문제가 발생하지 않은 것이다.
 기본생성자는 매개변수도 없고 아무런 내용도 없고 리턴도 없는 아주 간단한 생성자를 말한다. 이름뿐인 생성자
 
 class Car{
 	Car() { // 기본생성자
 	}
 }
 
 매개변수가 있는 생성자
 class Car{
 	Car() { // 기본생성자
 	}
 	Car(String a, String b){
 		color = a;
 		door = c;
 	}
 }
 
 생성자에서 다른 생성자 호출
 규착
 1. 생성자의 이름으로 클래스이름 대신 this를 사용한다.
 2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
 */


package OopExam;

public class ConstructorExam {

	public static void main(String[] args) {
		

	}

}
