import java.util.Scanner;


public class Test7 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정숫값의 자릿수를 표시합니다.");
        System.out.println("양의 정숫값:");
        int x = sc.nextInt();
        int y =0;

        while (x>0){
            y++;
            x = x / 10 ; //125.4    125.5   1.2     end
        }

        System.out.print("입력한 숫자는 " + y + "입니다.");
    }
}