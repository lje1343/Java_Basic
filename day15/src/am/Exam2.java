package am;

public class Exam2 {
	/*
	 클래스 내부에서 메서드 호출
	 클래스의 내부에 있는 메서드끼리는 객체를 생성하지 않고 서로를 호출하여 사용할 수 있다.
	 단, 메서드 앞에 static이 붙은 메서드는 static 붙은 필드나 메서드만 호출할 수 있다.
	 
	 메서드 오버로딩
	 메서드의 이름이 동일할 때 입력되는 매개변수의 개수 또는 자료형에 따라 각각 다른 메서드가
	 실행된다.
	 
	 생성자
	 객체를 생성, 1. 반드시 클래스명과 동일해야 한다. 2. 리턴이 없다.
	 개발자가 클래스에 생성자를 만들지 않으면 자동으로 컴파일시에 자바가 기본 생성자를 만들어 준다.
	 따라서 모든 클래스에는 1개 이상의 생성자가 반드시 존재 하게 된다.
	 
	 
	 */
	public static void main(String[] args) {
		print();
		
		int a = twice(3);
		System.out.println(a);
		
	}
	
	
	public static void print() {
		System.out.println("안녕");
	}
	
	public static int twice(int a) {
		return a*2;
	}
	

}

class C{
	C(){
		System.out.println("첫번째 생성자");
	}
	C(int a){
		this();
		System.out.println("두번째 생성자");
	}
//	void abc() {	// 메서드에서는 this를 사용할 수 없다.
//		this();
//	}
}

