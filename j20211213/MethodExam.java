package j20211213;

public class MethodExam {
    //1. input과 output 모두 있는 매서드
    public int sum(int a, int b) {
        return a+b;
    }

    //2. input과 output 모두 없는 매서드
    public void noino() {
        System.out.println("No input no ouput");
    }

    //3. input만 있는 매서드
    public void onlyInput(String a) {
        System.out.println(a);
    }
    
    //4. output만 있는 매서드
    public String onlyOutput() {
        return "hi~";
    }

    //* 리턴의 다른 사용법
    public void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return;//중간에 끝낼때 사용하기도 한다.
        }
        System.out.println("my nick name is " + nick);
    }
    public static void main(String[] args) {
        MethodExam inandout = new MethodExam();
        // System.out.println(inandout.sum(3,4));
        // inandout.noino();
        // inandout.onlyInput("hello world");
        // System.out.println((inandout.onlyOutput()));
        inandout.sayNick("fool");
        inandout.sayNick("austin");
        
    }
}
