import java.util.Scanner;


public class Test9 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇개를 표시할까요?: ");
        int x = sc.nextInt();

        for (int i = 0 ; i < x ; i++){
            System.out.print("*");
        }
        if (x>=1)
        System.out.println();
    }
}