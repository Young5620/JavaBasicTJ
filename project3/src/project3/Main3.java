package project3;
import java.util.*;
public class Main3 {
	public static boolean confirm() { // confirm메서드를 생성
		int n; // n을 초기화
		do {
			Scanner scan = new Scanner(System.in); // 사용자로부터 콘솔에 입력받는 값을 저장
			System.out.print("다시 한번 ? <yes_1 / no_0> : ");
			n = scan.nextInt(); // 사용자가 입력한 숫자를 변수 n에 저장
		} 
		while(n !=0 && n !=1); // 변수n이 0이 아니고 1이 아니라면 do문구를 계속 실행
		return n == 1; // 변수 n이 1이라면 true를 리턴
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random(); // 랜덤숫자를 생성하는 객체를 생성
		System.out.println("암산 훈련!!");
		do { // 아래를 계속 반복한다.
			int x = 100 + rand.nextInt(900); //변수 x를 100이상부터 1000미만의 랜덤숫자를 생성
			int y = 100 + rand.nextInt(900); //변수 y를 100이상부터 1000미만의 랜덤숫자를 생성
			int z = 100 + rand.nextInt(900); //변수 z를 100이상부터 1000미만의 랜덤숫자를 생성
			int pat = rand.nextInt(4); // 변수 pat을 0부터3까지 랜덤숫자를 생성
			int ans; // 변수 ans를 초기화
			switch(pat) { // 변수 pat를 받아와서 switch문구에 대입
			case 0 : ans = x + y + z; break; //pat=0이라면 ans = x + y + z를 저장하고 switch문구 종료
			case 1 : ans = x + y - z; break; //pat=1이라면 ans = x + y - z를 저장하고 switch문구 종료
			case 2 : ans = x - y + z; break; //pat=2이라면 ans = x - y + z를 저장하고 switch문구 종료
			default : ans = x - y - z; break; //pat=3이라면 ans = x - y - z를 저장하고 switch문구 종료
		}
		while(true) {
			System.out.print(x + ((pat<2) ? "+":"-") + y + ((pat%2 == 0) ? "+":"-") + z + "=");
			int k = scan.nextInt();// 사용자로부터 암산한 결과를 입력받는다.
			if(k == ans) { // 계산 결과가 맞다면 while문구 종료
				break;
			}
			else { // 계산결과가 틀리면 "틀렸습니다"문구를 출력
				System.out.println("틀렸습니다.");
			}
		}
		}
		while(confirm()); // confirm메서드에서 나온 값이 false일 때까지 반복 실행
	}
	
}
