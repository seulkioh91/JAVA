import java.util.*;
class ForExam {
//  프로그램의 시작점
  public static void main(String[] args) {


      int total = 0;

      for(int i = 1;i <=100;i++){
        if(i%2 != 0) {
          continue;
      }
        total += 1;

  }      System.out.println(total);
}
}

