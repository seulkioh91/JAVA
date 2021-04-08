// 1부터 100까지 홀수만 출력 
import java.io.*;   //정답은 아니다.

public class odd {
    public static void main(String[] args) throws IOException {
        PrintWriter odd = new PrintWriter("odd.txt");
        for(int i=1; i<=100; i++) {
            if (i % 2 == 1) 
            odd.println(i);
        }
        
        odd.close();
    
    }
}

