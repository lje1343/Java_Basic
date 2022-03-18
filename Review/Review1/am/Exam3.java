package am;

public class Exam3 {
    /*
    연산자

    */
    public static void main(String[] args) {
        int a1 = 3;
        ++a1;    // 전위형
        System.out.println(a1);

        int b = 3;
        b++;    // 후위형
        System.out.println(b);

        //Q.
        int a = 5;
        if(a%2==0){
            System.out.println("a는 짝수입니다.");
        } else{
            System.out.println("a는 홀수입니다.");
        }

        //Q.
        int d = 9;
        if(d%3==0){
            System.out.println(d+"는 3의 배수입니다.");
        } else{
            System.out.println(d+"는 3의 배수가 아닙니다.");
        }

        //Q.
        int q = 5;
        int w = 2;
        int e = 5;

        System.out.println(q==w);
        System.out.println(q==e);

        String str1 = new String("안녕");
        String str2 = new String("안녕");

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2));  //true









    }
}
