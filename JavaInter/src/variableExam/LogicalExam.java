package variableExam;
import java.util.Scanner;
public class LogicalExam {
	/*
	 논리 연산자는 둘 이상의 조건을 and 또는 or 연결하여 하나의 식으로 표현한다.
	 || (or) 피연산자의 어느 한쪽만 true이면 최종값은 true로 반환
	 && (and) 피연산자 양쪽 모두 동시에 true이어야만 최종값 true로 반환
	 
	 x>10 && x<20 (o)
	 10<x && x<20 (o)
	 10<x<20 (x)
	 
	 i % 2 ==0 || i % 3 ==0 //2의배수 ok 3의배수도 ok
	 
	 */

	public static void main(String[] args) {
		
		//quiz2 문자를 하나 입력받아서 그 문자가 숫자인지 문자(영문자)인지를 출력하시오
		//"문자를 하나 입력하세요."
		//"입력하신 문자는 숫자입니다."
		//"입력하신 문자는 영문자입니다."
		
		Scanner sc = new Scanner(System.in);
		char ch = ' ';
		System.out.print("문자를 하나 입력하세요.");
		String input = sc.nextLine();
		ch = input.charAt(0);
		
		//숫자확인
		
		if('0' <= ch && ch<='9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		else if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z') {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	}

}
