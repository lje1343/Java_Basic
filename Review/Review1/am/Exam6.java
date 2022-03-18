package am;

public class Exam6 {
    public static void main(String[] args) {

        // for(int i = 0; i < 11; i++){
        //     if(i%2==0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }   
        
        // for(;;){
        //     System.out.println("Hello World");
        // }

        // while(true){
        //     System.out.println("Hello World");
        // }

        // int i = 0;
        // while(true){
        //     if(i==10){
        //         break;
        //     }
        //     System.out.println("Hello World");
        //     i++;
        // }
        
        // int i = 0;
        // do{
        //     System.out.println("Hello World");
        //     i++;
        // } while(i<=10);

        //Q.
        // int enter = 0; // 줄바꿈
        // int cnt = 0; // 짝 카운트

        // for(int i = 1; i < 101; i++){
        //     enter++;

        //     // 십의자리/일의자리를 각각 계산후 카운트를 세준다.
        //     if(i/10==3 || i/10==6 || i/10==9){
        //         cnt++;
        //     }
        //     if(i%10==3 || i%10==6 || i%10==9){
        //         cnt++;
        //     }

        //     // 카운트의 숫자에 맞게 찍어준다.
        //     if(cnt==0){ 
        //         System.out.print(i + "\t");
        //     } else if(cnt==1){
        //         System.out.print("짝" + "\t");
        //     } else{
        //         System.out.print("짝짝" + "\t");
        //     }

        //     if(enter == 10){    // 줄바꿈 및 초기화
        //         System.out.println();
        //         enter = 0;
        //     }

        //     cnt = 0;

        // }

        //Q. 강사님 (버그있음)
        // for (int i = 1 ; i <= 100 ; i++) {

        //     int cnt = 0; //'짝'의 갯수
        //     int x = i/10;// 12 -> 1
        //     int y = i%10;// 12 -> 2
    
        //     if (x % 3 == 0)
        //         cnt++;
        //     if (y % 3 == 0) 
        //         cnt++;
    
    
    
        //     if (i % 10 == 0) {
        //         if(cnt ==2)
        //             System.out.println("짝짝");
        //         else if (cnt == 1)
        //             System.out.println("짝");
        //         else 
        //             System.out.println(i);
    
        //     } else {
        //         if(cnt ==2)
        //         System.out.print("짝짝\t");
        //     else if (cnt == 1)
        //         System.out.print("짝\t");
        //     else 
        //         System.out.print(i +"\t");
        //     }
        // }
    



    }
    
}
