package package01;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.\n단수는?");
		String n = sc.next();
		int n1 = Integer.parseInt(n);
		for(int i =1; i<=n1 ; i++) {
			for(int j =1; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.\n단수는?");
		int n2 = sc.nextInt();
		for(int i =1; i<=n2 ; i++) {
			for(int j =1; j<=n2-i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
	}

}
