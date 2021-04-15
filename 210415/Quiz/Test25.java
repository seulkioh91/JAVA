import java.util.Scanner;

public class Test25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();
        System.out.print("정수 b:");
        int b = sc.nextInt();
        
        System.out.print("두 값의 차는" + Math.abs(a-b) +"입니다.");
        }
}

// import java.util.Scanner;

// public class Test25 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("정수 a:");
//         int a = sc.nextInt();
//         System.out.print("정수 b:");
//         int b = sc.nextInt();
//         int minus = (a>b) ? a-b : b-a;
//         System.out.println("두 값의 차는 " + minus +"입니다.");
//     }
// }

//삼항연산자

// public class Test25 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("정수 a:");
//         int a = sc.nextInt();
//         System.out.print("정수 b:");
//         int b = sc.nextInt();
        
//         if (a>b){
//         System.out.println("두 값의 차는 " + (a-b)+"입니다.");
//         }else{
//         System.out.println("두 값의 차는 " + (a+b)+"입니다.");
//         }
//     }
// }

