import java.util.Scanner;
public class Test15 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계절을 찾습니다.");
          int a = 0;
          int b = 0;
        do {
        do {
          System.out.print("몇 월입니까?: ");
          a = sc.nextInt();
        } while (a < 1 || a >= 13);
    
        if (a >= 3 && a <= 5) {
                System.out.print("봄 입니다. ");
        }
        else if (a >= 6 && a <= 8) {
                System.out.print("여름 입니다. ");
        }
        else if (a >= 9 && a <= 11) {
                System.out.print("가을 입니다. ");
        }
        else {
                System.out.print("겨울 입니다. ");
        }
        System.out.print("다시 하겠습니까? 1...Yes/0...No : ");      
        b = sc.nextInt();
        }while(b == 1);
    }
}

    
