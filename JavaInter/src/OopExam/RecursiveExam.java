/* 재귀호출 recursive call
 매서드 내부에서 자기 자신 매서드를 다시 호출
 자원소모가 조금 심한편
 무한히 자기 자신을 호출하기 때문에 무한 반복에 빠지게 된다.
 따라서 조건문을 통한 탈출이 필수적으로 따라다닌다.
 
 void method(int n){
 if(n==0){
 	return; 탈출지점
 	}
 	System.out.println(n);
 	method(--n);
 }
 
 반복문은 같은 문장을 반복해서 수행하지만 재귀 호출은 반복문보다 몇가지 과정이 더 필요
 예를 들면 매개변수 복사 종료 후 복귀할 주소 저장 등등 내부적으로 추가로 필요한 것들이 많아서
 일반적으로 반복분보다 재귀호출이 수행시간이 더 오래 걸린다.
 그럼에도 사용하는 이유
 재귀의 논리적 간결함(보기에 이쁘다)
 재귀호출은 비효율적이므로 재귀 사용에 드는 비용보다 간결함이 주는 이득이 월등히 큰 경우에만 사용할 것을 권장한다.
 
 5! = 5*4*3*2*1
 3! = 3*2*1
 
 */

package OopExam;

public class RecursiveExam {
//	static int facfor(int n) {
//		int facto = 1;
//		for(int i = 1 ; i<=n ; i++) {
//			facto *=i; //facto = facto * i
//			System.out.println("i = " + i + " facto = " + facto);
//		}
//		return facto;
//	}
//	
//	static int facrecur(int n) {
//		int facto1 = 1;
//		if(n==1) {
//			return 1;
//		}
//		else {
//			facto1 = n * facrecur(n-1);
//		}
//		return facto1;
//	}
	
//	static int powRecur(int x, int n) {
//		int x = 2;
//		int pow = 1;
//		if(n==1) {
//			return 1;
//		}
//		else {
//			pow = pow^n + powRecur^(n-1);
//		}
//		return pow;
//	}
	
	
	static int power(int x, int i) {
		if(i==1) {
			return x;
		}
		else { 
			return x * power(x,i-1);
		}
	}
	public static void main(String[] args) {
//		System.out.println(RecursiveExam.facfor(5));
//		System.out.println(RecursiveExam.facrecur(5));
		// x^1 부터 x^n의 합을 구하는 재귀매서드
		
		int x = 2;
		int n = 5;
		int result = 0;
		
		for(int i =1; i<n; i++) {
			result = result + power(x,i);
		}
		System.out.println(result);
		System.out.println(RecursiveExam.power(2,5));
	}
}
