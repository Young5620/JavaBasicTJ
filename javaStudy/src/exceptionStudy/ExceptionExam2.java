package exceptionStudy;

public class ExceptionExam2 {
	
	public static int divide(int i, int j) {
		try {
			int k = i/j;
			return k;
		}
		catch(Exception e) {
			System.out.println("에러가 발생했습니다.");
			return 0;
		}
		
		}

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		int k = divide(i, j);
		System.out.println(k);
		System.out.println("종료");
		}

	

}
