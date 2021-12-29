/*
 Regular Expression 정규식, 정규표현식
 정규표현식은 텍스트 중에서 원하는 조건과 일치하는 문장열을 찾아내기 위해 사용한다.
 원래는 Unix에서 사용하는 것이었는데 현재는 다양한 언어에서 지원하고 있다.
 많은 양의 텍스트 데이터에서 원하는 데이터를 쉽게 뽑아낼 수 있고 데이터가 어떤 형식에 맞는지 체크할 수 있다.
 예를 들면 html에서 전화번호나 이메일 주소만 추출하거나 입력한 비밀번호가 숫자와 영문자의 조합으로 되어있는지 등을 쉽게 확인할 수 있다.
 
 
		//문자열 배열에 담긴 문자열들 중에서 지정한 정규식과 일치하는 문자열을 찾아서 출력
		//Pattern은 정규식을 정의하고 Matcher 비교하는 역활을 한다.
		//1.정규식을 매개변수로 Pattern클래스의 static 메서드 인 pattern.compile() 호출하여 Pattern객체를 얻는다.
		//2.정규식으로 비교할 대상을 매개변수로 Pattern클래스의 Matcher를 호출하여 객체를 얻는다.
		//3.Matcher객체에 matches()를 호출하여 정규식에 부합하는지 확인한다.
 */


package etcExam;

import java.util.regex.*;
public class RegularExpressionExam {

	public static void main(String[] args) {
		String[] data = {"bat", "body", "bonus", "cA", "ca", "co", "c.", 
						"c0", "car", "combat", "count", "date", "dict"};
		
		//Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자 영단어
		//Pattern p = Pattern.compile("c[a-z]"); //c로 시작하는 두자리 소문자 영단어
		//Pattern p = Pattern.compile("c[a-zA-Z]"); //c로 시작하는 두자리 대소문자 영단어, *은 몇개가 와도 상관없다는 뜻
		//Pattern p = Pattern.compile("c[a-zA-z0-9]*"); //c로 시작하는 두자리 대소문자숫자까지 영단어
		//Pattern p = Pattern.compile(".*"); //모든 문자열
		//Pattern p = Pattern.compile("c."); //c로 시작하는 두자리 문자열
		//Pattern p = Pattern.compile("c.*"); //c로 시작하는 전체 문자열
		//Pattern p = Pattern.compile("c\\."); //c로 시작하는 글자로서의 .을 찾아라
		//Pattern p = Pattern.compile("c[0-9]"); //c로 시작하는 숫자1개
		//Pattern p = Pattern.compile("c\\d"); //c로 시작하는 숫자1개
		//Pattern p = Pattern.compile("c.*t"); //c로 시작하고 t로 끝나는 모든 문자열
		//Pattern p = Pattern.compile("[b|c].*"); //c와 b로 시작하는 모든 문자열
		//Pattern p = Pattern.compile("[bc].*"); //c와 b로 시작하는 모든 문자열
		//Pattern p = Pattern.compile("[b-c].*"); //c와 b로 시작하는 모든 문자열
		//Pattern p = Pattern.compile("[^b-c].*"); //c와 b로 시작하지 않는 모든 문자열
		//Pattern p = Pattern.compile("[^bc].*"); //c와 b로 시작하지 않는 모든 문자열
		//Pattern p = Pattern.compile("^[b|c].*"); //c와 b로 시작하지 않는 모든 문자열
		
		//Pattern p = Pattern.compile(".*a.*"); //a를 포함하는 모든 문자열
		//Pattern p = Pattern.compile(".*a.+"); //a를 포함하는 모든 문자열 (+:반드시 1개이상의 글자)
		//Pattern p = Pattern.compile("[b|c].{2}"); //b와 c로 시작하는 모든 3자리 글자({}:모든 종류 2개 글자)
		
		//Pattern p = Pattern.compile("0\\d{1,2}"); //0으로 시작하는 최소 두자리 최대 세자리 숫자
		//Pattern p = Pattern.compile("\\d{3,4}"); //최소세자리 최대 네자리의 숫자열
		//Pattern p = Pattern.compile("\\d{4}"); //네자리 숫자
		Pattern p = Pattern.compile("(0\\d{3}) - (\\d{3,4}) - (\\d{4})"); //전화번호 찾기
		//정규식의 일부를 괄호로 나누어 묶어서 그룹화 할 수 있다.
		//https://wikidocs.net/1669 정규표현식 사이트
		
		for(String d : data) {
			Matcher m = p.matcher(d); //일치하는지 확인
			if(m.matches()) {
				System.out.print(d + ", ");
			}
		}

	}

}
