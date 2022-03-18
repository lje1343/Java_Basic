package am;

public class Exam2 {
    /*
    변수명 짓기
    1. 영문 대소문자와 한글도 사용할수는 있다 (한글 쓰지말자)
    2. 특수문자는 밑줄과 $만 사용할 수 있다.
    3. 숫자를 사용할수는 있지만 단 첫번째 글자로는 쓸 수 없다. a1 1a(x)
    4. 이미 예약어로 지정된 단어는 사용할 수 없다.
        영문 소문자로 시작, 한글은 쓰지말기
        영어 단어를 2개 이상 사용할때는 새로운 다운어 첫 글자는 대문자로
        myClass, minValue, bestLoc ...

    상수명 짓기
    final int MY_DATA;  상수명은 대문자 그리고 언더바 snake case

    변수의 생존 기간
    
    */
    public static void main(String[] args) {
        int value1 = 3;
        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
            // value2가 사라진다. 블록 안에서 선언을 했기 때문에...
        }
        System.out.println(value1);
        //System.out.println(value2);

        // 형변환

        float value5 = 1.2F;    // 실수형 float은 F를 붙여서 정의한다.
        double value6 = 1.5;    // 실수형 double이 기본 실수 자료형이다.

        double value7 = 5;      // 자동 형변환

        System.out.println(value7);

        int value8 = (int)5.3;       //  수동 형변환
        System.out.println(value8);
        long value2 = (long)10;

        // 작은 자료형이 큰 자료형에 담으면 개발자가 수동으로 형변환 해주어야 하지만 반대인 경우는 자바가 자동으로 형변환을 해준다.(업캐스팅)

        //Q2.
        // 자바에서 정수형 자료형들과 크 크기들을 순서대로
        System.out.println("byte < short < int < long");

        //Q3.
//0 main {
//1       int a = 3; (1, 7)
//2       {
//3           int b; (3, 5)
//4           b = 5; 
//5       }
//6       int c = 7; (6, 7)
//7       }

    }
}
