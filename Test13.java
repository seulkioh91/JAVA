import java.util.Scanner;
public class Test13 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정숫값: ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 1 ; i <=a ; i++){
        if (a % i ==0){
            System.out.print(i + " ");
            count ++ ;
        }
    }
        System.out.println("\n의 약수는" + count + "개입니다." );

    }
}