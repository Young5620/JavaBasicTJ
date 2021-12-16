package controlExam;
import java.util.Scanner;
public class WhileExam {
/*
 While 반복문은 for에 비해서 구조가 간단하다.
 조건식이 참일동안 반복 수행한다.
 조건식 생략불가, 보통식에 true를 넣어 무한반복 수행
 무한반복 설정 시에는 반드시 종료 조건을 만들어야 한다.
 
 for(;;) = while(true)
 
 while(조건식){}
 for(초기화;조건식;증감식)
 
 초기화
 while(조건식){
 증감식} 

 */
	public static void main(String[] args) {
		//quiz 1 - 1/ 2-3 / 3 - 6/.../10 - 55/
		Scanner scan = new Scanner(System.in);
		System.out.print("누적 합계를 원하는 숫자를 입력하세요.>>");
		int input = scan.nextInt();
		int i = 1;
		int sum = 1;
		while(i<=input) {
			System.out.println(i + " - " + sum);
			i++;
			sum = sum+i;
		}
		
		
		//quiz 숫자를 입력하면 그 각각의 숫자들의 합을 계산하여 출력하세요
//		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>>");
//		int input = scan.nextInt();
//		int sum = 0;
//		while(input!=0) {
//			sum += input%10;
//			input = input/10;
//		}
//		System.out.println("각 자리수의 합: "+ sum);
		
		
		//quiz while문을 써서 카운트 다운 시작 10 9 8 7 6 5 4 3 2 1  Awesome!!
		//카운트 다운을 하는 중간 중간에 쉬었다가다음 카운트로 넘어가도록
		
//		int i = 10;
//		System.out.println("카운트다운 시작!");
//		while (i>0) {
//			System.out.println(i);
//			i--;
//			long j = 9_999_999_999L; //시간 지연시키기
//			while(j>=0) {
//				j--;
//			}
//		}
//		System.out.println("Awosome!!");
//	
	}

}
