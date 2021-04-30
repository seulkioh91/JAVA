import java.util.*;

abstract class question9 {
    int hand; //손 (가위 바위 보)
  }
  
  // 사람 손
  class Human extends question9 {
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
  
  class Computer extends question9 {
    Random rand = new Random();
  
    public int ComputerHand() {
      return rand.nextInt(3);
    }
  }
  
  class Main{
    public static void main(String[] args){
  
      Human hp = new Human();
      Computer cp = new Computer();
  
      int humanHand = hp.humanHand();
      int computerHand = cp.ComputerHand();
  
      System.out.println("나는 "+humanHand+"이고, 당신은"+computerHand+"입니다. ");
    }
  }
  