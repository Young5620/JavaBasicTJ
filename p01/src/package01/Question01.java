package package01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		//크기 판별
		//숫자를 입력하세요>>
		//숫자를 입력하세요>>
		
		//앞 숫자가 큽니다.
		//계속 할까요?(계속: o , 중단: x)
		//프로그램을 종료합니다.
		//시도횟수 : 
		//앞 숫자가 큰 경우 : 
		//뒷숫자가 큰 경우 :
		
//		System.out.print("숫자를 입력하세요>>");
//		int x = sc.nextInt();
//		System.out.print("숫자를 입력하세요>>");
//		int y = sc.nextInt();
//		int count1 = 0, count2 = 0;
//		String tr = " ";
//		while (true) {
//			if (x>y) {
//				System.out.println("앞숫자가 큽니다.\n계속할까요?");
//				tr = sc.nextLine();
//				count1 ++;
//			}else if (x<y) {
//				System.out.println("뒷숫자가 큽니다.\n계속할까요?");
//				tr = sc.nextLine();
//				count2 ++;
//			}
//			if(tr.equals("x")) {
//				break;
//			}
//		System.out.printf("프로그램을 종료합니다.%n시도횟수: %d%t앞숫자가 큰경우: %d%t뒷숫자가 큰경우: %d",(count1+count2), count1,count2);
//		
//	}
		int count = 0; //전체 질문 횟수
		int fnum = 0; //앞 숫자 큰 경우 변수
		int lnum = 0; //뒤 숫자 큰 경우 변수
		char ox = 'o'; //계속 진행여부 변수
		Scanner sc = new Scanner(System.in); // 입력 객체 생성

		while(ox != 'x') { //반복 구문 시작
			System.out.print("숫자를 입력하세요>>"); //입력구문
			int a = sc.nextInt();
			System.out.print("숫자를 입력하세요>>");
			int b = sc.nextInt();
			
			if(a>b) {
				System.out.println("앞숫자가 큽니다.");
				fnum++;
				count++;
			}else {
				System.out.println("뒷숫자가 큽니다.");
				lnum++;
				count++;
			}
			System.out.print("계속 할까요?(계속:o 중단: x): ");
			String tempo = sc.next();
			ox = tempo.charAt(0);
		}

		System.out.printf("프로그램을 종료합니다.%n시도횟수: %d%t앞숫자가 큰경우: %d%t뒷숫자가 큰경우: %d",count, fnum,lnum);
}
}
