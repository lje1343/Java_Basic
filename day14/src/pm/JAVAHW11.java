package pm;

import java.util.Arrays;
import java.util.Scanner;

public class JAVAHW11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		JH jh = new JH();
		
		//7-23 (다른 방법으로 품)
//		System.out.print("요소 수: ");
//		int n = sc.nextInt();
//		int[] x = new int[n];
//		
//		for(int i = 0; i<x.length; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.print("탐색할 값: ");
//		int find = sc.nextInt();
//		
//		System.out.println("일치하는 요소의 인덱스");
//		for(int i= 0; i<x.length; i++) {
//			int res = jh.arraySrchIdx(x[i], find);
//			if(res==1) {
//				System.out.println(i);
//			}
//		}
		
		//7-24
//		System.out.print("요소 수: ");
//		int n = sc.nextInt();
//		int[] x = new int[n];
//		
//		for(int i = 0; i<x.length; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.print("삭제할 요소의 인덱스: ");
//		int idx = sc.nextInt();
//		int y[] = jh.arrayRmvOf(x, idx);
//		
//		for(int i = 0; i<y.length-1; i++) {
//			System.out.println("y[" + i + "]: " + y[i]);
//		}
		
		//7-25
//		System.out.print("요소 수: ");
//		int num = sc.nextInt();
//		int[] x = new int[num];
//		
//		for(int i = 0; i<x.length; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.print("삭제할 요소의 인덱스: ");
//		int idx = sc.nextInt();
//		System.out.print("삭제할 요소의 개수: ");
//		int n = sc.nextInt();
//		
//		int y[] = jh.arrayRmvOfN(x, idx, n);
//		
//		for(int i=0; i<n; i++) {
//			System.out.println("y[" + i + "]: " + y[i]);
//		}
		
		//7-26
//		System.out.print("요소 수: ");
//		int num = sc.nextInt();
//		int[] x = new int[num];
//		
//		for(int i = 0; i<x.length; i++) {
//			System.out.print("x[" + i + "]: ");
//			x[i] = sc.nextInt();
//		}
//		
//		System.out.print("삽입할 인덱스: ");
//		int idx = sc.nextInt();
//		System.out.print("삽입할 값: ");
//		int n = sc.nextInt();
//		
//		int y[] = jh.arrayInsOf(x, idx, n);
//		
//		for(int i=0; i<x.length+1; i++) {
//			System.out.println("y[" + i + "]: " + y[i]);
//		}
		
		//7-27
//		System.out.println("행렬a");
//		int[][] a = {{1,2,3}, {4,5,6}};
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		System.out.println();
//		
//		System.out.println("행렬b");
//		int[][] b = {{6,3,4}, {5,1,2}};
//		for(int i=0; i<b.length; i++) {
//			for(int j=0; j<b[i].length; j++) {
//				System.out.print(b[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		System.out.println("행렬c");
//		int[][] c = new int[2][3];
//		boolean res = jh.addMatrix(a,b,c);
//		
//		System.out.println();
//		System.out.println(res);
		
		
	}

}

class JH{
	//7-23
	int arraySrchIdx(int x, int find) {
		if(x==find) {
			return 1;			
		} else {
			return 0;
		}
	}
	
	//7-24
	int[] arrayRmvOf(int[] a, int idx) {
		int[] res = new int[a.length];
		
		for(int i=0; i < a.length-1; i++) {
			if(i>=idx) {
				res[i] = a[i+1];
			} else {
				res[i] = a[i];
			}
		}
		return res;
	}
	
	//7-25
	int[] arrayRmvOfN(int[] a, int idx, int n) {
		int[] res = new int[a.length-n]; // 결과값 배열
		int cnt = 0; //결과값 배열 카운트
		for(int i=0; i<a.length; i++) {
			if(i<idx || i>idx+n-1) {	
				//삭제할 인덱스 전값들과 삭제할 인덱스값~삭제할 요수의 수 이후 값 삽입
				res[cnt] = a[i];
				cnt++;
			}
		}	
		return res;
	}
	
	//7-26
	int[] arrayInsOf(int[] a, int idx, int x) {
		int[] res = new int[a.length+1];
		
		for(int i=0; i<res.length; i++) {
			if(i<idx) {
				res[i] = a[i];
			} else if(i==idx){
				res[i] = x;
			} else {
				res[i] = a[i-1];
			}
		}
		return res;
	}
	
	//7-27
	boolean addMatrix(int[][] x, int[][]y, int[][]z) {
		
		// 세 배열의 행 수 비교
		if(x.length != y.length || x.length != z.length || 
				y.length != z.length) {
			return false;
		}
		
		// 세 배열의 열 수 비교
		for(int i=0; i<x.length; i++) {
			if(x[i].length != y[i].length || x[i].length != z[i].length || 
					y[i].length != z[i].length) {
				return false;
			}
		}
		
		// x,y 배열의 합을 z에 대입
		for(int i=0; i<x.length; i++) {
			for(int j=0; j<x[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		// z배열 출력
		for(int i=0; i<z.length; i++) {
			for(int j=0; j<z[i].length; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
		return true;
	}
	
	
}
