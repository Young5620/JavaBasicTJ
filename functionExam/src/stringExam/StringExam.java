/*
 다른 언어에서는 문자열을 char형의 배열로 다루었으나 자바에서는 문자열 클래스를 별도로 제공한다.
 String클래스는 문자열을 다루는데 필요한 매서드들을 함께 제공한다. 지금까지는 String의 기본적인 몇가지만 사용했지만 자세히 공부 ㄱㄱ
 
 1. immutable 클래스 (변경불가능) - 한번 생성한 String은 읽어 올 수만 있고 변경할 수 없다. 
 	만일 +연산자를 이용해서 문자열을 결합하는 경우 문자열 자체가 바뀌는 것이 아니라 결합된 새로운 문자열이 생성되는 것이다.
 	ex)String a = "a"; String b = "b";  ->  String a = a+b; 
 	      연산식마다 새로운 문자열을 가진 String객체가 생성되어 메모리공간을 차지한다. 가능한 결합횟수를 줄이는 것이 좋다.
 	      
 	굳이 문자열 간의 결합 추출등 문자열 작업이 많은 경우에는 String 대신 StringBuffer를 사용하는 것이 좋다. 근데 안씀..?
 	String문자열의 비교는  a.equals(b)를 사용한다.
 	
 	빈 문자열
 	String s = "";//참조변수 s가 가리키는 String객체는 내부에 new char[0]과 같이 길이가 0인 char형 배열을 저장하고 있는 것과 같다.
 	char[] ahArr = new char[0]; //길이가 0인 char배열
 	char c = ''; char형 변수에는 반드시 하나의 문자를 지정해야한다. (' ' 띄어쓰기해야한다.)
 	
 String 의 생성자와 매서드

 */


package stringExam;

import java.util.StringJoiner;
public class StringExam {

	public static void main(String[] args) {
		char[] cArr = new char[0];
		String s = new String(cArr); //String s = new String(""); 얘랑 같은말
		System.out.println(cArr.length);
		System.out.println("@@@"+s+"@@@");
		
		String a = new String("Hello"); //주어진 문자열로 객체생성
		char[] b = {'h','e','l','l','o'};
		String c = new String(b);
		
		System.out.println(c);
		
		//charAt() 지정된 위치 index에 있는 문자를 반환 (0부터 시작)
		String d = "Hello";
		String e = "012345";
		char f = d.charAt(2);
		char g = e.charAt(2);
		System.out.println(f);
		System.out.println(g);
		
		//compareTo() 배교해서 같으면 0, 이전이면-1, 이후면 1로 반환
		int i = "a".compareTo("a");  //0
		int i2 = "a".compareTo("b"); //-1
		int i3 = "b".compareTo("a"); //1
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
	
		//concat() 문자열들을 붙인다.
		String h = "Hello";
		String k = "World";
		String l = h.concat(k);
		System.out.println(l);
		
		//contains() 문자열이 포함되었는지 검사
		String z = "abcdefg";
		boolean y = z.contains("bc");
		System.out.println(y);
		
		//endsWith() 지정된 문자열로 끝나는지 검사
		String ab = "Hello.txt";
		boolean aa = ab.endsWith("txt");
		System.out.println(aa);
		
		//startWith() 지정된 문자열로 시작하는지 검사
		boolean ac = ab.endsWith("He");
		System.out.println(ac);
		
		//.equalsIgnoreCase() 대소문자 안가리고 같은지 비교
		String r = "Hello";
		System.out.println(r.equalsIgnoreCase("HELLO"));
		
		//indexOf() 주어진 문자가 문자열에 존재하는지 확인(없으면-1)
		System.out.println(r.indexOf('o'));
		System.out.println(r.indexOf('a'));
		
		//lastIndexOf() 지정된 문자가 오른쪽부터 찾아서 index를 알려준다 (없으면-1)
		System.out.println(r.lastIndexOf('l'));
		
		//length() 문자열의 개수 길이를 리턴한다.
		System.out.println(r.length());
		
		//replace() 한글자(char)를 바꿔서 보여준다.
		System.out.println(r.replace('e', 'a'));
		System.out.println(r); //r이 바뀐것이 아니다
		
		//replaceAll() 문자열을 바꿔서 보여준다.
		System.out.println(r.replaceAll("ll", "rr"));
		
		//split 문자열을 지정된 분리자로 나누어 배열로 반환
		String animals = "dog, cat, bear";
		String[] arr = animals.split(", ");
		for(String each : arr) {
			System.out.print(each + ", ");
		}
		
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j]);
			if(j != arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		
		//substring() 문자열(몇 글자) 잘라내기
		System.out.println(r.substring(2));
		System.out.println(r.substring(2,4));
		
		//toLowerCase() 전부 소문자로 보여주기
		System.out.println(r.toLowerCase());
		
		//toUpperCsse() 전부 대문자로 보여주기
		System.out.println(r.toUpperCase());
		
		//trim() 문자열 앞뒤에 있는 불필요한 여백제거
		String rr = "    Hello  ";
		System.out.println(rr.trim());
		
		//join() 문자열들을 결합 split()과 반대
		String animals2= "dog,cat,bear";
		String[] arrs = animals2.split(",");
		System.out.println(String.join("-", arrs));
		System.out.println(String.join("/", arrs));
		System.out.print("[");
		System.out.print(String.join(",", arrs));
		System.out.print("]");
		System.out.println();
		//import java.util.StringJoiner;
		StringJoiner sj = new StringJoiner("/","[","]");
		for(String ani : arrs) {
			sj.add(ani);
		}
		System.out.println(sj.toString());
		
		//String을 기본형 값으로 변환
		int ii = Integer.parseInt("100");
		int jj = Integer.valueOf("100");
		
		int iVal = 100;
		String strVal = String.valueOf(iVal); //int를 String으로 변환
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //숫자를 문자로 바꾸는 또 다른 방법
		
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		System.out.println(sum);
		System.out.println(sum2);
		
		//int val = Integer.parseInt("   123  "); //에러발생: 숫자에 빈칸(문자)포함
		int val = Integer.parseInt("   123  ".trim());
		System.out.println(val);
		
		//확장자를 제외한 이름은 Hello
		//확장자는 java
		String fullName = "Hello.java";
//		String[] arrN = fullName.split("\\.");
//		System.out.println("확장자를 제외한 이름은 " + arrN[0]);
//		System.out.println("확장자는 " + arrN[1]);
		System.out.println("확장자를 제외한 이름은 " + fullName.substring(0,fullName.indexOf('.')));
		System.out.println("확장자는" + fullName.substring(1+fullName.indexOf('.')));
		int idex = fullName.indexOf('.');
		String fName = fullName.substring(0,idex);
		String lName = fullName.substring(idex+1, fullName.length());
		System.out.println("확장자를 제외한 이름은 " + fName);
		System.out.println("확장자는 " + lName);
		
		
	}

}
