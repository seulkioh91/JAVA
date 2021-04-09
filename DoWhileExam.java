import java.util.Scanner;
public class DoWhileExam {
    public static void main(String[] args){
        int value = 0;
        Scanner sc = new Scanner(System.in);

        do{
            value = sc.nextInt();
            System.out.println("입력받은 값:" + value);
        }while(value != 10);
        System.out.println("반복문 종료!!");
    }
}
