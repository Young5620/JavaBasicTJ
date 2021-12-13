package j20211213;

import java.util.Scanner;
public class forExam {
    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Line ? ");

        num = sc.nextInt();

        for (int j = 0; j< num ; j++) {
        for (int i = 0; i< num ; i++) {
            System.out.print("*");            
        } //입력받은 숫자만큼 별찍기
        System.out.println("");
    }
        //'Lines ?'  3
        //***
        //***
        //***

        //'Lines ?'  5
        //*****
        //*****
        //*****
        //*****
        //*****

    }
}
