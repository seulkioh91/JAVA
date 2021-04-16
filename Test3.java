import java.util.Scanner;


public class Test3 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 A :");
        int a = sc.nextInt();

        System.out.println("정수 B :");
        int b = sc.nextInt();

    if (a>b){
        int t = a;
        a = b;
        b = t;
    }
    do {
        System.out.print(a + " ");
        a += 1;

    }while (a<=b);
}
}

