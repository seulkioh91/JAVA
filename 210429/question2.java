import java.util.*;

    public class question2 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("정수 a:");int a = sc.nextInt();
            System.out.print("정수 b:");int b = sc.nextInt();
            System.out.print("정수 c:");int c = sc.nextInt();
            
            System.out.println("중간값은"+mid(a,b,c)+"입니다");
            }
            static int mid(int a, int b, int c){
                if (a>=b)
                    if(b>=c)
                        return b;
                    else if (a<=c)
                        return a;
                    else
                        return c;
                else if (a>c)
                    return a;
                else if (b>c)
                    return c;
                else
                    return b;
            }
          }
        
          