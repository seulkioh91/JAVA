import java.util.Scanner;
public class Test21 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 더합니다. ");
        System.out.println("몇 개를 더할까요?:");
          int n = sc.nextInt();
          int i ;
          int sum=0;

          for (i=0; i < n; i++){
              System.out.println("정수(0으로 종료):");
              int t = sc.nextInt();
              if(t == 0) break;
              sum = sum + t;
            }

          System.out.println("합계는 "+ sum +"입니다.");
          System.out.println("평균은 "+ sum/i +"입니다.");
}
}
