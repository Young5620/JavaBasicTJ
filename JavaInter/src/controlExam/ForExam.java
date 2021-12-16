package controlExam;
import java.util.Scanner;
public class ForExam {
/*
For 반복문 : 어떤 작업을 반복적으로 수행되도록 할 때 사용
반복 횟수를 정확히 특정할 때 주로 사용된다.
문법이 직관적이라 가독성이 좋다.
for (start;stop;step) (초기값 ; 조건식 ; 증감식)
초기값 -> 조건식 -> 수행문장 -> 증감식 -> 다시 조건식 -> 수행문장 -> 증감식
-> ...->종료
초기값 : 반복문에 사용할 변수를 초기화 / 처음에 딱 한번만 실행된다. 보통은 변수를 하나만 사용하지만 2개 이상도 사용가능하다.
for(int i=1,j=0; i<10 ; i++)

조건식 : 조건식의 값이 참일 경우 계속 반복 실행하다가 거짓이 되는 경우 반복 종료 
	     조건식을 잘못 설정한 경우 한번도 실행되지 않는 경우가 발생할수도 있고 또는 영원히 반복되는 경우가 발생할 수 있다.

증감식 : i++/i--/i+=2....
전부 생략 가능하다.
for(;;) 무한반복...

향상된 for구문 - for each

for(타입변수명 : 배열 또는 컬렉션){

}
*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		int count = 0;
		for(int i : arr) {
			System.out.println(i);
		sum +=i;
		count +=1;
		}
		System.out.println("총합은 " + sum+ "입니다.");
		System.out.println("갯수는 " + count+ "개 입니다.");
		
//		for(int i =0; i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		//*을 출력할 라인의 수를 입력하세요>5
//		Scanner scan = new Scanner(System.in);
//		System.out.print("*를 출력할 라인의 수를 입력하세요.>> ");
//		int n = scan.nextInt();
//		for (int i =1; i<=n;i++) {
//			for (int j = 0; j<=(n-i); j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
		
		//구구단을 출력하세요
		//2*1 = 2    2*2 = 4 ...
		//3*1 = 3    3*2 = 6 ...
//		int a = 1;
//		for(int i =2; i<=9; i++) {
//			for (int j =1;j<=9;j++) {
//				System.out.printf("%d * %d = %d\t",i,j,i*j);
//			}
//			System.out.println();
//			
//		}
		
		//quiz 1부터 10까지의 합을 출력하시오
		//단, 누계값까지 출력하시오
//		int sum = 0;
//		for(int i = 1; i<=10;i++) {
//			sum= sum+i;
//			System.out.println("1부터 " + i+"까지의 합: " + sum);
//			
//		}
//		System.out.println("누계합: "+ sum);
		
//		for (int i =1, j=10; i<=10; i++) {
//			System.out.println(i+ "  "+(j-i+1));
//		} //일정간격 띄우기 : \t
		
		
		//quiz 1부터 5까지를
//		for(int i = 1; i<=5;i++) {
//			System.out.println(i);
//		}
//		for(int i = 1; i<=5;i++) {
//			System.out.print(i);
//		}

	}

}
