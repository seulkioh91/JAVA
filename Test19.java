import java.util.Scanner;
public class Test19 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("피라미드를 표시합니다.");
        System.out.println("단수는:");
          int a = sc.nextInt();
        
        for (int k = 1; k <= a; k++){ //줄바꿈
            for (int i = a-1 ; i>=k ; i--){ // 빈칸
            System.out.print(" ");
        }
        for (int j = 1 ; j <= 2*k-1; j ++){ //별
            System.out.print(k%10); 
            }
            System.out.println();
        }
    }
}