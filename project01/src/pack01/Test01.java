package pack01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("------------------------------\n건강 검진을 위해 회원의 정보를 입력해주세요\n------------------------------");
		//안내문구를 출력
		Scanner sc = new Scanner(System.in); //키보드 입력을 받을 객체 sc를 생성
		System.out.print("당신의 소속은 >> "); //사용자가 소속을 입력하도록 안내문구 출력
		String dep = sc.next(); //사용자가 입력한 소속을 변수 dep에 저장
		System.out.println("당신의 소속은 " + dep + "이시군요!"); //사용자가 입력한 소속을 확인시켜주는 안내문구 출력
		System.out.print("당신의 나이는 >> "); //사용자가 나이를 입력하도록 안내문구 출력
		int age = sc.nextInt(); //사용자가 입력한 나이를 변수 age에 저장
		System.out.println("당신의 작년 나이는 " + (age-1) + "였겠군요!");//작년 나이를 알려주는 문구 출력
		System.out.print("현재 당신의 몸무게는 >> "); //사용자가 몸무게를 입력하도록 안내문구 출력
		double weight = sc.nextDouble(); //사용자가 입력한 몸무게를 변수 weight에 저장
		if(weight>=90) { //조건문 변수 weight이 90이상일 때 아래를 실행
			System.out.println("당신은 지금 과체중이시군요!"); //과체중을 알리는 문구 출력
		}
		else if(weight>=70) { //조건문 변수 weight이 70이상일 때 아래를 실행
			System.out.println("당신은 지금 보통이시군요!"); // 보통을 알리는 문구 출력
		}
		else { //이외의 경우 아래를 실행
			System.out.println("당신은 지금 미달이시군요!"); // 미달을 알리는 문구 출력
		}
		System.out.print("당신은 결혼을 하셨나요 >> "); // 사용자의 결혼여부를 입력하도록 안내문구 출력
		boolean tr = sc.nextBoolean(); // 사용자가 입력한 true or false를 변수 tr에 입력
		if(tr) {// 조건문 사용자가 입력한  변수 tr이 true라면 아래를 실행
			System.out.println("당신은 배우자가 있겠군요!"); // 배우자가 있음을 출력
		}
		else { //조건문 사용자가 입력한 변수 tr이 false라면 아래를 실행
			System.out.println("당신은 배우자가 없겠군요!"); // 배우자가 없음을 출력
		}
		System.out.println("------------------------------\n입력을 마무리합니다."); //마무리멘트 출력
	}

}
