package edu.gt.cs;

import java.util.Scanner;

public class Test {
	//edu.gt.cs.Test
	//패키지는 여러개가 있을 수 있고 하나의 패키지 내에는 자바클래스파일을 여러개 가질 수 있다.
	//edu패키지 아래 gt패키지 아래 cs패키지 안에 Test라는 클래스가 위치해있다.
	
	//자바에서의 데이터 종류를 설명
	//논리형 boolean은 true와 false 값을 가진다.
	//정수형은 integer에서는 int와 long,short,byte이 있다.
	//실수형은 double과 float이 있다.
	//문자형은 String과 char이 있다.
	
	
//		for(int i = 0; i<=3; i++) {
//			System.out.println(i);
//			//i가 0부터 시작해서 10까지 하나씩 증가하는 프로그램
//			//i가 0일때 조건 3보다 작거나 같음을 만족하므로 i값 0을 출력
//			//i가 1일때 조건 3보다 작거나 같음을 만족하므로 i값 1을 출력
//			//i가 4일때 조건 3보다 작거나 같음을 만족하지 못하므로 for문을 종료한다.
//			//실행결과
//			//0
//			//1
//			//2
//			//3
//		}
		
//		int[] n1 = new int[5];
//		//n1(변수)에 {0,0,0,0,0} 을 입력
		
//		int x = 100; 정수형 변수 x를 100으로 초기화한다.
//		int y = 200; 정수형 변수 y를 200으로 초기화한다.
//		int z = x + y; 메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 산술연산을 하여 다시 메모리에 저장한다.
//		//정수형 변수 z는 정수형 변수 x와 y값을 더한 값을 입력한다.
//		
//		
//		int age = 23; 정수형 변수 age를 23으로 초기화한다.
//		String name = "Kim"; 문자형 변수 name에 Kim을 입력하여 저장한다.
//		String x = name + "의 나이는 " + age;
//		//메모리(ram)에 있는 변수들의 값을 cpu가 가지고 와서 결합연산을 하여 다시 메모리에 저장한다.
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요>>");
//		String name = sc.next();
//		System.out.println("나이를 입력하세요>>");
//		String age = sc.nextInt();
//		
//		String h = "안녕하세요"; //한들은 1글자가 2byte
//		10byte(string) = 10byte(char) //총메모리의 크기는 20byte
//				
//		int n = Integer.parseInt("100");
//		Scanner sc = new Scanner(System.in);
//		Random r = new Random(10);
	public static void main(String[] args) {
		
		//-------------------
		//당신의 정보를 입력하세요
		//-------------------
		
		//당신의 부서는 >>>
		//당신의 소솟은 _____입니다.
		//당신의 나이는 >>>
		//당신의 작년 나이는 ____이였습니다.
		//당신의 키는 >>>
		//당신은 키가 (크다/보통이다/작다) 키가 180이상이면 크다 170이상이면 보통이다 나머지는 작다
		
		//프로젝트명 : p1
		//패키지명 : package 2
		//자바 파일명 : text1
		
		System.out.println("---------------\n당신의 정보를 입력하세요.\n---------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 부서는 >>> ");
		String dep = sc.next();
		System.out.println("당신의 소속은 " + dep + "입니다.");
		System.out.print("당신의 나이는 >>> ");
		int age = sc.nextInt();
		System.out.println("당신의 작년 나이는 " + (age-1) + "이였습니다.");
		System.out.print("당신의 키는 >>> ");
		double height = sc.nextDouble();
		if(height>=180.0) {
			System.out.println("당신의 키가 큽니다.");
		}else if (height>=170.0) {
			System.out.println("당신의 키가 보통입니다.");
		}else {
			System.out.println("당신의 키가 작습니다.");
		}
		
		
	}
}
