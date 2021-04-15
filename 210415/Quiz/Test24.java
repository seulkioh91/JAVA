import java.util.Scanner;

public class Test24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값:");
        int a = sc.nextInt();
        if (a >100) {
         System.out.println("잘못된 점수입니다.");
        }else if (a>=90) {
            System.out.println("수");
        }else if (a>=80) {
            System.out.println("우");
        }else if (a>=70) {
            System.out.println("미");
        }else if (a>=60) {
            System.out.println("양");
        }else {
            System.out.println("가");
            }
        }
}
