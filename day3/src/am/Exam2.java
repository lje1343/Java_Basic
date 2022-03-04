package am;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		// Break 제어 키워드
		
		// break는 if구문을 제외한 {}를 탈출하는 제어 키워드이다.
		// 일반적으로 반복문에서 특정 조건을 만족하는 경우 반복문을 탈출하는데 사용된다.
//		for(int i=0; i<10; i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		// 꼭 기억해야하는 점은 break를 이용해 탈출하는 것은 if문을 제외한
		// 가장 가까운 중괄호라는 것이다. 따라서, 만약 이중 for문에서 break를
		// 사용할 경우 안쪽 for문만 탈출하게 된다.
		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				if(j==3) {
//					break;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
		
		//j가 3이되면 break로 탈출하게 되는 반복문은 안쪽의 for문이다.
		//탈출을 한 뒤에도 바깥쪽 for문 내부에 있기 때문에 i값의 변화에
		//따른 반복은 여전히 유효하게 된다.
		
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				if(j==3) {
//					i=100;
//					break;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
		
//		out:	// 위치 지정 레이블
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<10; j++) {
//				if(j==3) {
//					break out;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
	
		// break out은 out 레이블이 위치해 있는 바깥 쪽 for문을
		// 완전히 탈출하라는 의미가 된다.
	
		//continue 제어 키워드
		// 반복과정에서 특정 구문을 실행하지 않고 건너뛰는 용도로 사용된다.
	
//		for(int i=0; i<10; i++) {
//			if(i%2 != 0) {
//				continue;
//			}
//			System.out.print(i + " ");
//			
//		}
		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j==3) {
//					break;
//				}
//				System.out.println(i + ", " + j);
//			}
//		}
		
//		for(int i=10; i>0; i-=2) {
//			System.out.println(i);
//		}
		
//		int i=10;
//		while(i>0) {
//			System.out.println(i);
//			i-=2;
//		}
		
		
		//1.> 레이블을 사용하여(out:) i=3, j=2일 때 
		//이중 for문을 한번에 탈출하는 코드를 완성하시오.
//		out:
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.println(i + ", " + j);
//				if(i==3 && j==2) {
//					break out;
//				}
//			}
//		}
	
//		//2.> 레이블 사용 x
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.println(i + ", " + j);
//				if(j==2) {
//					break;
//				}
//			}
//			if(i==3) {
//				break;
//			}
//		}
		
		//메뉴 선택
		Scanner sc = new Scanner(System.in);
		String msg= "1)빅맥\n2)타코\n3)백반\n원하는 메뉴를 선택하세요(종료:0)";
		int ans;
		while (true) {
			System.out.println(msg);
			ans = sc.nextInt();
			
			if (ans==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if (ans<=3) {
				System.out.println("선택하신 메뉴는 "+ ans +"번 입니다.");
				continue;
			}
			else {
				System.out.println("메뉴를 잘 못 선택하셨습니다.");
			}
		}
		
		
		
		
		
		
		
	}
}
