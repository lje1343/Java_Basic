package pm;

public class AccessObj {
    public int p = 3;       // 모두 접근 가능
    protected int p2 = 4;   // 같은 패키지인 경우만 접근 허용 / 상속을 받은 패키지 허용
    int k = 2;              // default, 같은 패키지에서만 접근 허용
    private int i = 1;      // 자기 자신 클래스에서만 접근 허용
    
    
}
