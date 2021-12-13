package j20211213;

import java.util.Scanner;
public class ifExam {
    public static void main(String[] args) {

        //'점수를 입력하세요?''
        //90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 0~59점까지는 F
        
        int score = 0;
        char grade = ' ';
        System.out.print("Score?");

        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if(score>=90) {
            grade = 'A';
        }
        else if(score>=80) {
            grade = 'B';
        }
        else if(score>=70) {
            grade = 'C';
        }
        else if(score>=60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println("Your Grade : " + grade);


        // if (조건1) {
        //     System.out.println("True일때 실행");
        // }
        // else if (조건2){
        //     System.out.println("True일때 실행");
        // }
        // else {
        //     System.out.println("나머지 모든경우 실행");
        // }
    }
    
}
