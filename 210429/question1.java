// import java.util.*;

// public class question1 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("정수 a:");
//         int a = sc.nextInt();
//         System.out.print("정수 b:");
//         int b = sc.nextInt();
//         System.out.print("정수 c:");
//         int c = sc.nextInt();
        
//         int d = min(a,b,c);
//         System.out.println("최소값은"+d+"입니다");
//         }
//         static int min (int a, int b, int c){
//           if(a<b && a<c){
//             return a;
//           }else if (b<a && b<c){
//             return b;
//           }else{
//             return c;
//         }
//       }
//     }


    import java.util.*;

    public class question1 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("정수 a:");int a = sc.nextInt();
            System.out.print("정수 b:");int b = sc.nextInt();
            System.out.print("정수 c:");int c = sc.nextInt();
            
            System.out.println("최소값은"+min(a,b,c)+"입니다");
            }
            static int min (int a, int b, int c){
              int min = a;
              if(b<min) min = b;
              if(c<min) min = c;
              return min;
            }
          }
          
  