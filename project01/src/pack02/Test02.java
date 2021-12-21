package pack02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드 입력을 받을 객체 sc를 생성
		int count = 0; // 정수형 변수 count(전체 실행횟수)를 0으로 초기화 
	    int fnum = 0; // 정수형 변수 fnum(앞숫자가 큰 경우의 횟수)를 0으로 초기화
	    int lnum = 0; // 정수형 변수 lnum(뒷숫자가 큰 경우의 횟수)를 0으로 초기화
	    char ox = 'o'; // 문자형 변수 ox(계속할지 안할지를 입력)를 o로 초기화
	    
	    while (ox != 'x') { // 반복문 -변수 ox가 x가 아닐경우 계속 반복한다.
	    	System.out.println("숫자 크기 판별 \n--------------------"); // 안내문구 출력
	    	System.out.print("숫자 입력 >> "); // 앞숫자를 입력하도록 안내문구 출력
	    	int a = sc.nextInt(); // 사용자가 콘솔을 통해 키보드로 입력한 값을 받아 변수 a에 저장
	    	System.out.print("숫자 입력 >> "); // 뒷숫자를 입력하도록 안내문구 출력
	    	int b = sc.nextInt(); // 사용자가 콘솔을 통해 키보드로 입력한 값을 받아 변수 b에 저장

	    	if(a > b){ // 조건문 a가 b보다 크면 아래를 실행
	    		System.out.println("판결은 앞 숫자가 크다."); // 콘솔에 앞숫자가 큰 것을 출력
	    		fnum ++; // 앞숫자가 큰 경우의 횟수를 하나 올린다.
	    		count ++; // 전체 실행 횟수를 하나 올린다.
	    		}
	    		else{ // 조건문 이외의 경우 아래를 실행
	    			System.out.println("판결은 뒷숫자가 크다."); // 콘솔에 뒷숫자가 큰 것을 출력
	    			lnum ++; // 뒤숫자가 큰 경우의 횟수를 하나 올린다.
	    			count ++; // 전체 실행 횟수를 하나 올린다.
	    			}
	    	System.out.print("계속 하시겠습니까?(계속 : o , 중단 : x) : "); // 콘솔에 계속 실행할지 사용자가 입력하도록 안내문구를 출력
	    	String tmp = sc.next(); // 콘솔을 통해 키보드 입력을 받아 임시변수 tmp에 문자열로 저장
	    	ox = tmp.charAt(0); // tmp에 있는 문자열 중 0번째 문자를 char문자형으로 바꿔서 변수 ox에 저장
	    	}
	    System.out.println("프로그램을 종료합니다.\n시도횟수: " + count + " 앞숫자가 큰 경우: " + fnum+" 뒷숫자가 큰 경우: "+lnum);
	    //프로그램 종료를 알리고 시도횟수와 앞숫자가 큰경우 뒷숫자가 큰경우의 횟수를 알리는 문구 출력
	}

}
