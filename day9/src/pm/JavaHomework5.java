package pm;

import java.util.Scanner;

public class JavaHomework5 {

	public static void main(String[] args) {
		// 4-30
//		System.out.println("숫자 맞추기 게임 시작!");
//		Scanner sc = new Scanner(System.in);
//		int n = (int)(Math.random()*100);
//		int cnt = sc.nextInt();
//		System.out.println(n);
//		
//		for(int i = 1; i <= cnt; i++) {
//			System.out.println("0부터 99 사이의 숫자를 맞추세요.");
//			int res = sc.nextInt();
//			
//			if(res>n) {
//				System.out.println("남은 횟수 " + (cnt-i) + "회, " + "어떤 숫자일까?");
//				System.out.println("더 작은 숫자입니다.");
//			} else if (res<n) {
//				System.out.println("남은 횟수 " + (cnt-i) + "회, " + "어떤 숫자일까?");
//				System.out.println("더 큰 숫자입니다.");
//			} else {
//				System.out.println(i + "회만에 맞추었습니다."); break;
//			}
//		}
		
		//6-1
//		double[] a = new double[5];
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("a[" + i + "]" + " = " + a[i]);
//		}
		
		//6-2
//		int[] a = new int[5];
//		int cnt = 5;
//		for(int i=0; i<5; i++) {
//			a[i] = cnt;
//			cnt--;
//			System.out.println("a[" + i + "]" + " = " + a[i]);
//		}
		
		//6-3
//		double[] a = new double[5];
//		double put = 1.1;
//		for(int i=1; i<=5; i++) {
//			a[i-1] = put*i;
//			System.out.println("a[" + (i-1) + "]" + " = " + a[i-1]);
//		}
		
		//6-6
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < a.length; i++) {
			int n = sc.nextInt();
			a[i] = n;
			System.out.println("a["+i+"]"+" = "+n);
		}
		
		
		for(int j = 0; j< a.length; j++) {
			if(j==0) {
				System.out.print("a = {" + a[j] + ", ");
			} else if(j==a.length-1) {
				System.out.print(a[j] + "}");
			} else {
				System.out.print(a[j] + ", ");
			}
		}
			

	}

}
