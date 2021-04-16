import java.util.Scanner;
public class Test20 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2이상의 정수값:");
          int a = sc.nextInt();
        int i;
        for (i =2; i<a ; i++){
            if(a % i == 0)
            break;
        }
        if(i==a)
        System.out.print("소수입니다");
        else
        System.out.print("소수가 아닙니다.");
    }
}