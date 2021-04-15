import java.util.Scanner;

public class Test18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값:");
        int x = sc.nextInt();
        if (x < 0){
            System.out.println("절대값은 "+(-x) + "입니다.");
        }else{
            System.out.println("절대값은 "+ x + "입니다.");
            }
        }

    }
