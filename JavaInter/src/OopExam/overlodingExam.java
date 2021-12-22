/* Overloding
 자바에서는 한 클래스 내에 이미 사용 중인 이름과 동일한 이름의 매서드가 있더라도 매개변수의 개수가 다르거나 타입이 다르면
 같은 이름을 사용하여 매서드를 정의할 수 있다.
 오버로딩의 사전적인 의미는 '과적하다' 많이 싣는 것을 말한다.
 보통 하나의 매서드 이름에 하나의 기능만을 구현하는데 하나의 이름으로 여러 기능을 구형하고자 할 때 사용된다.
 1. 매서드명이 동일해야한다.
 2. 매개변수의 개수 또는 타입이 달라야한다.
 3. 오버로딩에서 반환타입은 오버로딩 구현에 있어서 아무런 영향을 주지 못한다.
 
 예) println();
 println(int x);
 println(String a, String b);
 println(long a);
 장점 : 매서드 오버로딩을 사용하면 사용자가 단 하나의 매서드 명으로 다양한 처리 결과를 얻을 수 있도록 구성할 수 있다.
 (매번 다른 이름의 매서드들을 생성할 필요가 없다.)
 printlnline
 printlnint1
 printlnint2
 
 
 가변인자 오버로딩 - JDK 1.5 부터 매개변수의 개수를 동적으로 지정할 수 있다.
 가변인자 variable arguments
 
 */

package OopExam;

public class overlodingExam {

	public static void main(String[] args) {
//		System.out.println(add(2,3));
//		System.out.println(add(2,3,4));
//		add("홍길동",990);
		String[] strArr = {"10","20","30"};
		String[] strArr1 = {"10","20","30","40","50"};
		int[] intArr1 = {1,2,3};
		int[] intArr2 = {1,2,3,4,5};
		// 102030
		// 10 20 30
		// 10-20-30
		// 10 20 30 40 50
		System.out.println(arrCal("+",intArr1));
		System.out.println(arrCal("*",intArr2));
		System.out.println(concat("",strArr));
		System.out.println(concat("",strArr1));
		
		System.out.println(concat("-",strArr));
		System.out.println(concat("/",strArr1));

	}
	
	static int arrCal(String a, int...args) {
		int result = (a.equals("+") ? 0 : 1);
		for(int arg : args) {
			if(a.equals("+")) {
				result +=arg;
			}
			else if (a.equals("*")) {
				result *=arg;
			}
		}
		return result;
			
	}
	static String concat(String a, String... args) {
		String result = "";
		for(String str : args) {
			result +=str +a;
		}
		return result;
	}
//	static int add(int a, int b) {
//		int result = a+b;
//		return result;
//	}
//	static int add(int a, int b, int c) {
//		int result = a+b+c;
//		return result;
//	}
//	static void add(String x , int b) {
//		System.out.println(x + "님의 토익점수는 " + b);
//	}


}
