package abs;

//interface는 다중상속이 가능하지만 일반클래스는 단일상속만 가능하다.
//interface PredatorBarkable extends Predator, Barkable{
//	
//}

//추상 메소드는 abstract를 붙이고, default를 쓰지 않는다.
abstract class Predator extends Animal{
	abstract String getFood();	
	
	void printFood() {	// 오버라이딩 가능
		System.out.printf("my food is %s\n", getFood());
	}
	
	static int LEG_COUNT = 4;
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

interface Barkable{
	void bark();
}

class Animal{
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Predator implements Barkable{
	public String getFood() {
		return "apple";
	}

	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Predator implements Barkable{
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}

//class Crocodile extends Animal implements Predator, Barkable{
//	public String getFood() {
//		return "strawberry";
//	}
//
//}
//
//class Leopard extends Animal implements Predator, Barkable{
//	public String getFood() {
//		return "orange";
//	}
//
//}

class ZooKeeper{
	void feed(Predator predator) {
		System.out.println("feed " + predator.getFood());
	}
//	void feed(Predator tiger) {
//		System.out.println("feed apple");
//	}
//	
//	void feed(Predator lion) {
//		System.out.println("feed banana");
//	}
//	
//	public void feed(Predator crocodile) {
//        System.out.println("feed strawberry");
//    }
//
//    public void feed(Predator leopard) {
//        System.out.println("feed orange");
//    }
}

// instanceof 는 어떤 객체가 특정 클래스의 객체인지를 조사할 때 
// 사용되는 자바의 내장 명령어이다.
class Bouncer{
		void barkAnimal(Barkable animal) {
			animal.bark();
		}
//		if(animal instanceof Tiger) { 
//			System.out.println("어흥");
//		} else if(animal instanceof Lion) {
//			System.out.println("으르렁");
//		}
}

public class Sample {
	public static void main(String[] args) {
		
//		ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();	// Tiger 클래스로 생성한 인스턴스니?
        Lion lion = new Lion();
//      zooKeeper.feed(tiger);  // 메서드 오버로딩
//      zooKeeper.feed(lion);
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
		
	}

}
