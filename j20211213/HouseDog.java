package j20211213;

public class HouseDog extends Dog { //다중 상속은 불가능.

    public HouseDog(String name) {
        this.setName(name);
    }

    public HouseDog(int type) {
        if (type==1) {
            this.setName("york");
        }
        else if (type==2) {
            this.setName("bulldog");
        }
    }

    public void sleep() { //자식만의 기능을 추가
        System.out.println(this.name+" zzz in house"); //인수가 없을때 작동
    }

    public void sleep(int hour) { //overloding
        System.out.println(this.name+" zzz in house for " + hour + "hours"); //인수가 있을때 작동
    }
    public static void main(String[] args) {
        HouseDog houseDog1 = new HouseDog("happy"); //문자열로 생성자 호출
        //houseDog.setName("happy");
        System.out.println(houseDog1.name);
        //houseDog.sleep();
        //houseDog.sleep(3);

        HouseDog houseDog2 = new HouseDog(1); //숫자로 생성자 호출
        System.out.println(houseDog2.name);
    }
}
