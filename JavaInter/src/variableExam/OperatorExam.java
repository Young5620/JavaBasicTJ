package variableExam;

import java.util.Scanner;

public class OperatorExam {
	
/* 연산자 Operator
  연산자는 '연산을 수행하는 기호' +,-,*,/ ...
  연산자 연산을 수행하는 기호
 연산자 연산을 수행하는 기호이며 피연산자는 작업대상
 연산자는 피연산자로 연산을 수행하고 나서 항상 그 결과값을 반환한다.
 (연산대상, 변수, 상수, 수식...)
 연산자 + 
 x + 3 식
 x,3 이 피연산자.
 연산자와 피연산자를 조합하여 계산을 표현한 것을 식이라 하고 
 그 식을 계산항여 결과를 얻는 것을 '평가 evaluation'이라고 한다.
 
 연산자의 종류
  - 산술연산자 : + - * / %
  - 비교연산자: > < >= <= ==(같다) !=(같지않다)
  - 대입연산자: = (우변의 내용을 좌변으로 저장) 
  - 논리연산자: || && | &
  - 기타연산자: 삼항연산자(if없이 조건문)...
  
  피연산자의 개수에 따라...
  단항연산자 ++/--
   단독으로 사용될 때는 ++i나 i++값의 차이가 없다. but i++을 많이 사용
 
 나머지연산자 %
 나머지 연산자는 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지만 결과로 반환하는 연산자.나머지 연산자는 홀수, 배수, 짝수 검사에 많이쓴다.
  이항연산자
  삼항연산자 (조건식) ? true : false;
  
 연산자의 우선순위
 일반 수학계산 순서와 동일 /곱셈이 덧셈보다 먼저 수행 등등
 
 단항 연산자
 증가연산자 ++
 증감연산자 --
 
 등가비교 연산자(숫자비교)
 == : 같으면 true
 != : 다르면 true
 
 .equals() (문자비교)
 문자열을 비교할 때는 ==를 쓰지말고 .equals()를 사용하자.
 
 */

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc"); //메모리주소가 다르다. ==->같은주소에 있니? 물어보는것
		String str3 = "abc";
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc"); //글자를 비교할때는 .equals()를 써야하는 이유
		System.out.printf("str3==\"abc\" ? %b%n", str3=="abc");
		
		System.out.println();
		
		System.out.printf("\"abc\".equals(\"abc\") ? %b%n", "abc".equals("abc"));
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str3.equals(\"abc\") ? %b%n", str3.equals("abc"));
		
		System.out.println();
		
		System.out.printf("str1==str3 ? %b%n", str1==str3);
		System.out.printf("str2==str3 ? %b%n", str2==str3);
		System.out.printf("str1.equals(str3) ? %b%n", str1.equals(str3));
		System.out.printf("str2.equals(str3) ? %b%n", str2.equals(str3));
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		
		//quiz1. 정수를 하나 키보드로 입력받아 그 수가 홀수인지 짝수인지를 출력하는 프로그램작성
//		System.out.print("입력하신 수는?");
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		
//		if(a%2==0) {
//			System.out.println("짝수입니다.");
//	}
//		else {
//			System.out.println("홀수입니다.");
//		}
//		

//		int x = 10 , y = 7;
//		
//		System.out.printf("x를 2로 나눈 나머지는 %d입니다.%n", x%2);
//		System.out.printf("y를 2로 나눈 나머지는 %d입니다.%n", y%2);
//		System.out.printf("x는 5로 나눈 나머지 %d입니다.%n", x%5);
		
		
//		System.out.printf("%d을 %d로 나누면%n" ,x,y);
//		System.out.printf("몫은 %d, 나머지는%d입니다.",x/y,x%y);
		
//		int i =5, j = 5;
//		System.out.println(i++);
//		System.out.println(++j);
//		
//		System.out.println("i= " + i + " j= " + j );
//		
//		int i = 5, j = 0;
//		j = i++;
//		
//		System.out.println("j=i++ 실행 후, i ="+ i +" j=" + j);
//		
//		i = 5;
//		j = 0;
//		j = ++i;
//		System.out.println("j=i++ 실행 후, i ="+ i +" j=" + j);
		
		
		//단항 연산자를 단독으로 사용할 때는 전위 후위 차이가 없다.
//		int i = 5;
//		i++;
//		System.out.println(i);
//		i = 5;
//		++i;
//		System.out.println(i);

	}

}
