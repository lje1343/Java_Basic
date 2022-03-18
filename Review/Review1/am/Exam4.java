package am;

import java.util.Scanner;

public class Exam4 {
    /* 제어문  
    조건문 if switch~case
    
    반복문 while~do while for
    
    자바에서는 5개의 제어문과 2개의 제어 키워드 -> break continue

    */

    public static void main(String[] args) {
        
        int val = 5;
        if(val < 3){
            System.out.println("실행1");
        } else{
            System.out.println("실행2");
        }

        int score = 85;
        String c = "";
        if(score >= 90){
            c = "A";
        } else if (score >= 80){
            c = "B";
        } else if (score >= 70){
            c = "C";
        } else if (score >= 60){
            c = "D";
        } else{
            c = "F";
        }

        System.out.println("당신의 학점은 " + c + " 입니다.");

        //Q.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x>0){
            System.out.println("입력하신 " + x + "는 양의 정수입니다.");
        } else if(x<0){
            System.out.println("입력하신 " + x + "는 음의 정수입니다.");
        } else{
            System.out.println("입력하신 " + x + "는 0입니다.");
        }


    }
}
