/*
 추상클래스 abstract class '미완성의...'
 매서드의 선언부만 작성하고 실제 수행내용은 구형하지 않은 추상 매서드를 선언하는데 사용된다.
 추상클래스는 인터페이스의 기능과 일반클래스의 기능을 복합적으로 가지고 있다.
 일반클래스에 더 가까우나 객체를 생성하지는 못한다. 
 추상클래스는 상속을 통해서 자손 클래스에 의해서만 완성된다.
 
 추상: 하나하나 구체적표상, 개념에서 공통된 성질을 뽑아 이를 일반적인 개념으로 파악하는 것
 추상화: 클래스간의 공통점을 찾아내서 공통의 조상을 만드는 것
 구체화: 상속을 통해 클래스를 구현, 확장하는 작업
 
 abstract class Player {
 	abstract void play(int pos);
 	abstract void stop();
 }
 
 class AudioPlayer extends Player{
 	void play(int pos) {
 		System.out.println("Good Play");
 	}
 	void stop(){
 		System.out.ptintln("STOP");
 	}
 }
 */


package OopExam;

public class AbstractExam {

	public static void main(String[] args) {
		

	}

}
