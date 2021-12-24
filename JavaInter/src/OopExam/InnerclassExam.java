/*
 InnerClass 내부클래스 - 클래스안에 선언된 클래스, 두 클래스가 아주 긴밀한 관계에 있을 때 사용한다.
 두 클래스 간에 서로 쉽게 접근할 수 있는 장점과 외부에서 불필요한 클래스를 감춤으로 코드의 복잡성을 줄일 수 있다.
 
 class A{}    class A{
                class B{}
              } // 이 때  class A외에는 class B를 거의 사용하지 않는다.
 class B{}
 
 내부클래스 구분 - 인스턴스 클래스, 스태틱클래스, 지역클래스, 익명클래스(이름없는 1회용)
 내부클래스 선언 - 변수 선언과 비슷, 변수 선언 위치에따라 인스턴스변수, 클래스변수, 지역변수로 나누듯이
 			내부클래스도 선언위치에 따라 나뉜다.
 
 class Outer{
 	int iv = 0;
 	static int cv = 0;
 	
 	void myMethod(){
 		int iv = 0;
 	}
 }
 
 class Outer{
 	class InstanceInner{
 		static class StaticInner{}
 		void myMethod(){
 			class LocalInner{}
 		}
 	}
 }
 */


package OopExam;

public class InnerclassExam {
	class InstanceInner {
		int iv = 100;
		//static int cv = 100; //에러 static 사용불가
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 100;
		static int cv = 100; // static클래스에서는 사용가능
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
