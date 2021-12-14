package javaStudy;

public class VariableExam {
	// global variable
	// 변수의 선언 위치가 클래스 블록 안 - 전역변수
	// 변수의 사용 범위는 클래스 전체가 된다.
	int globalScope = 10;
	static int staticVal = 7;
	
	public void scopeTest(int value) {
		
		int localScope = 20;
		// local variable
		// 매서드 안에서 선언 - 지역변수
		// 변수의 사용 범위는 그 매서드로 제한된다.
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}

	public static void main(String[] args) {
		// 메인 매서드	
//		System.out.println(globalScope); //static을 안걸어서 오류
//		System.out.println(localScope); //지역변수
//		System.out.println(value); //지역변수
//		System.out.println(staticVal); 
		//static 변수는 static을 선언하지 않은 매서드 내에서는 사용을 해도 문제가 되지 않는다.
	}

}
