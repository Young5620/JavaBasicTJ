package collectionExam;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExam2 {

	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3);
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
		System.out.println(pq);
		
		Object obj = null;
		while((obj = pq.poll())!= null)
			System.out.println(obj);
	}
//저장순서가 3 1 5 2 4인데도 출력 최종결과는 1 2 3 4 5이다. 우선순위는 숫자가 작을수록 높다.
//객체로 Integer 오토박싱(포장)해주었다. Integer와 같은 Number의 자손들을 자체적으로 숫자를 비교하는 방법을 알고 있다.
//PriorityQueue는 저자한 순서에 관계없이 우선순위가 높은 것부터 꺼내게 되는 특징이 있다.
//null은 저장할 수 없다. 내부적으로 저장공간으로 배열을 사용한다.
}
