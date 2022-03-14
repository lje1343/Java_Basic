package pm;

public class Exam7 {

	public static void main(String[] args) {
		/*
		 super 키워드 super() 메서드
		 
		 this 키워드와 this() 메서드는 클래스 내부의 특정 구성 요소 
		 (생성자, 객체)를 호출할때 사용했다.
		 생략하면 자동으로 추가해주기도 했다.
		 
		 이와 달리 super는 모두 부모 클래스와 관련이 있다. 
		 따라서 상속 관계에서만 사용한다.
		 
		*/
		
//		H h = new H();
//		h.abc();
//		System.out.println();
//		
//		J j = new J();
//		j.bcd();
		
		H j = new J();
		//j.bcd();	// 사람은 항상 학생이 될 수 없다.
		j.abc();
	}

}

class H {
	void abc() {
		System.out.println("H클래스의 abc()");
	}
}

class J extends H{
	void abc() {
		System.out.println("J클래스의 abc()");
	}
	void bcd() {
		abc();
		//super.abc();
	}
}
