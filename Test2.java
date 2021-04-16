import java.util.Scanner;
import java.util.Random;

public class Test2 {
    public static void  main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int n;
        int m = 10 + random.nextInt(90); // 10이상 99미만으로 맞춰야 할 숫자 생성
        System.out.println("숫자 맞추기 게임 시작");
        do{
            System.out.println("어떤 숫자일까? : ");
            n = sc.nextInt();
            if (n>m){
                System.out.println("더 작은 숫자입니다.");
            }else{
                System.out.println("더 큰 숫자입니다.");
            }

        } while (n!=m);
    System.out.println("정답입니다.");
    }
}