import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값:");
        int x = sc.nextInt();
        int sum = x+10;
        int minus = x-10;
        System.out.println("10을 더한 값은"+sum+ "입니다.");
        System.out.println("10을 뺀값은"+minus+ "입니다.");
    }
}