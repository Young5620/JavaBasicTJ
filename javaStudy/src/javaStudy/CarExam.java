package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car("pony", 1234);
		
		System.out.println("name: " + car.name);
		System.out.println("number: " +car.number);
		//객체 = 인스턴스(Car라는 클라스로 찍어낸 인스턴스 c1) = 빈즈
		//생성자는 반드시 1개 이상 존재해야만 한다.
		//개발자가 만들지 않으면 자동으로 기본생성자 default constructor를 자바가 만들어준다.
		
		//Car c1 = new Car();
		//Car c2 = new Car("Grandeur");
		//System.out.println(c2.name);
		//c1.print();
	}

}
