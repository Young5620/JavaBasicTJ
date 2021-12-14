package javaStudy;

public class Bus extends Car {
	
	public void ppangppang() {
		System.out.println("PPANGPPANG!!!");
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
	}

}
