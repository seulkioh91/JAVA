import java.util.Scanner;

public class Test1 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;
do {
    System.out.print("정수값:   ");
    int x = sc.nextInt();

        if (x < 0){
            System.out.println("이 값은 음수입니다.");
        }else if (x==0) {
            System.out.println("이 값은 0입니다.");
        }else{
            System.out.println("이 값은 양수입니다.");
    }
    System.out.print("다시 한번? 1-Yes / 0-No:");
    retry = sc.nextInt();
} while (retry==1);
}
}
