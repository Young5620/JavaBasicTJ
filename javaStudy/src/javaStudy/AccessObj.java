package javaStudy;

public class AccessObj {
	public int p = 3; // public 모든 접근 허용
	protected int p2 = 4; // protected 같은 패키지에서만 접근허용 / 단, 상속 받은 경우는 예외
	int k = 2;   // default (생략된경우) 같은 패키지내에서만 접근 허용
	private int i = 1; // private 자기 자신만 쓸 수 있다.
	
	//public >> protected >> (default) >> private
	

}
