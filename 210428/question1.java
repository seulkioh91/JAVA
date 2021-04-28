import java.util.*;

public class question1 {
  public static void main(String[] args){
    
  Random rand = new Random();
  Scanner sc = new Scanner(System.in);

  String[] dayKor = {"일","월","화","수","목","금","토"};
  String[] dayEng = {"sun","mon","tue","wed","thu","fri","sat"};
  System.out.println(" ");

  int last= -1; // 이전 요일
  int retry = 0;
  do {
    int day;
    do {
      day = rand.nextInt(7);
    } while(day == last);
    last = day;

    while (true) {
      System.out.print(dayKor[day]+"요일 : ");
      String s = sc.next();

      if (s.equals(dayEng[day])) break;  //정답일경우

      System.out.println("틀렸습니다. ");
    }
    System.out.print("정답입니다. 다시 한번? 1...Yes/0...No :");
    retry = sc.nextInt();
  }while(retry == 1);
}
}
