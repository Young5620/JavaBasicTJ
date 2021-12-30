package collectionExam;
//웹브라우저의 '뒤로''앞으로'버튼을 개념적으로 구현한 것이다.
//이 기능을 구현하기 위해 2개의 스택을 사용한다.
import java.util.Stack;

public class StackExam1 {

	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forward" + forward);
		
		System.out.println("현재 화면은 '" + back.peek()+ "'입니다.");
		System.out.println();
	}
	
	public static void goURL (String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}
	
	public static void main(String[] args) {
		goURL("1.네이트");
		goURL("2.구글");
		goURL("3.네이버");
		goURL("4.다음");
		
		printStatus(); //4.다음
		
		goBack();
		System.out.println(" = 뒤로 버튼을 누른 후 = ");
		printStatus(); //3.네이버
		
		goForward();
		System.out.println(" = 앞으로 버튼을 누른 후 = ");
		printStatus(); //4.다음
		
		goURL("austiny.snu.ac.kr");
		System.out.println(" = 새로운 주소로 이동 = ");
	}

}
