package am;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		// 배열, 반복
		// 주석, 클래스, 객체
		
		//Q1.>
//		int[] a = {1,2,3,4,5};	
//		T t = new T();
//		t.test(a);
		
		//Q2.>
		A a = new A();
		a.test();

		

	}
}

class A{
	
	int[] a = {1,3,4,5,6};	// 주어진 배열
	int[] res = new int[2];	// 결과값 배열
	
	void test(){
	for(int i=0; i<a.length-1; i++) {
		if((a[i] + a[i+1])%2==0) {
			res[i]=i;
			res[i+1]=i+1;
		}
	}
	System.out.println(Arrays.toString(res));
	}
	
}

//class T{
//	
//	void test(int[] a){
//	for(int i=0; i<a.length-1; i++) {
//
//		for(int j=0; j<1; j++) {
//			System.out.print(a[i] + ", " + a[i+1]);	
//		}
//		System.out.println();
//		}
//	}
//	
//}
