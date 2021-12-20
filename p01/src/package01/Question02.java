package package01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		//원하는 기호를 입력하세요>>@
		//원하는 횟수를 입력하세요>>5
		//@@@@@
		
		//1 증가 2 감소 3 종료  >>>1
		//카운트1
		//1 증가 2 감소 3 종료  >>>1
		//카운트2
		//1 증가 2 감소 3 종료  >>>2
		//카운트1
		//1 증가 2 감소 3 종료  >>>1
		//카운트2
		//1 증가 2 감소 3 종료  >>>3
		//프로그램 종료 최종카운트 : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 기호를 입력하세요");
		String sig = sc.nextLine();
		System.out.print("원하는 횟수를 입력하세요");
		int n = sc.nextInt();
		int i = 1;
		while (i<=n) {
			System.out.print(sig);
			i++;
		}
		
		int count = 0;
		while(count < 3){
			
			System.out.print("1-증가 2-감소 3-종료 >>> ");
			int num = sc.nextInt();
			if(num ==1) {
				count +=1;
				System.out.println("카운트 : " +count);
			}else if (num ==2) {
				count-=1;
				System.out.println("카운트 : " +count);
			}else if (num ==3) {
				break;
				
			}
			
		}
		System.out.println("프로그램 종료  최종카운트 : " + count);
		

	}

}
