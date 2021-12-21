package pack04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력을 받을 객체 sc를 생성
		System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.\n단수는?"); // 사용자가 단수를 입력하도록 안내문구 출력
		int num = sc.nextInt(); // 입력받은 단수를 변수 num에 저장 
		for(int i = 1; i<=num ; i++) { // 반복문 - i가 1부터 시작해서 num까지 하나씩 증가하면서 아래를 반복 / 층수를 의미한다.
			for(int j =1 ; j<=i; j++) { // 반복문 - j가 1부터 시작해서  i까지 하나씩 증가하면서 아래를 반복 / 찍을 별의 개수를 의미한다.
				System.out.print("*"); // *를 가로로 출력
			}
			System.out.println(); // 층수가 하나 내려감
		}
		System.out.print("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.\n단수는?"); // 사용자가 단수를 입력하도록 안내문구 출력
		int num1 = sc.nextInt(); // 입력받은 단수를 변수 num1에 저장
		for(int i =1 ; i<=num1 ; i++) { // 반복문 - i가 1부터 시작해서 num까지 하나씩 증가하면서 아래를 반복 / 층수를 의미한다.
			for(int j =1; j<=num1-i+1 ; j++) { // 반복문 - j가 1부터 시작해서  i까지 하나씩 증가하면서 아래를 반복 / 찍을 별의 개수를 의미한다.
				System.out.print("*"); // *를 가로로 출력
			}
			System.out.println(); // 층수가 하나 내려감
		}

	}

}
