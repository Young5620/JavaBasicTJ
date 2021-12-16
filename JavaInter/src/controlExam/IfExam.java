package controlExam;
import java.util.Scanner;
import java.util.Random;
public class IfExam {
/*
 제어문 Control Statement - If , Switch
 코드의 제일 위에서부터 아래로 한 문장씩 순차적으로 진행되는 프로그램의 흐름을 조절하여
 일부분은 건너뛰기도 하고 다시 위에서부터 내려올 수 있게 제어한다.
 
 int score = 80;
 if (score>60) {
 System.out.println("합격입니다.");
 }
 (90<=x && x<=100) 점수x가 90점 이상 100점 이하 동시만족
 (x<0 || x>100) 점수 x가 0미만 또는 100초과 하나만 만족
 (x%3==0 && x%2 !=0) 점수x가 3의 배수이긴 하지만 2의 배수는 아닌 조건
 (depar =="영업부" || depar == "기획부") 영업부와 기획부만 뽑는 조건
 
 if-else 구문
 else는 그 밖의 나머지 모든 것
 if(조건식){
 true..
 }
 else{
 else...
 }
 
 if-else if 구문
 처리해야할 경우의 수가 3개 이상이면 else if구문을 사용한다.
 조건식을 만족하면 더이상은 아래로 내려가지 않는다. (밑에 다른 조건식을 확인하지 않는다.)
 if(조건식){
 true..
 }
 else if(조건식){
 true...
 }
 else{
 else..
 }
 
 중첩 if
  if(조건식1){
 true..
 }
 else{
 	if(조건식2){
 		true...
 		}
 		else{
 			else..
 		}
 	} 
 }
 
 switch 구문
 if문의 경우 항목이 많아질수록 코드 가독성이 많이 떨어지게 된다.
 평균적인 처리시간도 항목이 늘어날수록 길어지게 된다.
 이런한 if문과는 달리 switch는 보다 간결하고 알아보기 쉽다.
 보통 처리해야하는 경우의 수가 아주 많을 경우에 switch
 switch로 만든 모든 구문은 if로 구현할 수 있지만 if로 만든 모든 구문을 switch로 구현할 수는 없다.
 
 1. 조건식을 계산
 2. 조건식에 만족하는 case 문으로 이동한다.
 3. 해당 case문의 구문들을 실행한다.
 4. break 만나기 전까지는 모든 구문을 전부 실행한다.
 *. switch구문의 조건식의 결과는 정수 또는 문자열이다.

 */
	public static void main(String[] args) {
		//주민등록번호를 입력하세요.>>
		// "당신은 남성입니다." "당신은 여성입니다."
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요. >> ");
		String id = scan.nextLine();
		char a = id.charAt(7);
		switch (a) {
		case 1 : case 3 : System.out.println("당신은 남성입니다."); break;
		case 2 : case 4 : System.out.println("당신은 여성입니다."); break;
		}
		
		//quiz4. 가위(1) 바위(2) 보(3)
		// 가위(1) 바위(2) 보(3) 중 하나를 입력하세요.
		// 당신은 가위이고 컴퓨터는 바위입니다.
		// 컴퓨터가 이겼습니다.
		// 당신은 가위이고 컴퓨터는 보입니다.
		// 당신이 이겼습니다.
		// 당신은 가위이고 컴퓨터는 가위입니다.
		// 비겼습니다.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요. >> ");
//		int x = scan.nextInt();
//		Random ran = new Random();
//		int a = 1 + ran.nextInt(3);
//		System.out.println("당신은 " + x + "이고 컴퓨터는 "+ a + "입니다.");
//		String result = " ";
//		switch (x-a) {
//		case -1 : case 2 : result = "컴퓨터가 이겼습니다."; break;
//		case 1 : case -2 : result = "당신이 이겼습니다."; break;
//		case 0 : result = "비겼습니다."; break;
//		}
//		System.out.println(result);
		
		
		
		
		//특정 월을 입력 받아서 3,4,5는 봄, 6,7,8은 여름 9,10,11은 가을 12,1,2 겨울
		//"?월의 계절은 ?입니다."
		//조건: switch구문의 총 줄의 수는 10줄 내외
//		Scanner scan = new Scanner(System.in);
//		int month = scan.nextInt();
//		String season = " ";
//		switch(month) {
//		case 3 : case 4 : case 5 : season = "봄"; break;
//		case 6 : case 7 : case 8 : season = "여름"; break;
//		case 9 : case 10 : case 11 : season = "가을"; break;
//		case 12 : case 1 : case 2 : season = "겨울"; break;
//		}
//		System.out.println(month + "월의 계절은 " + season + "입니다.");
		
	
		//Quiz2. 점수를 입력받는데 98이상이면 A+ 94이상이면 A 90이상이면 A-
//		Scanner scan = new Scanner(System.in);
//		System.out.print("점수를 입력하세요. ");
//		int score = scan.nextInt();
//		
//		if (score>=90) {
//			System.out.println((score>=98) ? "A+" : (score>=94) ? "A" : "A-");
//		}
//		else if (score>=80) {
//			System.out.println((score>=88) ? "B+" : (score>=84) ? "B" : "B-");
//		}
//		else if (score>=70) {
//			System.out.println((score>=78) ? "C+" : (score>=74) ? "C" : "C-");
//		}
//		else if (score>=60) {
//			System.out.println((score>=68) ? "D+" : (score>=64) ? "D" : "D-");
//		}
//		else {
//			System.out.println("F");
//		}
		
//		if(true)
//		System.out.println("welcome");
//		System.out.println("Hello");//if의 영향을 안받는다.
	}

}
