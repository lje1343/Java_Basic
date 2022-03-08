package pm;

public class Exam6 {

	public static void main(String[] args) {
		//1.>
//		int[] arr = new int[] {1,2,3,4,5};
//		
//		for(int each: arr) {
//			System.out.println(each);
//		}
		
		//2.>
//		int[][] b = new int[][] {{1,3,5},{7,9}};
		
		// for each문
//		for(int[] each: b) {
//			for(int i:each) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		// for문
//		for(int i=0; i<b.length; i++) {
//			for(int j=0; j<b[i].length;j++) {
//				System.out.print(b[i][j]);
//			}
//			System.out.println();
//		}
		
		//3.>
		String str = "내 이름은 [홍길동] 입니다. 나이는 [15]살입니다.";
		int name = str.indexOf('[')+1;
		
		int age = str.lastIndexOf('[')+1;
		
		String rname = str.substring(name,name+3);
		String rage = str.substring(age,age+2);
		
		System.out.println(rname);
		System.out.println(rage);

	}

}
