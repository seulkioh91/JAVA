import java.util.Scanner;
public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값:");
        int x = sc.nextInt();
        int last = x/10;
        int last1 = x%10;
        System.out.println("마지막 자릿수를 제외한 값은 " + last + "입니다.");
        System.out.println("마지막 자릿수는 " + last1 + "입니다.");
    }
}