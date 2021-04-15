import java.util.Scanner;

public class Test26 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
        System.out.print("정수 c:");
        int c = sc.nextInt();

        int min = a;

        if (b<min) min = b;
        if (c<min) min = c;

        System.out.print("최소값은" + min + "입니다.");
        }
}