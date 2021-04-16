// import java.util.Scanner;
// public class Test17 {
//     public static void  main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다..");
//         System.out.println("단수는:");
//           int a = sc.nextInt();

//         for (int i = 1 ; i <= a ; i++){
//             for (int j = 1 ; j <= i ; j ++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.Scanner;
// public class Test17 {
//     public static void  main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다.");
//         System.out.println("단수는:");
//           int a = sc.nextInt();

//         for (int i = 1 ; i <= a ; i++){
//             for (int j = a ; j >=i ; j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;
public class Test17 {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다.");
        System.out.println("단수는:");
          int a = sc.nextInt();
        
        for (int k = 1; k <= a; k++){ //줄바꿈
        for (int i = 1 ; i <= k-1; i++){ // 빈칸
            System.out.print(" ");
        }
        for (int j = 1 ; j <= a-k+1; j ++){ //별
            System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
