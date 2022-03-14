package pm;

public class Exam62 {

	public static void main(String[] args) {
		/*
		 메서드 오버로딩 method overroading
		 
		 */
		P p = new P();
		p.print1();
		p.print2();
		System.out.println();
		
		O o = new O();
		o.print1();
		o.print2();
		o.print2(3);
		System.out.println();
		
		P po = new O();
		po.print1();
		po.print2();
		//po.print2(3);
		

	}

}

class P{
	void print1() {
		System.out.println("P 클래스 print 1 ");
	}
	void print2() {
		System.out.println("P 클래스 print 2 ");
	}
}

class O extends P{
	@Override	// @ 어노테이션은 컴퓨터도 읽는 주석
	void print1() {			// 메서드 오버라이딩
		System.out.println("O 클래스 print 1 ");
	}
	void print2(int a) {	// 메서드 오버로딩
		System.out.println("O 클래스 print 2 ");
	}
}