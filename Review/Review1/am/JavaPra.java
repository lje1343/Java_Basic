package am;

public class JavaPra {
    public static void main(String[] args) {
        int enter = 0; // 줄바꿈
        int cnt = 0; // 짝 카운트

        for(int i = 1; i < 101; i++){
            enter++;

            // 십의자리/일의자리를 각각 계산후 카운트를 세준다.
            if(i/10==3 || i/10==6 || i/10==9){
                cnt++;
            }
            if(i%10==3 || i%10==6 || i%10==9){
                cnt++;
            }

            // 카운트의 숫자에 맞게 찍어준다.
            if(cnt==0){ 
                System.out.print(i + "\t");
            } else if(cnt==1){
                System.out.print("짝" + "\t");
            } else{
                System.out.print("짝짝" + "\t");
            }

            if(enter == 10){    // 줄바꿈 및 초기화
                System.out.println();
                enter = 0;
            }

            cnt = 0;

        }
    }
    
}
