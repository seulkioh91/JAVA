import java.util.Scanner;

public class Test27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int mid = 0;
    
        System.out.print("정수 a : ");
        int a = sc.nextInt();
        System.out.print("정수 b : ");
        int b = sc.nextInt();
        System.out.print("정수 c : ");
        int c = sc.nextInt();
    
        if ((b > a && c < a) || (b < a && c> a))
          mid = a; // b > a > c         c > a > b
        else if ((a > b && c < b) || (a < b && c> b))
          mid = b;
        else 
          mid = c;
    
        System.out.println("중앙값은 " + mid +"입니다. ");
    }
}
