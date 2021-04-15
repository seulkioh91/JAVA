import java.util.Scanner;
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("밑변:");
        double a = sc.nextDouble();
        System.out.print("높이:");
        double b = sc.nextDouble();

        System.out.println("넓이는 " + (a*b)/2 + "입니다.");
    }
}