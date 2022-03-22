package am;

import java.util.Random;
import java.util.Scanner;

public class JAVAHW9 {

	public static void main(String[] args) {
		A a = new A();
		Scanner sc = new Scanner(System.in);
		
		//7-9
//		boolean b = true;
//		while(b) {
//			int res = a.readPlusInt();
//			System.out.print("반대로 읽으면: ");
//			while(res>0) {
//				System.out.print(res%10);
//				res = res/10;
//			}
//			System.out.println("입니다.");
//			
//			System.out.print("다시 한 번?<Yes..1/No..0>: ");
//			int ans = sc.nextInt();
//			if(ans==0) {
//				b = false;
//			}
//		}
		
		
		
		//7-10
//		Random rand = new Random();
//		int x = 100+(int)rand.nextInt(1000);
//		int y = 100+(int)rand.nextInt(1000);
//		int z = 100+(int)rand.nextInt(1000);
//		int quiz = 1+(int)rand.nextInt(4);
//		int res = 0;
//		int ans = 0;
//		int again = 1;
//		System.out.println("암산 훈련!!");
//		System.out.println(x + " " + y + " " + z + " " + quiz + " " + again);
//		
//		do{
//			switch(quiz) {
//			case 1:
//				System.out.print(x + " + " + y + " + " + z + " = ");
//				res = x+y+z; break;
//			case 2:
//				System.out.print(x + " + " + y + " - " + z + " = ");
//				res = x+y-z; break;
//			case 3:
//				System.out.print(x + " - " + y + " + " + z + " = ");
//				res = x-y+z; break;
//			case 4:
//				System.out.print(x + " - " + y + " - " + z + " = ");
//				res = x-y-z; 
//			}
//			System.out.println(res);
//			ans = sc.nextInt();
//			System.out.println(ans);
//			if(res==ans) {
//				System.out.print("다시 한 번?<Yes..1/No..0>: ");
//				again = sc.nextInt();
//				if(again==1){
//					x = 100+(int)rand.nextInt(1000);
//					y = 100+(int)rand.nextInt(1000);
//					z = 100+(int)rand.nextInt(1000);
//					quiz = 1+(int)rand.nextInt(4);
//				}
//			} else {
//				System.out.println("틀렸습니다!");
//			}
//			
//		}while(again==1);
		
		
		
		//7-15
//		System.out.print("요소 수: ");
//		int n = sc.nextInt();
//		int[] x = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			System.out.print("x[" + i + "]:");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.println("모든 요소의 합은 " + a.sumOf(x) +"입니다.");
		
		
		
		//7-16
//		System.out.print("사람 수는:");
//		int n = sc.nextInt();
//		System.out.println(n + "명의 신장과 체중을 입력하자.");
//		int[] height = new int[n];
//		int[] weight = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			System.out.print((i+1)+"번의 신장: ");
//			height[i] = sc.nextInt();
//			System.out.print((i+1)+"번의 체중: ");
//			weight[i] = sc.nextInt();
//		}
//		System.out.println("가장 키가 작은 사람의 신장: " + a.minOf(height) + "cm");
//		System.out.println("가장 마른 사람의 체중: " + a.minOf(weight) + "kg");
//		
		
		
		//7-17
//		System.out.print("요소 수:");
//		int n = sc.nextInt();
//		int[] x = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			System.out.print("x[" + i + "]:");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.print("찾는 값: ");
//		int key = sc.nextInt();
//		
//		int first = a.LinearSearch(x, key);
//		int last = a.LinearSearchR(x, key);
//		
//		System.out.println("해당 값의 요소가 여러 개 존재합니다.");
//		System.out.println("가장 앞에 위치한 값은 x[" + first + "]에 있습니다.");
//		System.out.println("가장 앞에 위치한 값은 x[" + last + "]에 있습니다.");

		

	}

}

class A{
	
	//7-9
	int readPlusInt() {
		Scanner sc = new Scanner(System.in);
		int x;
		do{
		System.out.print("양의 정숫값: ");
		x = sc.nextInt();
		} while(x<=0);
		
		return x;
	}
	
	//7-15
	int sumOf(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	//7-16
	int minOf(int[] a) {
		int min = a[0];
		for(int i=0; i<a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	
	//7-17
	int LinearSearch(int[] a, int key) {
		for(int i = 0; i<a.length; i++) {
			if(key==a[i]) {
				return i;
			}
		}
		return -1;
	}
	
	int LinearSearchR(int[] a, int key) {
		for(int i = a.length-1; i>=0; i--) {
			if(key==a[i]) {
				return i;
			}
		}
		return -1;
	}
	
}
