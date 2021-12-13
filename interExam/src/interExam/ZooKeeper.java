package interExam;

public class ZooKeeper {
	
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());

	//객체가 한 개 이상의 자료형 타입을 갖게되는 특성을 다형성이라고 한다.
	
//	public void feed(Tiger tiger) {
//		System.out.println("feed apple");
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
//	
//	public void feed(Donkey donkey) {
//		System.out.println("feed carrot");
	}
	
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Donkey donkey = new Donkey();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(donkey);
	}
}
