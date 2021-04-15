import java.util.Scanner;

public class Test21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수:");
        int a = sc.nextInt();
        
        if (a > 0) {
            System.out.println("값이 양수입니다.");
        }else if (a < 0){
            System.out.println("값이 음수입니다.");
        }else {
            System.out.println("정수값이 0 입니다.");
            }
        }
}
