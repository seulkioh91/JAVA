import java.util.Scanner;


public class Test11 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다. \nn의 값 : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i ++){
           sum = sum + i;
           System.out.print(i+"+");
        }
            System.out.print(n + " = " + (sum + n));
    }
}