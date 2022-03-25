package am;

public class Exam3 {
	
	public static void main(String[] args) {
		D d = new D();
		d.print();
		d.print(3);
		d.print(5.8);
		d.print("안녕");
		
		F f = new F();
		int[] a = {1,2,3,4};
		int res = f.arraySum(a);
		System.out.println(res);
		
		//System.out.println(f.arraySum({1,2,3})); 자료형을 명확하게 해주자
		System.out.println(f.arraySum(new int[] {1,2,3}));
		 
	}

}

// 1번
class D{
	void print(){
		System.out.println("입력값이 없습니다.");
	}
	void print(int a){
		System.out.println("정수 입력값 : " + a);
	}
	void print(double b){
		System.out.println("실수 입력값: " + b);
	}
	void print(String s){
		System.out.println("문자열 입력값: " + s);
	}
	
}

// 2번
class F{
	
	int arraySum(int[] a) {
		int sum=0;
		for(int i =0; i< a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
}
