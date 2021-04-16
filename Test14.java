import java.util.Scanner;
public class Test14 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정숫값: ");
        int a = sc.nextInt();
        for (int i = 1; i <=a ; i++){
            System.out.print(i + " 의 제곱은 "+ (i * i)+"입니다.");
        }
    }
}
