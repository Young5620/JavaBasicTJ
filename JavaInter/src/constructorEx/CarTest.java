package constructorEx;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "White";
		c1.gear = "Auto";
		c1.door = 2;
		
		Car c2 = new Car("Black", "Auto", 4);

		System.out.println("c1의 색상은" + c1.color);
		System.out.println("c2의 색상은" + c2.color);
	}

}
