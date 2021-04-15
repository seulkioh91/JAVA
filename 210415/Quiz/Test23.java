import java.util.Scanner;

public class Test23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값:");
        int a = sc.nextInt();
        if (a<0){
         System.out.println("음의 정수값을 입력했습니다.");
        }else if (a%10==0) {
            System.out.println("a는 10의 배수입니다.");
        }else {
            System.out.println("a는 10의 배수가 아닙니다.");
            }
        }
}
