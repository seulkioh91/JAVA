import java.util.Scanner;


public class Test6 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇개의 *을 출력할까요?");
        int x = sc.nextInt();
        int i = 0;
        while (i < x) {
            if (i%2 == 0)
            System.out.print("*");
            else
            System.out.print("+");

            i++;
        }
        if (x>=1)
            System.out.println();
    }
}