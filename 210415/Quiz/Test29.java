import java.util.Scanner;

public class Test29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
        System.out.print("정수 c:");
        int c = sc.nextInt();

        if (a>b){ //a가 젤 큰거
            int t = a; 
            a = b;
            b = t; 
        }
        if (b>c){
            int t = b;
            b = c;
            c = t;
        }
        if (a>b){
            int t = a; 
            a = b;
            b = t; 
        }
        
        System.out.println("a>=b>=c가 되도록 정렬했습니다.");
        System.out.println("변수a는 " + a + "입니다.");
        System.out.println("변수b는 " + b + "입니다.");
        System.out.println("변수b는 " + c + "입니다.");

    }
}