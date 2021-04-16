import java.util.Scanner;
public class Test16 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정방형을 표시합니다.");
        System.out.println("단수는:");
          int a = sc.nextInt();

        for (int i = 0 ; i < a ; i++){
            for (int j = 0 ; j < a ; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    
