import java.util.*;

public class question2 {
    public static void main(String[] args){
        
    Scanner sc = new Scanner(System.in);

    int[][] a = new int [4][3];
    int[][] b = new int [3][4];
    int[][] c = new int [4][4];

    System.out.println("행렬 a의 요소");

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
            System.out.print("a["+i+"]["+j+"]");
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println("행렬 b의 요소");

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            System.out.print("b["+i+"]["+j+"]");
            b[i][j] = sc.nextInt();
        }
    }

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            c[i][j] = 0;
            for (int k = 0; k<3; k++){
            c[i][j] += a[i][k] * b[k][j];
            }
        }
    }

    System.out.println("행렬 a와b의 곱 c");
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            System.out.print(c[i][j]+ "  ");
        }
        System.out.println();
    }
}
}
