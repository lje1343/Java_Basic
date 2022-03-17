package pm;

import java.util.Random;
import java.util.Scanner;

public class JavaHW7 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		//6-15
//		int ans = 1;
//		String s1 = "";
//		
//		System.out.println("해당 월의 영어 단어를 입력하시오.\n첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
//		while (ans==1) {
//			int m = 1+ rand.nextInt(12);
//			System.out.print(m + "월 : ");
//			String s2 = sc.next();
//			
//			switch (m) {
//			case 1:
//				s1 = "January"; break;
//			case 2:
//				s1 = "February"; break;
//			case 3:
//				s1 = "March"; break;
//			case 4:
//				s1 = "April"; break;
//			case 5:
//				s1 = "May"; break;
//			case 6:
//				s1 = "June"; break;
//			case 7:
//				s1 = "July"; break;
//			case 8:
//				s1 = "August"; break;
//			case 9:
//				s1 = "January"; break;
//			case 10:
//				s1 = "October"; break;
//			case 11:
//				s1 = "November"; break;
//			case 12:
//				s1 = "December"; break;
//			}
//			
//			if(s1.equals(s2)) {
//				System.out.print("정답입니다. 다시 한번? 1...Yes/0...No: ");
//				ans = sc.nextInt(); 
//			} else {
//				System.out.println("틀렸습니다.");
//			}
//		}
		
		//6-16
//		int ans = 1;
//		String s1 = "";
//		
//		System.out.println("요일명을 영어 소문자로 입력하시오.");
//		while (ans==1) {
//			int m = 1+ rand.nextInt(7);
//			
//			switch (m) {
//			case 1:
//				s1 = "monday"; 
//				System.out.print("월요일 : ");
//				break;
//			case 2:
//				s1 = "tuesday"; 
//				System.out.print("화요일 : ");
//				break;
//			case 3:
//				s1 = "wednesday"; 
//				System.out.print("수요일 : ");
//				break;
//			case 4:
//				s1 = "thursday"; 
//				System.out.print("목요일 : ");
//				break;
//			case 5:
//				s1 = "friday"; 
//				System.out.print("금요일 : ");
//				break;
//			case 6:
//				s1 = "saturday"; 
//				System.out.print("토요일 : ");
//				break;
//			case 7:
//				s1 = "sunday"; 
//				System.out.print("일요일 : ");
//				break;
//			}
//			
//			String s2 = sc.next();
//			
//			if(s1.equals(s2)) {
//				System.out.print("정답입니다. 다시 한번? 1...Yes/0...No: ");
//				ans = sc.nextInt(); 
//			}
//		}
		
		//6-18
//		int[][] a = new int[4][3];
//		int[][] b = new int[3][4];
//		int[][] res = new int[4][4];
//		
//		System.out.println("행렬 a의 요소를 입력하세요.");
//		for(int i = 0; i<a.length; i++) {
//			for(int j = 0; j<a[i].length; j++) {
//				int n1 = sc.nextInt();
//				a[i][j] = n1;
//				System.out.println("a["+i+"]["+j+"] : "+n1);
//			}
//		}
//
//		System.out.println("행렬 b의 요소를 입력하세요.");
//		for(int i = 0; i<b.length; i++) {
//			for(int j = 0; j<b[i].length; j++) {
//				int n2 = sc.nextInt();
//				b[i][j] = n2;
//				System.out.println("b["+i+"]["+j+"] : "+n2);
//			}
//		}
//		
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j < 4; j++) {
//				res[i][j] = 0;
//			for(int k = 0; k < 3; k++) {
//				res[i][j] += a[i][k] * b[k][j];
//			}
//			}
//		}
//		
//		System.out.println("행렬 a와 b의 곱");
//		for(int i = 0; i<4; i++) {
//			for(int j = 0; j<4; j++) {
//				System.out.printf("%5d", res[i][j]);
//			}
//			System.out.println();
//		}
		
		//7-1
//		System.out.print("정수x: ");
//		int x = sc.nextInt();
//		T t = new T();
//		t.singOf(x);
		
		//7-2
//		System.out.print("정수a: ");
//		int a = sc.nextInt();
//		System.out.print("정수b: ");
//		int b = sc.nextInt();
//		System.out.print("정수c: ");
//		int c = sc.nextInt();
//		
//		TT tt = new TT();
//		tt.min(a, b, c);

	}

}

//7-1
//class T{
//	void singOf(int x) {
//		if(x>0) {
//			System.out.println("singOf(x)는 1입니다.");
//		} else if(x<0) {
//			System.out.println("singOf(x)는 -1입니다.");			
//		} else {
//			System.out.println("singOf(x)는 0입니다.");
//		}
//	}
//}

//7-2
//class TT{
//	void min(int a, int b, int c) {
//		int res = (a<b) ? a : (b<c) ? b : c;
//		System.out.println("최솟값은 " + res + "입니다.");
//	}
//}
