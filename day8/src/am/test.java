package am;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// 자바 입력 scanner 부르기
		System.out.println("target 입력");//target입력 이라고 알려주는 문구
		int target1 = sc.nextInt();	// 문제1번 입력받기
		int target2 = sc.nextInt();	// 문제2번 입력받기
		int target3 = sc.nextInt();	// 문제3번 입력받기
		AA a = new AA(); // 클래스 AA 객체생성
		a.test(target1); // test메소드 실행 
		B b = new B(); // 클래스 B 객체생성
		b.test(target2); // test메소드 실행 
		C c = new C(); // 클래스 C 객체생성
		c.test(target3); // test메소드 실행 

	}

}

//방법1
class AA{
	
	int[] nums2 = {2,7,11,15};	// 주어진 배열
	int[] res = new int[5];	// 결과값 배열
	int cnt22=0;// 결과값 인덱스 카운트
	void test(int target1){// 비교할 값을 받아와 메소드 시작
	for(int i=0; i<nums2.length-1; i++) {// 배열의 -1만큼 돌려준다.
		if((nums2[i] + nums2[i+1])%target1==0) {
			// 비교하는 배열값의 현재값과 다음값이 비교값과 나누었을때 0으로 떨어지면 걸린다.
			res[cnt22]=i;//값의 현재값을 넣어준다.
			cnt22++; //cnt 증가
			res[cnt22]=i+1; // 값의 다음값을 넣어준다.
			cnt22++; //cnt 증가
		}
	}
	System.out.println("[" + res[0] + ", " + res[1] + "]");	// 결과 배열값 출력
	}
}

//방법2
class B{
	
	int[] nums = {3,2,4};	// 주어진 배열
	int[] res = new int[2];	// 결과값 배열
	int cnt=0;// 결과값 인덱스 카운트
	void test(int target2){ // 비교할 값을 받아와 메소드 시작
	for(int i=0; i<nums.length-1; i++) {	// 배열의 -1만큼 돌려준다.
		if((nums[i] + nums[i+1])%target2==0) {
			// 비교하는 배열값의 현재값과 다음값이 비교값과 나누었을때 0으로 떨어지면 걸린다.
			res[cnt]=i; //값의 현재값을 넣어준다.
			cnt++; //cnt 증가
			res[cnt]=i+1; // 값의 다음값을 넣어준다.
			cnt++; //cnt 증가
		}
	}
	System.out.println(Arrays.toString(res)); // 결과 배열값 출력
	}
}

//방법3
class C{
	
	int[] nums = {3,3};	// 주어진 배열
	int[] res = new int[2];	// 결과값 배열
	
	void test(int target3){// 비교할 값을 받아와 메소드 시작
	for(int i=0; i<nums.length-1; i++) {// 배열의 -1만큼 돌려준다.
		if((nums[i] + nums[i+1])%target3==0) {
			// 비교하는 배열값의 현재값과 다음값이 비교값과 나누었을때 0으로 떨어지면 걸린다.
			res[i]=i;//값의 현재값을 넣어준다.
			res[i+1]=i+1;// 값의 다음값을 넣어준다.
		}
	}
	System.out.println(Arrays.toString(res));// 결과 배열값 출력
	}
}
