package collectionExam;

import java.util.Stack;

//입력한 수식의 괄호가 올바른 표현인지 확인하는 예
//(를 만나면 스택에 넣고 )를 만나면 스택에서 (를 꺼낸다.
//스택이 비어있거나 마지막에 남아있는게 있으면 오류
//((2+3)*1)+3
public class StackExam2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		String expression = "((2+3)*1)+3)";
		
		try {
			for(int i = 0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				if(ch=='(') {
					st.push(ch+"");
				}
				else if(ch == ')') {
					st.pop();	
				}
				System.out.println(st);
			}
			if(st.empty()) {
				System.out.println("괄호가 일치합니다");
				}
			else {
				System.out.println("괄호가 일치하지 않습니다.");
				}
			}
		catch(Exception e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}

}
