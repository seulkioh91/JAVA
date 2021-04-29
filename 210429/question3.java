import java.util.*;

public class question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 x까지의 합을 구하세요");
        System.out.print("x의 값 :"); int x = sc.nextInt();
        System.out.print("1부터 " +x+"의 합은"+sumUp(x)+"입니다");

    }

    static int sumUp(int n){
        int sum = 0;
        for(int i = 1; i<=n; i++)
        sum+=i;
        return sum;
    }

}
