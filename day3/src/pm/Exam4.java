package pm;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();

		//1>
//		switch(num) {
//		case 0:
//			System.out.println("입력하신 숫자는 0 입니다."); break;
//		default:
//			System.out.println("입력하신 숫자는 0이 아닙니다.");break;
//		} 

		//2>
//		for(;;) {
//			if (num==0) {
//				System.out.println("입력하신 숫자는 0 입니다."); break;
//			} else {
//				System.out.println("입력하신 숫자는 0이 아닙니다."); continue;
//			}
//			
//		}
		
		//3>
//		String res = (num==0) ? "입력하신 숫자는 0입니다." : "입력하신 숫자는 0이 아닙니다.";
//		System.out.println(res);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.");
		int score = sc.nextInt();
		String res = "";
		int x = score/10;
		
		switch(x) {
		case 10:
		case 9:
			res+="A";break;
		case 8:
			res+="B";break;
		case 7:
			res+="C";break;
		case 6:
			res+="D";break;
		default:
			res+="F";
		}
		
		if (res!="F") {
			int y = score%10;
			res+= (y>=7 || (x==10 && y==0)) ? "+" : (y>=4) ? "-" : "";
		}
		System.out.println("당신의 점수는" + score + "이고 학점은 " + res + "입니다.");
		
		
		
		
	}
}
