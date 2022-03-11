package pm;

public class Exam41 {

	public static void main(String[] args) {

		C c = new C();
		
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);
	
	}
}

//1.>
//class C{
//	int sum;
//	int cnt;
//	void averageScore(int...args){
//		
//		for(int each: args) {
//			sum+=each;
//			cnt++;
//		}
//		System.out.println("평균값은 : " + (double)sum/cnt + "입니다.");
//	}

//2.>
class C{
	void averageScore(int...args){
		double sum = 0;
		
		for(int each: args) {
			sum+=each;
		}
		double avg = sum/args.length;
		System.out.println("평균값은 : " + avg+ "입니다.");
	}
	
}
