package pm;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		//Q3>
		//1.
//		int mon = 3;
//		
//		switch(mon){
//		case 3: case 4: case 5:
//			System.out.println("봄입니다."); break;
//		case 6: case 7: case 8:
//			System.out.println("여름입니다."); break;
//		case 9: case 10: case 11:
//			System.out.println("가을입니다."); break;
//		default:
//			System.out.println("겨울입니다."); break;
//
//		}
		
		//2.
//		int mon = 3;
//		switch(mon/3) {
//		case 1 : 
//			System.out.println("봄입니다."); break;
//		case 2 : 
//			System.out.println("여름입니다."); break;
//		case 3 : 
//			System.out.println("가을입니다."); break;
//		default :
//			System.out.println("겨울입니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		switch(mon) {
		case 1:
			System.out.println("Jan");
		case 2:
			System.out.println("Feb");
		case 3:
			System.out.println("Mar");
		case 4:
			System.out.println("Apr");
		case 5:
			System.out.println("May");
		case 6:
			System.out.println("Jun");
		case 7:
			System.out.println("Jul");
		case 8:
			System.out.println("Aug");
		case 9:
			System.out.println("Sep");
		case 10:
			System.out.println("Oct");
		case 11:
			System.out.println("Now");
		case 12:
			System.out.println("Dec");
		}
		


	}

}
