package variableExam;
import java.util.Scanner;
public class TriExam {
/*
 삼항연산자(조건)
 (조건식) ? true : false
 첫번째 피연산자 조건식의 평가 결과에 따라 true면 두번째 항 false면 세번째 항의 값이 나온다.
 조건식의 괄호는 필수는 아니다.
 
 여러번 중첩하면 가독성 떨어지므로 꼭 필요한 경우에만 사용한다.
 
 if(조건식){
 true;
 }
 else{
 false;
 }
 
 if(조건식){
 "A";
 }
 else if(조건식){
 "B";
 }
 else{
 "C";
 }
 (조건식)? ? "A" : (조건식) ? : "B" : "C"
 
 
  if(조건식){
 "A";
 }
 else if(조건식){
 "B";
 }
 else if(조건식){
 "C";
 }
 else{
 "D";
 }
 (조건식)? ? "A" : (조건식) ? : "B" : (조건식) ? "C" : "D"
 
 
 
 */
	public static void main(String[] args) {
		//Quiz1.  삼항연산자를 사용하여 100~90 "A", 90~80 "B", 80~70 "C", 나머지 전부는 "D"
		Scanner scan = new Scanner(System.in);
		//System.out.print("점수를 입력하세요. ");
		//int x = scan.nextInt();
		//int y = 10;
		//System.out.println((score>=90) ? "A" : (score>=80) ? "B": (score>=70) ? "C" : "D");
		//x=x+(y < x ? 1 : 2);
		
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX = x>=0 ? x : -x;
		absY = y>=0 ? y : -y;
		absZ = z>=0 ? z : -z;
		
		signX = x>0 ? '+' : x == 0 ? ' ' : '-';
		signY = y>0 ? '+' : y == 0 ? ' ' : '-';
		signZ = z>0 ? '+' : z == 0 ? ' ' : '-';
		
		System.out.printf("x=%c%d%n", signX,absX);
		System.out.printf("y=%c%d%n", signY,absY);
		System.out.printf("z=%c%d%n", signZ,absZ);
		
	}

}
