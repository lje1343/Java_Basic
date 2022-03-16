package pm;

import java.util.Arrays;
import java.util.Scanner;

public class JavaExam {

public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);// 자바 입력 scanner 선언
		int[] nums1 = {2,7,11,15};	// 문제1번 배열
		int[] nums2 = {3,2,4};		// 문제2번 배열
		int[] nums3 = {3,3};		// 문제3번 배열
		
		System.out.println("target을 입력해주세요.");//target입력이라고 알려주는 문구
		int target1 = sc.nextInt();	// 문제1번  target 입력받기
		int target2 = sc.nextInt();	// 문제2번  target 입력받기
		int target3 = sc.nextInt();	// 문제3번  target 입력받기
		
		JE je = new JE(); // 클래스 JE 객체생성
		je.test(target1, nums1); // test메소드 실행 (문제1번)
		je.test(target2, nums2); // test메소드 실행 (문제2번)
		je.test(target3, nums3); // test메소드 실행 (문제3번)
		
		sc.close();

	}

}

class JE{
	int[] res = new int[2];	// 결과값 배열
	
	void test(int target, int[] nums){// 비교할 값과 배열을 받아와 메소드 시작
		for(int i=0; i<nums.length-1; i++) {// 배열의 -1만큼 돌려준다.
			if((nums[i] + nums[i+1])==target) {
				// 비교하는 배열값의 현재값과 다음값이 비교값과 같을 경우 조건문에 걸린다.
				res[0]=i;//값의 현재값을 넣어준다.
				res[1]=i+1;// 값의 다음값을 넣어준다.
			}
		}
	System.out.println(Arrays.toString(res));// 결과 배열값 출력
	
	}
}

