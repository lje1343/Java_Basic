package pm;

public class Exam7 {
	public static void main(String[] args) {
		//Q1.> 1~1000사이의 3의배수의 합을 구하시오.
//		int sum=0;
//		for(int i = 1; i <=1000;i++) {
//			if (i%3==0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
//		for(int i = 1; i<=5; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		//Q2.> 거꾸로
//		for(int i=1;i<5;i++) {
//			for(int j=4;j>0;j--) {
//				if(i<j) {
//				System.out.print(" ");
//			} else {
//				System.out.print("*");
//			}
//		}
//			System.out.println();
//		}
		
		//Q3.> 정삼각형
//		for(int i=1; i<=5; i++) {
//			for(int j=5; j>i; j--) {
//				System.out.print(" ");
//			}
//			for(int x=0; x<i+i-1; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		//Q4.>
		int[] score = {70, 60, 55, 75, 95, 90, 80, 85, 100};
		int min = score[0];
		int max = 0;
		int sum = 0;
		
		for (int i: score) {
			sum+=i;
			if (min>i) {
				min=i;
			}
			else if (max<i) {
				max=i;
			}
		}
		
		System.out.println("최저점수 : " + min + "\n최고점수 : " + max + "\n합계 : " + sum + "\n평균: " + (double)sum/9);
		
		
		
	}
}
