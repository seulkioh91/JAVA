// import java.io.FileOutputStream;        //파일생성
// import java.io.IOException;             //예외처리
// import java.io.FileWriter;
// import java.io.PrintWriter;
import java.io.*;   //정답은 아니다.

public class FileWrite {
    public static void main(String[] args) throws IOException {
        // FileOutputStream output = new FileOutputStream("out.txt");
        // FileWriter fw = new FileWriter("out.txt");
         PrintWriter pw = new PrintWriter("out.txt");


        for(int i=1; i<11; i++) {
            String data = i+"번째 줄입니다.\r\n";
            pw.write(data);
        }
        
        pw.close();

        PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
        for(int i=11; i<21; i++) {
            String data = i+"번째 줄입니다.\r\n";
            pw2.write(data);
        }
        
        pw2.close();
    }
    
}
