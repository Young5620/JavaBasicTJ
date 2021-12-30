/*
 저장된 요소에 접근하는데 사용된다. Enumeration은 Iterator의 구버젼이다.
 ListIterator는 Iterator의 기능을 향상시킨 버젼이다.
 
 List 계열의 클래스들은 저장순서를 유지한다. Set계열의 클래스들은 각 요소간의 순서가 유지되지 않는다.
 Iterator를 통해 저장된 요소를 읽어와도 처음에 저장된 순서와 같지않다.
 */

package collectionExam;

import java.util.ArrayList;

public class IteratorExam {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		while(list.hasNext()) {
			
		}
		
}
}
