/*
 equals() : 문자열을 비교하ㅕ 그 결과를 boolean 값으로 알려준다.
 */


package functionExam;

public class EqualsExam {

	public static void main(String[] args) {
		String a = "password"; //사용자로부터 키보드로 입력받은 비번
		String b = "password"; //회원가입 시 DB에 저장된 비번
		
		if(a.equals(b)) {
			System.out.println("비번이 일치합니다. 로그인 허용");
		}
		else {
			System.out.println("잘못된 비밀번호 입니다. 다시 입력하세요");
		}

	}

}
