package pm;

import java.util.Random;
import java.util.Scanner;
  
public class JAVAHW8 {

    // 7-3
    // int med (int a, int b, int c) {
    //     if(a >= b){
    //         if(b >= c){
    //             return b;
    //         } else if (c >= a){
    //             return a;
    //         } else{
    //             return b;
    //         }
    //     } else if (c < a){
    //         return a;
    //     } else if (b > c){
    //         return c;
    //     } else{
    //         return b;
    //     }
    // }

    // 7-4
    // int sumUp(int n){
    //     int sum = 0;
    //     for(int i = 1; i <= n; i++){
    //         sum += i;
    //     }
    //     return sum;
    // }

    // 7-6
    // void printSeason(int m){
    //     switch(m){
    //         case 3 : case 4 : case 5:
    //         System.out.println("해당 월의 계절은 봄입니다."); break;
    //         case 6 : case 7 : case 8:
    //         System.out.println("해당 월의 계절은 여름입니다."); break;
    //         case 9 : case 10 : case 11:
    //         System.out.println("해당 월의 계절은 가을입니다."); break;
    //         case 12 : case 1 : case 2:
    //         System.out.println("해당 월의 계절은 겨울입니다."); break;
    //         default:
    //         break;
    //     }
    // }

    //7-7
    // void putChar(char c, int n){
    //     for(int i = 0; i <= n; i++){
    //         System.out.print(c);
    //     }
    //     System.out.println();
    // }

    // void putStart(int n){
    //     putChar('*',n);
    // }

    // 7-8
    // int random(int a, int b){
    //     Random rand = new Random();
    //     int r = a + rand.nextInt(b);
    //     return r;
    // }
    public static void main(String[] args) {
        //7-3
        // JAVAHW8 j = new JAVAHW8();
        //Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("정수 a : " + a);
        // System.out.println("정수 b : " + b);
        // System.out.println("정수 c : " + c);
        // System.out.println("중간값은 " + j.med(a,b,c) + "입니다.");

        //7-4
        // JAVAHW8 j = new JAVAHW8();
        // System.out.println("1부터 x까지의 합을 구하자");
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // System.out.println("x의 값: " + x);
        // System.out.println("1부터 5까지의 합은 " + j.sumUp(x) + "입니다.");
        

        //7-6
        // JAVAHW8 j = new JAVAHW8();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("몇 월입니까(1~12): ");
        // int m = sc.nextInt();
        // j.printSeason(m);

        //7-7
        // System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        // JAVAHW8 j = new JAVAHW8();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("단수는: ");
        // int n = sc.nextInt();

        // for(int i = 0; i<n; i++){
        //     j.putStart(i);
        // }

        //7-8
        // JAVAHW8 j = new JAVAHW8();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("난수를 생성합니다.");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("하한값:"+ a);
        // System.out.println("상한값:"+ b);
        // System.out.println("생성한 난수는 " + j.random(a, b) + "입니다.");

        
    }
    
}
