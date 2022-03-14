package pm;

public class Exam42 {

	public static void main(String[] args) {
		/* 객체의 다형적 표현 	*/
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		
		//B b1 = new A();	// 에러
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
		//C c1 = new A();
		//C c2 = new B();
		C c3 = new C();
		//C c4 = new D();

		//D d1 = new A();
		//D d2 = new B();
		//D d3 = new C();
		D d4 = new D();
		
	}

}

class A {}	//할아버지
class B extends A{}	//아빠
class C extends B{}	//자식 C와 D는 같은 레벨
class D extends B{}	//자식