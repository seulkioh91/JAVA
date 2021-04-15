import java.util.Random;
import java.util.Scanner;

public class Test14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값:");
        int x = sc.nextInt();
        Random random = new Random();
        System.out.println("입력값의 +- 5의 범위의 난수를 생성했습니다..");
        System.out.println("값은"+ (x-5 + random.nextInt(11)) + "입니다.");
}
}