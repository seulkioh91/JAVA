import java.util.Scanner;

public class Test28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
   
        if (a<b){
            int t = a;
            a = b;
            b = t;
        
        System.out.println("a>=b가 되도록 정렬했습니다.");
        System.out.println("변수a는 " + a + "입니다.");
        System.out.println("변수b는 " + b + "입니다.");
        }
    }
}