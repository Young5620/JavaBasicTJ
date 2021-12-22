package constructorEx;

public class Car2 {
	String color;
	String gear;
	int door;
	
	Car2(){
		this("White", "Auto", 4); // 여기가 c1이 되고 -> 밑으로 쏴준다.
	}
	
	Car2(String color, String gear, int door) {
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
}
