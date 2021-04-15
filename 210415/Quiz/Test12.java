import java.util.Scanner;
public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("반지름:"); //12.5
        double a = sc.nextDouble();
        final double pi = 3.141592; //상수형태에서는 파이널을 붙여서 불변을 시킨다.
        double bb = a*a;
        double bbb = a*a*a;

        System.out.println("겉넓이는 " + (4*pi*(bb)) + "입니다.");
        System.out.println("부피는 " + (4*pi*(bbb)/3) + "입니다.");
    }
}