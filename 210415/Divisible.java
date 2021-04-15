import java.util.Arrays;

public class Divisible {
    public int[] divisible(int[] array, int divisor) {
        int num=0; // 결괏값 배열의 갯수를 미리 파악해야 배열 생성가능

        for(int i = 0; i < array.length; i++) {
            if(array[i] % divisor == 0) // 조건에 만족하는지 검사
                num++;      // 조건에 만족하는 갯수 1씩 증가시킴
    } 

        int[] ret = new int[num];
        int index = 0;
        for(int j = 0; j< array.length; j++){
            if(array[j] % divisor == 0)
            ret[index++] = array[j];
        }
        return ret;
    }

    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}