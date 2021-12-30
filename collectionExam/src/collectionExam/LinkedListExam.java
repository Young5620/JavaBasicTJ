/*
 LinkedListExam
 배열은 가장 기본적인 형태의 자료구조로 그 구조가 간단하고 사용하기 쉽고 시간도 가장 빠르다는 장점
 
 배열 단점
 1. 크기를 변경할 수 없다. 
 	- 크기를 변경하려면 새로운 배열을 생성해서 데이터를 복사한다.
 	- 충분히 큰 크기의 배열을 생성해야 하므로 메모리가 낭비된다.
 2. 데이터의 추가 또는 삭제에 시간이 많이 걸린다.
 	- 배열의 데이터를 추가하려면 빈자리를 만들기 위해 데이터들을 복사해서 이동해야한다.
 	
 이런 단점을 보완하기위해 linked list라는 자료구조가 고안됨
 배열은 모든 데이터가 연속적으로 존재해야 하지만 링크드 리스트는 불연속적으로 존재하는 데이터를 서로 연결한(linked) 형태로 구성된다.
 
 array        0 1 2 3 4
 
 linkedlist   0  1  2  3  4
               -> -> -> ->   //주소값
//링크드 리스트의 각 요소들은 자신과 연결된 다음 요소에 대한 참조(주소값)와 데이터로 구성
//삭제하고자 하는 요소의 이전 요소가 삭제하고자 하는 요소의 다음 요소를 참조하도록 변경하면 삭제가 된다.
//배열처럼 복사하는 과정이 필요없어 처리속도가 매우 빠르다
//새로운 데이터를 추가할 때는 새로운요소를 새성한 다음 추가하고자 하는 위치릐 이전 요소의 참조를 
//새로운 요소에 대한 참조로 변경해주고 새로운 요소가 그 다음 요소를 참조하도록 변경하기만 하면 되므로 처리속도가 매우 빠르다.

//이동방향이 단반향이기 때문에 다음 요소에 대한 접근은 쉽지만 이전 요소에 대한 접근은 어렵다. 이런한 단점을 보완한 더블링크드리스트도 있다.

순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다
중간에 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 훨씬 빠르다

비교를 위해서 데이터의 개수를 크게 잡았고 사실 데이터의 개수가 크지 않다면 어느 것을 사용해도 큰 차이는 나지 않는다.
그래도 ArrayList와 LinkedList의 장단저믈 잘 이해하고 상황에 따라 적한한 것을 선택해서 사용하자.
					읽기		추가/삭제
	 ArrayList	        빠르다             느리다		순차적인 작업은 더 빠르다. 비효율적인 메모리 사용
	 LinkedList    느리다		   빠르다		데이터가 많을수록 접근성이 떨어진다.
	 
다루고자 하는 데이터의 개수가 변하지 않는 경우라면 ArrayList가 최상의 선택
데이터의 개수 변경이 적다면 LinkedList를 사용하는 것이 더 나은 선택

두 클래스의 장점을 모두 이용해서 조합하여 사용하는 방법도 가능
처음 작업전에 데이터를 저장할때는 ArrayList를 사용한 다음 작업할때는 LinkedList로 데이터를 옮겨서 작업하면 더 나은 효율을 얻는다.
 */


package collectionExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
//	static long add1(List list) {
//		long start = System.currentTimeMillis();
//		for(int i = 0; i<1000000; i++) list.add(i+"");
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
//	static long add2(List list) {
//		long start = System.currentTimeMillis();
//		for(int i = 0; i<10000; i++) list.add(500,"X");
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
//	static long remove1(List list) {
//		long start = System.currentTimeMillis();
//		for(int i = list.size()-1; i>=0; i--) list.remove(i);
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
//	static long remove2(List list) {
//		long start = System.currentTimeMillis();
//		for(int i = 0; i<10000; i++) list.remove(i);
//		long end = System.currentTimeMillis();
//		return end - start;
//	}
	
	public static void add(List list) {
		for(int i =0;i<100000; i++) list.add(i+"");
	}
	public static long access(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i<10000; i++) list.get(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static void main(String[] args) {
//		ArrayList al = new ArrayList(2000000);
//		LinkedList ll = new LinkedList();
//		
//		System.out.println("= 순차적으로 추가하기 =");
//		System.out.println("ArrayList :"+add1(al));
//		System.out.println("LinkedList :"+add1(ll));
//		System.out.println();
//		System.out.println("= 중간에 추가하기 =");
//		System.out.println("ArrayList :"+add2(al));
//		System.out.println("LinkedList :"+add2(ll));
//		System.out.println();
//		System.out.println("= 중간에서 삭제하기 =");
//		System.out.println("ArrayList :"+remove2(al));
//		System.out.println("LinkedList :"+remove2(ll));
//		System.out.println();
//		System.out.println("= 순차적으로 삭제하기 =");
//		System.out.println("ArrayList :"+remove1(al));
//		System.out.println("LinkedList :"+remove1(ll));
//		System.out.println();
		
		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		
		add(al);
		add(ll);
		
		System.out.println("=접근 시간 테스트=");
		System.out.println("ArrayList : " + access(al));
		System.out.println("LinkedList : " + access(ll));
	}

}
