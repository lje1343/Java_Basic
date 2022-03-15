package pm;

public class MyCalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		int j = cal.plus(3, 4);
		int i = cal.exec(5, 6);	//default 메서드
		System.out.println(i);
		System.out.println(j);
		
		Calculator.exec2(3,4); // static 메서드 -> 인터페이스명.메서드명();

	}

}
