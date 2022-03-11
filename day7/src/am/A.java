package am;

public class A {

//	public int m = 3;
//	public int n = 4;
//	public void print() {
//		System.out.println("임포트");
//	}
//	
//	public static void main(String[] args) {	// main 메서드
//		B b = new B();
//		b.print();
//	}

	public int a = 1;
	protected int b = 2;
			  int c = 3;	// default(선언이 없으면)
	private int d = 4;
	
	public void print() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println();
	}

}

//class B{	// 외부 클래스B는 public 선언이 불가능하다.
//	int m = 3;
//	int n = 4;
//	
//	void print() {
//		System.out.println(m + " " + n);
//	}
//}
