package j20211213;

public class VariableExam {
    /* 변수의 영향 범위

    전역변수와 지역변수
    
    */

    int a;  //전역 변수의 사용은 지양하자.
    
    public void varTest(VariableExam testvar) {
        testvar.a++; //매서드 안에서 선언했기 때문에 매서드 안에서만 영향이 있다. (지역변수) 여기 있는 a와 밑에 있는 a는 다른 a다.
        //a 를 가지고 나가라는 return이라는 것이 필요하다.
    }
    
    public static void main(String[] args) {
        // int a = 1; //매서드 안에서 a를 선언
        VariableExam testvar = new VariableExam();
        testvar.a = 1;
        testvar.varTest(testvar);
        System.out.println(testvar.a);
        //
    }
}
