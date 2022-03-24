package pm;

import java.util.Arrays;
import java.util.Scanner;

public class Javaprac {
	public static void main(String[] args) {
		
		// 숫자 뒤집기
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요: ");
//		int n = sc.nextInt();
//		
		P p = new P();
//		
//		System.out.print("결과값: ");
//		while(n>0) {
//			System.out.print(p.reverse(n));
//			n = n/10;
//		}
		
		// 중복된 값을 찾아서 삭제
		int[] a = {1,2,3,4};
		int[] b = {3,4,5,6};
		
		p.remove(a, b);
		
		
	}

}

class P{
	// 숫자 뒤집기
	int reverse(int n){
		int num = n%10;
		return num;
	}
	
	void remove(int[] a, int[] b) {
		boolean check = true; // 중복값의 유무를 알려주는 변수
		int[] res = new int[a.length];
		int cnt = 0;	// 결과값 배열 인덱스를 카운트
		for(int i = 0; i<a.length; i++) {
			for(int j =0; j<b.length; j++) {
				if(a[i]==b[j]) {
					check = false;
				}
			}
			if(check==true) {
				res[cnt] = a[i];
				cnt++;
			} else {
				check = true;
			}
		}
		
		for(int i = 0; i<b.length; i++) {
			for(int j =0; j<a.length; j++) {
				if(b[i]==a[j]) {
					check = false;
				}
			}
			if(check==true) {
				res[cnt] = b[i];
				cnt++;
			} else {
				check = true;
			}
		}
		
		System.out.println(Arrays.toString(res));
	}
	
}
