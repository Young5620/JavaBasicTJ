package j20211213;

public class Dog extends Animal{//extends Animal - Animal 에 있는 모든 기능을 가져온다.

    public Dog() {
        //기존 생성자. default constructor
    }

    public void sleep() { //자식만의 기능을 추가
        System.out.println(this.name+" zzz");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();

    }
    
}
