import java.util.Scanner;


public class Test10 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다. n의 값 : ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i ++){
           sum = sum + i;
        }
            System.out.print("1부터 "+ n + "까지의 합은 " + sum+ "입니다.");
    }
}