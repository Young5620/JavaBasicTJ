/*
 Stack&Queue
 LIFO - Last in First Out : 마지막에 들어간 데이터가 제일 먼저 나온다.
 스택은 마지막에 저장한 데이터를 가장 먼저 꺼낸다. ArrayList
 1 2 3 이 들어왔을 때 out 3 2 1
 FIFO - First in First Out : 처음에 들어간 데이터가 제일 먼저 나온다.
 큐는 처음에 저장한 데이터를 가장 먼저 꺼낸다. LinkedList
 1 2 3 이 들어왔을때 out 1 2 3
 
 자바에서 스택은 Stack클래스로 구현하여 제공하고 있지만 큐는 Queue인터페이스로만 정의해놓고 별도의 클래스를 제공하고 있지않다.
 Queue인터페이스를 구현한 클래스들을 선택하여 사용한다.(linkedList)
 
 스택과 큐의 활용
 스택의 활용 : 수식계산, 수식 괄호검사, 웹브라우저의 앞,뒤로가기, 워드에서 undo/redo
 큐의 활용 : 인쇄대기목록, 최근사용문서, 줄서기
 */


package collectionExam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueExam {

	public static void main(String[] args) {
//		Stack st = new Stack();
//		Queue qu = new LinkedList();
//		
//		st.push("0");
//		st.push("1");
//		st.push("2");
//		
//		qu.offer("0");
//		qu.offer("1");
//		qu.offer("2");
//		
//		System.out.println("= Stack =");
//		while(!st.empty()) {
//			System.out.println(st.pop());
//		}
//		System.out.println("= Queue");
//		while(!qu.isEmpty()) {
//			System.out.println(qu.poll());
//		}
	}

}
