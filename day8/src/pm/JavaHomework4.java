package pm;

import java.util.Scanner;

public class JavaHomework4 {

	 public static void main(String[] args) {
 		//4-22
		//1>
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		//2>
//		for(int i=5; i>0; i--) {
//			for(int j=i; j>0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//4-25
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int cnt = 0;
//		for(int i = 1; i<=n; i++) {
//			if(n%i == 0) { 
//				cnt++; 
//			}
//		}
//		
//		if (cnt==2) {
//			System.out.println("소수입니다.");
//		} else {
//			System.out.println("소수가 아닙니다.");
//		}
		
		//4-26
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 더합니다.\n몇 개를 더할까요?: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		int cnt = 0;
//		
//		for(int i=0; i<n; i++) {
//			System.out.println("정수(0으로 종료): ");
//			
//			int num = sc.nextInt();
//			if(num==0) {
//				break;
//			}
//			cnt++;
//			sum+=num;			
//		}
//		
//		System.out.println("합계는 " + sum + "입니다.");
//		System.out.println("평균은 " + sum/cnt + "입니다.");
		
		//4-27
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 더합니다.\n몇 개를 더할까요?: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		int cnt = 0;
//		
//		for(int i = 0; i < n; i ++) {
//			System.out.println("정수 : ");
//			int num = sc.nextInt();
//			sum+=num;
//			if(sum>1000) {
//				System.out.println("합계가 1000을 넘었습니다.\n마지막 값은 무시합니다.");
//				sum-=num;
//				break;
//			}
//			cnt++;
//		}
//		
//		System.out.println("합계는 " + sum + "입니다.");
//		System.out.println("평균은 " + sum/cnt + "입니다.");
//		
//		
		
		//4-28
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 더합니다.\n몇 개를 더할까요?: ");
//		int n = sc.nextInt();
//		int sum = 0;
//		int cnt = 0;
//		
//		for(int i = 0; i < n; i ++) {
//			System.out.println("정수 : ");
//			int num = sc.nextInt();
//			sum+=num;
//			cnt++;
//			if(num<0) {
//				System.out.println("음수는 더하지 않습니다.");
//				sum-=num;
//				cnt--;
//			}
//		}
//		
//		System.out.println("합계는 " + sum + "입니다.");
//		System.out.println("평균은 " + sum/cnt + "입니다.");
//		System.out.println(cnt);

	}

}
