/*
 인터페이스(Interface)
 인터페이스는 일종의 추상클래스이다. 인터페이스는 추상 클래스처럼 추상매서드를 갖지만 추상클래스보다 추상화의 정도가 높아서
 추상클래스와는 달리 일반매서드를 구성원으로 가질 수 없다. 오직 추상매서드와 상수만을 멤버로 가질 수 있다.
 그 외의 어떤 다른 요소도 허용하지 않는다.
 추상클래스는 부분적으로만 완성된 '미완성 설계도'라고 한다면 
 인터페이스는  구현된 것은 아무것도 없고 밑그림만 그려져 있는 '기본설계도'이다.
 다른 클래스에 도움을 주려는 목적으로 사용된다.
 
 모든 매서드는 public abstract이여야만 하고 이를 생략할 수는 없다.
 8부터는 static, default 매서드 사용가능
 모든변수는 public static final이여야 하며 생략가능
 
 interface Play {
 	public static final int SPADE = 4;
 	final int DIAMOND = 3;
 	static int HEART = 2;
 	int COLVER = 1;
 	
 	String getCardKind(); // public abstract String getCardKind();생략
 	//원래는 인터페이스의 모든 매서드는 추상매서드 이여야만 하는데 8버전부터 인터페이스에 static매서드와
 	  default매서드의 추가를 허용한다.
 }
 
 인터페이스끼리의 다중 상속을 허용한다.
 클래스와는 다르게 다중 상속 즉 여러개의 인터페이스로부터 상속을 받을 수 있다.
 
 interface Fightable extends Movable, Attackable{}
 
 클래스처럼 인터페이스도 자식 인터페이스는 조상인터페이스들에 정의된 모든 것을 상속받는다.
 인터페이스도 추상클래스처럼 그 자체로는 객체를 생성할 수 없다.
 추상클래스가 상속을 통해 추상매서드를 완성하는 것처럼 인터페이스도 자신의 정의된 추상매서드의 몸통을 만들어 주는 클래스를 작성해야한다.
 
 인터페이스의 다형성
 클래스에서의 다형성도 자손클래스의 객체를 조상타입의 참조변수로 참조하는 것이 가능하다는 것을 보았다.
 인터페이스 역시 인터페이스 타입의 참조변수로 이를 구현한 클래스의 객체를 참조할 수 있고 형변환도 가능하다.
 
 Fightable f = new Fighter(); // Fighter클래스는 Fightable인터페이스를 구현하고 있기 때문에 가능
 
 따라서 인터페이스는 매서드의 매개변수의 타입으로 사용될 수 있다.
 
 void attack(Fightable f)
 
 인터페이스의 장점
 - 개발시간을 단축시킨다. 
   : 분업화하여 한쪽에서는 만들어야 할 것들의 목록을 만들고 다른 팀은 그 목록을 구체화하여 결국 동시에 개발을 진행할 수 있다.
 - 표준화가 가능하다.
   : 인터페이스라는 기본틀을 사용하여 여러 작업을 진행하게 되면 그 기본틀에 맞게 개발하여 일관되고 정형화된 개발이 가능하다.
 - 관계 없는 클래스들에게 관계를 맺어줄 수 있다.
   : 서로 상속관계도 아니고 같은 조상 클래스도 가시지 않은 아무 관련없는 클래스들에게 하나의 인터페이스를 공통적으로 구현하여 관계를 만들 수 있다.
 - 독립적인 프로그래밍이 가능하다.
   : 인터페이스를 이용하면 선언과 구현을 분리시킬 수 있기 때문에 실제 구현에 독립적인 프로그램을 작성하는 것이 가능하다. 
   	  클래스간의 직접적인 관계를 인터페이스를 이용하여 간접적인 관계로 변경하면 한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능하다.
 
 */


package OopExam;

interface Fightable extends Moveable, Attackable{}
interface Moveable{
	void move(int x, int y);
}
interface Attackable{
	void attack(Unit u);
}

class Unit {
	int currentHP; //유닛의 체력
	int x; //유닛의 x위치
	int y; //유닛의 y위치
}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}

public class InterfaceExam {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if(f instanceof Unit){//유닛의 객체이면?
			System.out.println("f는 Unit의 자손입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		}
		if(f instanceof Moveable) {
			System.out.println("f는 Moveable인터페이스를 구현했습니다.");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		}
		// Moveable   Attackable    Object
		//       Fightable(implement)      Unit(상속)
		//               Fighter

		if(f instanceof Object) {
			System.out.println("f는 Object ???");
		}
	}

}
