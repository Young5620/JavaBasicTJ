package OopExam;

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20;
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
}

public class SuperExam {

	public static void main(String[] args) {
		//super와 this는 static에서는 사용할 수 없다.
		Child c = new Child();
		c.method();

	}

}
