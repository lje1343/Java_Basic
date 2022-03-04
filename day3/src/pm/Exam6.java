package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		
		//Q5 1.>
//		Scanner sc = new Scanner(System.in);
//		String res = "";
//		boolean b = true;
//		do{
//			
//			System.out.println("세자리의 정수를 입력하시오");
//			int num = sc.nextInt();
//			res = (num>=100 && num<=999) ? "입력한 값은" +num+ "입니다." : "다시 입력하세요";
//			System.out.println(res);
//			b = (res=="다시 입력하세요") ? true : false;
//
//		}while(b);
		
		//2.>
//		Scanner sc = new Scanner(System.in);
//		int a;
//		do {
//			System.out.println("세자리 정수 입력>>>");
//			a = sc.nextInt();
//		}while(a<100 || a>999);
//		System.out.println("입력한 값은 " + a + " 입니다.");
		
		//Q6
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int com = 10 + rand.nextInt(90);
		int ans = 0;
		
		System.out.println("10부터 99 사이의 숫자를 맞춰보세요.\n어떤 숫자일까요?");
		do {
			ans = sc.nextInt();
			
			if(ans<com) {
				System.out.println("더 큰 숫자입니다.");
			} else if(ans>com){
				System.out.println("더 작은 숫자입니다.");
			}
			
		} while(ans!=com);
		System.out.println("정답입니다.");
		

	}

}
