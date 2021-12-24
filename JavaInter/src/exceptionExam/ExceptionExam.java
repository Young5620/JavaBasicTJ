/*
 예외처리 (Exception Handling)
 프로그래이 실행 중 어떤 원인에 의해 오작동하거나 비정상적인 종료가 되는 경우가 있다.
 이러한 결과를 초래하는 원인을 에러 또는 오류라고 한다. -> 예외처리
 
 	컴파일에러 : 컴파일 시 발생하는 에러 - 프로그램 진입 불가
 	-> 오타나 잘못된 구문, 잘못된 자료형 등 기본적인 검사를 수행하여 오류를 확인
 	런타임에러 : 실행 중에 발생하는 에러 - 프로그램 진입후 동작중에 발생
 	-> 컴파일 시 에러가 발생하지 않았다고 하더라도 프로그램이 동작 중에 에러가 발생할 수 있다. 
 	프로그램 실행 중 동작을 멈춘 상태로 오랜시간 지속되거나 갑자기 프로그램이 실행이 멈추고 강제종료되는 경우 등
 	논리적에러 : 실행은 되는데 의도와 다르게 동작
 	
 	자바에서는 발생할 수 있는 오류를 Exception과 Error클래스로 정의하고 있다.
 	에러 error : 프로그램 코드에 의해 수습될 수 없는 심각한 오류
 	예외 exception : 프로그램 코드에 의해 수습할 수 있는 다소 미약한 오류
 
 try-catch 구문
 에러는 어쩔수 없지만 (프로그래머가 수습불가) 예외는 프로그래머가 그에 대한 처리를 미리 해주어야한다.
 
 예외처리 : 프로그램 실행시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것을 말하며
 예외처리의 목적은 예외의 발생으로 인한 프로그램의 비정상적인 종료를 막고 정상적인 실행상태를 유지할 수 있도록 하는 것이다.
 
 try{
 	//예외가 발생할 가능성이 있는 문장들을 넣는다.
 }
 catch (Exception e) {
 	//예외가 발생시 예외처리구문
 }
 fanally {
 	//예외 발생 유무와는 상관없이 항상 실행, 생략가능
 }
 
 1.발생한 예외와 일치하는 catch블록이 있는지 확인한다.(catch가 여러개 존재가능)
 2.일치하는 catch블록을 찾게되면 그 블록의 문장을 수행하고 빠져나간다.
 
 *.예외가 발생하지 않는 경우는 catch를 거치지 않고 빠져나간다.
 
 예외 강제 발생 시키기 throw
 
 매서드에 예외선언 : 예외를 매서드에 선언하여 처리한다.

 Exception in thread "main" java.lang.Exception
	at JavaInter/exceptionExam.ExceptionExam.method2(ExceptionExam.java:52)
	at JavaInter/exceptionExam.ExceptionExam.method1(ExceptionExam.java:49)
	at JavaInter/exceptionExam.ExceptionExam.main(ExceptionExam.java:57)
	
	1. 예외가 발생했을 때 3개의 매서드가 실행되었고
	2. 예외가 발생한 곳은 method2 이며
	3. main매서드가 method1(), method1()이 method2() 호출했다는 것을 알 수 있다.


예외처리 방법
- method1() 예외처리 - 예외가 발생한 그 해당 위치에서 바로 예외처리
	호출한 main은 method1()에서 에러가 발생했는지 조차 알 수가 없게 된다.
- main() 예외처리 - 예외 발생 매서드를 호출한 지점에서 예외를 받아서 처리
	예외를 돌려 받게 되면 예외를 인지할 수 있게된다.
	
finally 블럭 - 예외의 발생 여부와는 상관없이 어떠한 경우에도 실행되는 코드들을 포함시킨다.
	선택적으로 사용여부를 결정할 수 있다.필수는 아니다.
	

예외 되던지기 (Exception Re-throwing)

한 매서드에 발생 가능한 예외가 여러개가 있을 경우 몇개는 매서드내에서 자체적으로 처리하고
나머지는 호출부로 던져서 처리한다. 양쪽에서 나눠서 처리한다.
심지어는 하나의 예외도 양쪽에서 처리 할 수 있다. 예외를 처리하고 그 예외를 다시 호출한 곳으로 던져서
양쪽에서 모두 처리하는 방법이다. -> 예외 되던지기

예외가 예외를 발생시킨다. (chained exception)
예외A가 예외B를 발생시킨다면 A를 B의 '원인예외(cause exception)'이라고 한다.

try {
startInstall(); //에러발생..
copyFiles();
}
catch(SpaceException e){
installException ie - new InstallException("설치중 예외 발생"); 예외생성
ie.initCause(e); // InstallException의 원인 예외를 지정
throw ie;
}
catch (MemoryException me){
...
}
 */


