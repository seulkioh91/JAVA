import java.util.*;

class question5 {
    //2개중 최소값 찾기 매서드  (매서드 오버로딩)
    public static int min(int a, int b) {
      return a < b ? a : b;
    }
    public static int max(int a, int b) {
     return a > b ? a : b;
    }
    public static int min(int a, int b, int c) {
     int min = a;
     if(b<a) min=b;
     if(c<min) min=c;
     return min;
    }
    public static int max(int a, int b, int c) {
     int max = a;
     if(b>max) max=b;
     if(c>max) max=c;
     return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("x값"); int x = sc.nextInt();
        System.out.print("y값"); int y = sc.nextInt();
        System.out.print("z값"); int z = sc.nextInt();

        System.out.print("x,y의 최소값은 "+ min(x,y)  + "입니다");
        System.out.print("x,y의 최대값은 "+ max(x,y)  + "입니다");
        System.out.print("x,y,z의 최소값은 "+ min(x,y,z)  + "입니다");
        System.out.print("x,y,z의 최대값은 "+ max(x,y,z)  + "입니다");
    }
}

 
