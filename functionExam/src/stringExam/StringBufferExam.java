/*
 String은 immutable 변경이 불가능하다. StringBuffer는 변경이 가능하다.
 StringBuffer는 String과 유사한점이 많다. 객체를 생성할 때 적절한 길이의 char형 배열이 생성되고
 이 배열은 문자열을 저장하고 편집하기 위한 공간으로 사용된다.
 
 StringBuffer sb = new StringBuffer("abc");
 sb.append("123"); 문자를 추가
 -> abc123
 
 내부적으로는 sb에 새로운 문자열이 추가되고 sb자신의 주소를 반환하여 다시 생성하는 개념이다.
 */

package stringExam;

public class StringBufferExam {

	public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer("abc");
		 System.out.println(sb);
		 sb.append("123");
		 System.out.println(sb);
		 
		 StringBuffer sb2 = sb.append("zz");
		 System.out.println(sb2);
		 System.out.println(sb);
		 
		 StringBuffer sb3 = new StringBuffer("abc");
		 System.out.println(sb3);
		 sb3.append("123").append("zz");
		 System.out.println(sb3);
		 
		 String str1 = new String("abc");
		 String str2 = new String("abc");
		 System.out.println(str1 == str2); //false
		 System.out.println(str1.equals(str2)); //true
		 StringBuffer sbr1 = new StringBuffer("abc");
		 StringBuffer sbr2 = new StringBuffer("abc");
		 System.out.println(sbr1 == sbr2); //false
		 System.out.println(sbr1.equals(sbr2)); //false
		 //String에서는 equals를 오버라이딩해서 문자열의 내용만 비교하도록 구현되어있다.(true)
		 //StringBuffer에서는 equals를 오버라이딩하지 않아서 ==(주소비교 false)와 같은 결과 출력
		 
		 String st1 = new String("abc");
		 String st2 = st1.toString();
		 System.out.println(st1.equals(st2));
		 //반면에 toString()은 오버라이딩 되어있어서 StringBuffer에 toString()을 호출하면 담고있는 문자열을 String으로 반환
		 StringBuffer sb1 = new StringBuffer("abc");
		 String st3 = sb1.toString();
		 System.out.println(sb1.equals(st3));
	}

}
