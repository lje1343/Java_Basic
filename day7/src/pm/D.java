package pm;

import am.A;

public class D extends A{	// D클래스는 A클래스의 자식(extends 상속)
	
	public void print() {
		System.out.println(a);	// 자식 클래스는 다른 패키지에 있어도  객체의
		System.out.println(b);	// 생성 없이 protected 접근 지정자까지 접근 가능하다.
		System.out.println(c);
		System.out.println(d);
	}

}
