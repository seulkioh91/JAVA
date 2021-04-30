import java.util.*;

import javax.lang.model.util.ElementScanner6;

abstract class question10 {
    int hand; //손 (가위 바위 보)
  }
  
  // 사람 손
  class Human extends question10 {
    Scanner sc = new Scanner(System.in);
  
    public int humanHand(){
    do {
      System.out.print("가위바위보!!!0...바위/1...가위/2...보");
      hand = sc.nextInt();
    }while(hand < 0 || hand > 2);
    return hand;
    }
  }
  
  // 컴퓨터 손
  
  class Computer extends question10 {
    Random rand = new Random();
  
    public int ComputerHand() {
      return rand.nextInt(3);
    }
  }
  
  class Main{
    public static void main(String[] args){
  
      Human hp = new Human();
      Computer cp = new Computer();
      String[] hands = {"가위","바위","보"};
  
      int humanHand = hp.humanHand();
      int computerHand = cp.ComputerHand();
  
      System.out.println("나는 "+hands[humanHand]+"이고, 당신은"+hands[computerHand]+"입니다. ");
      System.out.println(rockpapershissor(humanHand,computerHand));
    }

    public static String rockpapershissor(int com, int per){
        if((com - per == -1)||(com-per==2))
        return "당신이 졌습니다.";
        else if(com-per==0)
        return "비겼습니다";
        else
        return" 당신이 이겼습니다.";
    }
  }
  