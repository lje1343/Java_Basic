package pm;

public interface Calculator {
	
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	default int exec(int i, int j) { 
		//default를 붙이면 인터페이스도 구현한 메서드를 가질 수 있다.
		return i + j;
	}
	
	public static int exec2(int i, int j) {
		return i * j;
	}

}
