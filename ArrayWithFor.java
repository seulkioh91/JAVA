
public class ArrayWithFor {
    public static void main(String[] args){
        int[] iarray = new int[100];  //배열 생성

        for(int i = 0 ; i<iarray.length; i++){
            iarray[i] = i + 1;          //배열에 넣기
        }

        for(int i = 0 ; i < iarray.length; i++){
        System.out.print(iarray[i]+" ");
    }                                   //배열에서 출력
        System.out.println("");
        System.out.println("");

        int sum = 0;
        for (int i = 0 ; i < iarray.length; i++){
            sum += iarray[i];           //전체 합계 누적
        }System.out.println(sum);
    }
}