package exceptionStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		int i = 10;
		int j = 5;
		try { //에러가 날 것 같은곳에 try
			int k = i/j;
			System.out.println(k);
			} catch(ArithmeticException e) {// 모르는 에러라면 ArithmeticException e 대신 Exception e
				System.out.println("0으로 나눌 수 없습니다.\n" + e.toString());
				} 
		finally {
			System.out.println("에러 발생여부와 상관없이 항상 실행");
		}
		
		System.out.println("main end!");
	}

}
