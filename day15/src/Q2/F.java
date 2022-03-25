package Q2;

public class F {
	int a = 2;
	static int b = 3;
	
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	
	static void bcd() {
		//System.out.println(a);  // static메서드는 static 변수만 올 수 있다.
		System.out.println(b);
	}
	

}
