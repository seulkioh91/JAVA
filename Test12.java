import java.util.Scanner;
public class Test12 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 cm부터 :");
        int a = sc.nextInt();
        System.out.print("몇 cm까지 :");
        int b = sc.nextInt();
        System.out.print("몇 cm단위 :");
        int c = sc.nextInt();
        System.out.println("신장 표준체중");
        System.out.println("-------------------------");

        for (int i = a; i <= b; i = i + c ){
            System.out.println(i + " " + (i-100)*0.9);
        }
    }   
}