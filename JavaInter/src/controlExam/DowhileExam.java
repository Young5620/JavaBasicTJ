package controlExam;

import java.util.Random;
import java.util.Scanner;

public class DowhileExam {
//do-while은 while의 변형으로 기본 구조는 같지만
//while은 경우에 따라 단 한번도 실행되지 않는 경우도 있지만
//do-while은 반드시 한번은 무조건 실행되도록 한다.
	public static void main(String[] args) {
		//1에서 100사이의 난수를 생성해서 
		//1과 100사이에 정수를 입력하세요>>50 난수와 비교
		//더 작은 값으로 입력하세요>>
		//1과 100사이의 정수를 입력하세요>>20
		//더 큰값으로 입력하세요
		//정답입니다. 총 시도한 횟수는 ?번입니다.
//		Random ran = new Random();
//		int a = 1 + ran.nextInt(99);
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		int input = 0;
//		do {
//			System.out.print("1과 100사이의 정수값을 입력하세요>>");
//			input = sc.nextInt();
//			if(input> a) {
//				System.out.println("더 작은 값으로 다시 입력하세요.");
//			}else if (input<a) {
//				System.out.println("더 큰 값으로 다시 입력하세요.");
//			}
//			count++;
//		}
//		while(a !=input);
//			System.out.println("정답입니다." + count);
		
		
		//369 게임
		//100 이하에서 3의 배수 일 때 "짝"을 출력하시오
		//3이었을 때는 짝 36일 때는 짝짝 99일때는 짝짝
		
//		for(int i =1; i<=100 ; i++) {
//			System.out.println(i);
//			int tmp = i;
//			do {
//				if(tmp%10%3==0 && tmp%10 !=0) {
//					System.out.print("짝");
//				}
//			}
//			while((tmp/=10) !=0);
//		}System.out.println();
		
//		int sum =0;
//		int i = 0;
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			++i;
//			sum +=i;
//			System.out.println("i=" + i + "sum=" + sum);
//		}
//		System.out.println("i=" + i);
//		System.out.println("sum=" + sum);
		
		
		//3의 배수만 출력하시오 for와 continue를 사용해서
		
//		int x = 1;
//		for (x=1; x<100; x++) {
//			if(x%3 !=0) {
//				continue;
//			}
//			else {
//				System.out.println(x);
//			}
//		}
		
		//이름 붙은 반복문
		//break문은 근접한 단 하나의 반복문만 벗어날 수 있다.
		//여러개의 반복문이 중첩된 경우 break만으로는 완전히 벗어날 수 없다.
//		loop:
//			while() {
//				while() {
//					break loop;
//				}
//			}
		
		//ex)
//		loop;
//		for(int i =2 ; i<=9 ; i++) {
//			for (int j = 1; j <= 9 ; j++) {
//				if(j==5) {
//					break loop;
//					System.out.println(i + "*" + j + "=" + i*j);
//				}
//				System.out.println();
//			}
		
	

	}

}
