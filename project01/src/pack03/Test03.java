package pack03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		System.out.print("별을 10개 찍어보세요. "); // 문제문구 출력
		int i =1; // 변수 i를 1로 초기화
		while(i<=10) { // 반복문 - i가 10이하일 때까지 아래를 반복
			System.out.print("*"); // *를 출력
			i++; // i값 하나 증가
		}
		
		System.out.println(); // 문제구별을 위해 한칸 띄움
		
		Scanner sc = new Scanner(System.in); // 키보드 입력을 받을 객체 sc를 생성		
		System.out.print("원하는 기호를 넣으세요 >> "); // 사용자가 기호를 넣도록 안내문구 출력
		String sig = sc.nextLine(); // 사용자가 입력한 기호를 변수 sig에 저장
		System.out.print("원하는 횟수를 넣으세요 >> "); // 사용자가 횟수를 입력하도록 안내문구 출력
		int num = sc.nextInt(); // 사용자가 입력한 횟수를 변수 num에 저장
		int j = 1; // 변수 j를 1로 초기화
		while(j<=num) { // 반복문 - 변수 j가 변수 num보다 작거나 같으면 아래를 계속 반복실행
			System.out.print(sig); // 기호를 하나 출력
			j++; // 변수 j를 하나 증가
		}
		System.out.println("   " + num + "번 " + sig + "를 반복"); // 실행결과와 횟수출력
		
	    int count = 0; // count 0으로 초기화
	    while(count < 3){ // 반복문 count가 3보다 작으면 계속 아래를 반복
	      System.out.print("1)증가 2)감소 3)종료를 선택해주세요. >> "); // 사용자가 숫자 입력을 하도록 안내문구 출력
	      int num1 = sc.nextInt(); // 키보드 입력을 받아 정수형 변수 num1에 저장
	      if(num1==1){ // 조건문 변수 num1의 값이 1이라면
	        count +=1; // 변수 count를 하나 증가
	        System.out.println("카운트 : " + count); // 증가한 count를 출력
	      }
	      else if(num1==2){ // 변수 num1의 값이 2라면
	        count -=1; // 변수 count를 하나 감소
	        System.out.println("카운트 : " + count); // 감소한 count를 출력
	      }
	      else if(num1==3){ // 변수 num1의 값이 3이라면
	        break; // 조건문을 빠져나간다.
	      }
	    }
	    System.out.println("시스템을 종료합니다. 현재까지의 카운트는  "+ count);
	    //콘솔에 종료를 알리고 최종 카운트를 출력한다.
		
	}

}