package exceptionExam;

public class ExceptionExam {
	
	static void method1() throws Exception{
		try {
			throw new Exception();
		}
		catch(Exception e) {
			System.out.println("method1()에서 예외처리"); //예외처리 완료
			throw e;
		}
	}

	public static void main(String[] args) {
		//method1()과 main매서드 양쪽의 catch블럭이 모두 실행되었다.
		//method1()에서 예외처리를 하고도 throw문을 통해 다시 예외를 발생시켰다.
		//이 새로 생성된 예외를 main으로 던져서 throws 한 번더 처리된다.
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("Main에서 예외처리");
		}
		
		
//		try {
//			System.out.println("실행");
//			throw new Exception();
//		}
//		catch(Exception e) {
//			System.out.println("에러발생");
//		}
//		finally {
//			System.out.println("항상실행");
//		}
//	static void method1() throws Exception {
//		method2();
//	}
//	static void method2() throws Exception {
//		throw new Exception();
//	}
//
//	public static void main(String[] args) throws Exception//매서드에 예외선언
//	{
//		try { //던진곳에서 처리
//			method1();
//		}
//		catch (Exception e) {
//			System.out.println("main에서 예외를 처리");
//		}
		
	
	
//	static void method1() throws Exception {
//		try {
//			throw new Exception();
//		}
//		catch (Exception e) {
//			System.out.println("method1에서 예외가 처리되었습니다.");
//		}
//	}
//	static void method2() throws Exception {
//		throw new Exception();
//	}
//
//	public static void main(String[] args) throws Exception//매서드에 예외선언
//	{
//		method1();
	
	
//	static void method1() throws Exception {
//		method2();
//	}
//	static void method2() throws Exception {
//		throw new Exception();
//	}
//
//	public static void main(String[] args) throws Exception//매서드에 예외선언
//	{
//		method1();
		
		

		//throw new Exception(); 들어가지도 못한다. 진입전에 에러발생
		//System.out.println("예외발생");
		//throw new RuntimeException(); //일단 들어가서 에러발생
		
		
		
//		try {
////			Exception e = new Exception("예외 강제발생");
////			throw e;
//			throw new Exception("예외 강제발생");
//		}
//		catch (Exception e) {
//			System.out.println("에러메세지 : " + e.getMessage());
//		}
//		System.out.println("프로그램 종료");
		
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0); //예외발생 
//			System.out.println(4); 
//		}
//		catch (ArithmeticException ae) { 
//			System.out.println("에러메세지 : " + ae.getMessage());
//		}
//		System.out.println(6);
//		
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0); //예외발생  즉시 catch로 넘어간다. 4출력x
//			System.out.println(4); //실행되지 않는다.
//		}
//		catch (ArithmeticException ae) { //특정에러 발견이 먼저실행
//			if(ae instanceof ArithmeticException) {
//				System.out.println("true");
//			}
//			System.out.println("ArithmeticException");
//		}
//		catch (Exception e) {
//			System.out.println("Exception");
//		}
//		System.out.println(6);
		
		
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(0/0); //예외발생  즉시 catch로 넘어간다. 4출력x
//			System.out.println(4); //실행되지 않는다.
//		}
//		catch (Exception e) {
//			System.out.println(5);
//		}
//		System.out.println(6);
		
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(3);
//			System.out.println(4);
//		}
//		catch (Exception e) {
//			System.out.println(5); //예외가 없기 때문에 5출력이 되지않는다.
//		}
//		System.out.println(6);
		
		
		
		
//		int num = 100;
//		int result = 0;
//		
//		for (int i =0; i<10 ; i++) {
//			try {
//				result = num / i;
//				System.out.println(result);
//			}
//			catch (ArithmeticException e) {
//				System.out.println("0으로는 나눌 수 없습니다.");
//			}
//			
//		}
	}

}
