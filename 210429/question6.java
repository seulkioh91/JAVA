import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("난수를 생성합니다 "); 
        System.out.print("하한값:"); int a = sc.nextInt();
        System.out.print("상한값:"); int b = sc.nextInt();
        System.out.print("생성한 난수는 " + random(a,b)+ "입니다.");
    }
    static int random(int a, int b){
        if (b <= a) {
          return a;
        }else{
          Random rand = new Random();
          return a + rand.nextInt(b-a+1);
        }
    
      }
    
}