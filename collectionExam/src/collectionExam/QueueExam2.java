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
//저장순서가 31524인데도 출력 최종결과는 12345이다. 우선순위는 숫자가 작을수록 높다.
}
