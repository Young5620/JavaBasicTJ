package OopExam;

public class SuperConstructorExam {

	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.x);
		System.out.println(p3.y);
		System.out.println(p3.z);
	}
}

class Point{
	int x, y;
//	Point(){
//		//첫번쨰 방법: 아무 생성자 하나를 생성
//	};
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLoc() {
		return "x: "+ x + ", y : " + y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x, int y, int z){ 
		//에러 발생
		//Point3D클래스의 생성자에서 조상클래스의 생성자인 Point()를 찾을 수 없다는 내용의 에러발생
        //Point3D클래스의 생성자의 첫 줄에 생성자(부모)를 호출하는 문장이 없어서 자동적으로 super();를 생성자의 첫줄에 넣어준다.
		super(x,y);//두번째 방법: super(x,y);를 여기에 자동으로 생성
		this.x = x;
		this.y = y;
		this.z = z;
	}
	String getLoc() {
		return "x: "+ x + ", y : " + y + ", z : " + z;
	}
}