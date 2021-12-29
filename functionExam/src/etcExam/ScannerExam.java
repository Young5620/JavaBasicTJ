/*
 Scanner 는 문자 데이터를 입력받는 목적으로 JDK1.5부터 추가되었다. 다양한 형태의 입력을 받아 처리할 수 있다.
 정규표현식과 함께 쓸 수 있다.
 */


package etcExam;
import java.util.*;
public class ScannerExam {

	public static void main(String[] args) {
		//quiz 
		//1.hello   123을
		//hello
		//123 으로 출력
		
		//2.hello   123   456 을
		//hello
		//123
		//456
		//q를 입력하면 종료
		Scanner scan = new Scanner(System.in);
		String[] argArr = null;
		while(true) {
			String input = scan.nextLine();
			
			argArr = input.split(" +"); //입력받는 내용을 공백으로 자른다(+:공백의 개수는 무관)
			
			if(input.equals("q")) {
				break;
			}
			else {
				for(String item:argArr) {
					System.out.println(item.toLowerCase());
				}
			}
		}
		
 	}

}
