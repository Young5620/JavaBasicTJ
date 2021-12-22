/*
 오버라이딩 overriding 조상클래스로부터 상속받은 매서드의 내요을 변경하여 동일한 이름으로 자식 클래스에 만드는 것.
 
 1. 부모의 매서드 이름과 동일한 이름을 사용한다.
 2. 부모의 매서드에 있는 매개변수와 같아야한다.
 3. 부모의 매서드에 있는 반환타입과도 동일하여야 한다.
 
 오버로딩과 오버라이딩
 오버로딩 : 기존에 없는 새로운 매서드를 정의하는 것(new)
 오버라이딩 : 상속받은 매서드의 내용을 변경하는 것(change, modify)
 
 class Parent{
 	void parentMethod(){
 	}
 }
 
 class Child extends Parent{
 	void parentMethod(){ // 오버라이딩
 	}
 	void parentMethod(int i){ // 오버로딩
 	}
 	void childMethod() {}
 	void childMethod(int i) {}
 	void childMethod() {} // 에러..중복정의
 	
 
 super
 생성자에서 this를 사용하듯 상속에서는 super를 사용해서 부모클래스를 가리킨다.
 }
 */


package OopExam;

public class OverridingExam {

	public static void main(String[] args) {
		

	}

}
