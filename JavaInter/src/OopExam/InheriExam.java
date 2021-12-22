/*
 상속 - 상속은 기존의 클래스를 재사용하여 새로운 클래스를 만드는 것이다.
 상속을 사용하면 보다 적은 양의 코드로 새로운 클래스를 작성할 수 있다.
 공통적으로 관리할 수 있기 때문에 코드의 추가 변경 등이 매우 용이
 이러한 특징은 코드의 재사용성을 높이고 코드의 중복을 제거하여 프로그램의 생산성과 유지보수에 크게 기여하게 된다.
 
 조상클래스 - 부모클래스 - 상위클래스 - 기반클래스
 자손클래스 - 자식클래스 - 하위클래스 - 하위클래스
 
 부모 < 자식
 class Parent{
 	int money;
 }
 
 class Child extends Parent{
 	void play(){
 		System.out.println("야놀자");
 	}
 }
 
 상속을 받는다는 것은 조상 클래스를 확장한다는 의미로 해석할 수 있다.
 그래서 상속을 받을때 extends 키워드를 사용한다.
 - 생성자는 상속되지 않는다. 멤버들만 상속된다.
 - 자손클래스는 항상 조상클래스보다 멤버의 개수가 많거나 같다.
 - 하나의 클래스를 부모로 둔 두개의 가각의 클래스들 사이는 전혀 관계가 없다.
 
 자바에서의 상속은 단일 상속만 지원한다. single inheritance
 c++, python등의 언어에서는 다중 상속을 지원하지만 자바는 단일 상속만 지원한다.
 
 class AllTv extends CaptionTv, VodTv, ThreeDTv{} (x - 다중상속불가)
 */


package OopExam;

public class InheriExam {

	public static void main(String[] args) {
		

	}

}
