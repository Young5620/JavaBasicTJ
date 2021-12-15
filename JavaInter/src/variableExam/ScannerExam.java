package variableExam;
import java.util.Scanner;
public class ScannerExam {

	public static void main(String[] args) {
/*Scanner() 사용자로부터 입력받아 변수로 활용
import java.util.Scanner; Scanner 클래스 사용을 위한 추가
Scanner sc = new Scanner(System.in); 객체 생성
String input = sc.nextLine();//문자열 입력
int num = sc.nextInt();//정수 입력


//문자열로 입력받아 숫자로 변경하기(숫자 여러개 입력받기 용이)
String input - sc.nextLine();
int num = Integer.parseInt(input);
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("두 자리 정수 하나만 입력하세요>>");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); //문자열을 숫자로 변경
		System.out.println("입력 내용 : "+ input);
		System.out.printf("숫자로 : %d%n ",num);
	}

}
