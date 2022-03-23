package pm;

import java.util.Arrays;
import java.util.Scanner;

public class JAVAHW10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HW hw = new HW();
		//7-18		
//		System.out.print("요소 수: ");
//		int n = sc.nextInt();
//		int[] a = new int[n];
//		
//		for(int i = 0; i<a.length; i++) {
//			System.out.print("a[" + i + "]: ");
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.print("삭제할 요소의 인덱스: ");
//		int idx = sc.nextInt();
//		hw.aryRmv(a, idx);
		
		//7-19
//		System.out.print("요소 수: ");
//		int num = sc.nextInt();
//		int[] a = new int[num];
//		
//		for(int i = 0; i<a.length; i++) {
//			System.out.print("a[" + i + "]: ");
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.print("삭제할 요소의 인덱스: ");
//		int idx = sc.nextInt();
//		System.out.println("삭제할 요소의 수: ");
//		int n = sc.nextInt();
//		hw.aryRmvN(a, idx, n);
		
		//7-20
//		System.out.print("요소 수: ");
//		int num = sc.nextInt();
//		int[] a = new int[num];
//		
//		for(int i = 0; i<a.length; i++) {
//			System.out.print("a[" + i + "]: ");
//			a[i] = sc.nextInt();
//		}
//		
//		System.out.print("삽입할 요소의 인덱스: ");
//		int idx = sc.nextInt();
//		System.out.println("삽입할 값: ");
//		int x = sc.nextInt();
//		hw.aryIns(a, idx, x);
		
		//7-21
//		System.out.print("배열 a의 요소 수: ");
//		int num1 = sc.nextInt();
//		int[] a = new int[num1];
//		
//		for(int i = 0; i<a.length; i++) {
//			System.out.print("a[" + i + "]: ");
//			a[i] = sc.nextInt();
//		}
//
//		System.out.print("배열 b의 요소 수: ");
//		int num2 = sc.nextInt();
//		int[] b = new int[num2];
//		
//		for(int i = 0; i<b.length; i++) {
//			System.out.print("b[" + i + "]: ");
//			b[i] = sc.nextInt();
//		}
//		
//		System.out.println("배열 a와 b의 전체 요소를 교환했습니다.");
//		hw.aryExchng(a, b);	
		
		//7-22
//		System.out.print("요소 수: ");
//		int num = sc.nextInt();
//		int[] x = new int[num];
//		
//		for(int i = 0; i<x.length; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
//		int[] y = hw.arrayClone(x);
//		
//		for(int i = 0; i < y.length; i++) {
//			System.out.println("y[" + i + "] = " + y[i]);
//		}
		
		

	}

}

class HW{
	
	// 7-18
	void aryRmv(int[] a, int idx) {
		int add = 0; // 삭제할 인덱스를 만난 이후부터 더해줄 값
		for(int i = 0; i < a.length; i++) {
			if(a[i] == a[idx]) {
				System.out.println("a[" + i + "]: " + a[i+1]);	
				add = 1;
			} else {
				
				if(i==a.length-1) {
					System.out.println("a[" + i + "]: " + a[i]);										
				}else {
					System.out.println("a[" + i + "]: " + a[i+add]);					
				}
			}
			
		}
	}
	
	//7-19
	void aryRmvN(int[] a, int idx, int n) {
		for(int i = 0; i< a.length; i++) {
			if(a[i] == a[idx]) {
				for(int j=i; j<n; j++) {
					System.out.println("a[" + j + "]: " + a[j+n]);
					if(j==n-1) {
						i++;
					}
				}
			} else {
				System.out.println("a[" + i + "]: " + a[i]);
			}
			
		}
	}
	
	//7-20
	void aryIns(int[] a, int idx, int x) {
		int add = 0;
		for(int i = 0; i < a.length; i++) {
			if(i==idx) {
				System.out.println("a[" + i + "]: " + x);
				add--;
			}else {
				System.out.println("a[" + i + "]: " + a[i+add]);
			}
			
		}
	}
	
	//7-21
	void aryExchng(int[] a, int[] b) {
		if(a.length != b.length) {
			int min = (a.length> b.length) ? b.length:a.length;
			for(int i=0; i<min; i++) {
				int temp = 0;
				temp = a[i];
				a[i] = b[i];
				b[i] = temp;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}

		for(int i=0; i<b.length; i++) {
			System.out.println("b[" + i + "]: " + b[i]);
		}
	}
	
	//7-22
	int[] arrayClone(int[] a) {
		int[] clone = new int[a.length];
		for(int i = 0; i< a.length; i++) {
			clone[i] = a[i];
		}
		return clone;
	}
	
}