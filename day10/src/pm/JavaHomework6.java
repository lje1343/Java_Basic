package pm;

import java.util.Random;
import java.util.Scanner;

public class JavaHomework6 {

	public static void main(String[] args) {
		
		// 6-8
		//1. 가장 앞
//		Scanner sc = new Scanner(System.in);
//		System.out.print("요소 수 :");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			int put = sc.nextInt();
//			a[i] = put;
//			System.out.println("a[" + i + "] = " + put);
//		}
//		
//		System.out.print("찾을 숫자 : ");
//		int find = sc.nextInt();
//		
//		int i = 0;
//		for(i = 0; i < n; i++) {
//			if(a[i] == find) {
//				break;
//			}
//		}
//		
//		if(i<n) {
//			System.out.println("그 값은 a[" + i + "]에 있습니다.");			
//		} else {
//			System.out.println("존재하지 않는 값입니다.");
//		}
		
		//2.가장 뒤	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("요소 수 :");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			int put = sc.nextInt();
//			a[i] = put;
//			System.out.println("a[" + i + "] = " + put);
//		}
//		
//		System.out.print("찾을 숫자 : ");
//		int find = sc.nextInt();
//		
//		int i = 0;
//		for(i = n-1; i >= 0; i--) {
//			if(a[i] == find) {
//				break;
//			}
//		}
//		
//		if(i>=0) {
//			System.out.println("그 값은 a[" + i + "]에 있습니다.");			
//		} else {
//			System.out.println("존재하지 않는 값입니다.");
//		}

		//6-11
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("요소 수 :");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		
//		a[0] = 1 + rand.nextInt(10);
//
//		for(int i = 1; i<n; i++) {
//			do {
//				a[i] = 1 + rand.nextInt(10);
//			} while(a[i]==a[i-1]);	// 같으면 true, 아니면 false
//		}
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println("a[" + i + "] = " + a[i]);
//		}
		
		//6-12
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("요소 수 :");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			a[i] = 1 + rand.nextInt(10);
//		}
//		
//		for(int i = 0; i<n; i++) {
//			int j;
//			do {
//				j = 0;
//				a[i] = 1 + rand.nextInt(10);
//				for(; j<i; j++) {
//					if(a[j]==a[i]) break;
//				}
//			}while(j<i);
//		}
//		
//		for(int i = 0; i < n; i++) {
//			System.out.println("a[" + i + "] = " + a[i]);
//		}
		
		//6-13
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수 :");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			int put = sc.nextInt();
//			a[i] = put;
//			System.out.println("a[" + i + "] = " + put);
//		}
//		
//		for(int i = 0; i < 2*n; i++) {
//			int shf1 = rand.nextInt(n);
//			int shf2 = rand.nextInt(n);
//			int temp = a[shf1];
//			a[shf1] = a[shf2];
//			a[shf2] = temp;
//		}
//		System.out.println("요소를 섞었습니다.");
//		
//		for(int i = 0; i < n; i++) {
//		System.out.println("a[" + i + "] = " + a[i]);
//	}
		
		//6-14
//		Random rand = new Random();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("요소 수 :");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		int[] b = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			int put = sc.nextInt();
//			a[i] = put;
//			System.out.println("a[" + i + "] = " + put);
//		}
//		
//		for(int i = n-1; i > 0; i--) {
//			int temp = a[i];
//			a[i] = a[i-1];
//			a[i-1] = temp;
//		}
//		System.out.println("a의 모든 요소를 역순으로 복사했습니다.");
//		
//		for(int i = 0; i < n; i++) {
//			b[i] = a[i];
//		System.out.println("b[" + i + "] = " + b[i]);
//	}
		
		
		
	}

}
