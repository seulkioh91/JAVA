import java.util.Scanner;


public class Test8 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정숫값:");
        int x = sc.nextInt();
        int y = 1;
        int i = 1;

        while (i <= x){
            y = y * i;
            i ++;
        }

        System.out.print("1부터 " + x + "까지의 곱은 " + y +"입니다.");
    }
}