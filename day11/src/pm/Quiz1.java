package pm;

// 1.>
//class OverException extends Exception{
//
//}
//
//class MinusException extends Exception{
//
//}

class OverException extends Exception{
	public OverException(String message) {
		super(message);
	}
}

class MinusException extends Exception{
	public MinusException(String message) {
		super(message);
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		// 사용자 예외 클래스를 정의하여 예외를 발생시키시오.
		//1.>
//		AA aa = new AA();
//		aa.checkScore(85);
//		aa.checkScore(110);
//		aa.checkScore(-1);
		
		AA aa = new AA();
		
		try {
			aa.checkScore(85);
			aa.checkScore(110);
		} catch(OverException | MinusException e) {
			System.out.println(e.getMessage());
		}
	
	}

}

// 1.>
//class AA{
//	void checkScore(int num) {
//		try {
//			if(num <= 100 && num >= 0) {
//				System.out.println("정상적인 값입니다.");
//			} else if(num>100){
//				throw new OverException();
//			} else if(num<0) {
//				throw new MinusException();
//			}
//		} catch(OverException e) {
//			System.out.println("예외 발생 : 100점 초과");
//		} catch(MinusException e) {
//			System.out.println("예외 발생 : 음수 값 입력");
//		}
//	}
//	
//}

class AA{
	void checkScore(int score) throws MinusException, OverException{
		if(score < 0) {
			throw new MinusException("예외 발생 : 음수값 입력");
		} else if (score > 100) {
			throw new OverException("예외 발생 : 100점 초과");
		} else {
			System.out.println("정상적인 값입니다.");
		}
	}
}
