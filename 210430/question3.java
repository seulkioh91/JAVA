class question3 {
  public static void main(String[] args){
    Period taejo = new Period(new Day(1392,8,5), new Day(1398,10,14));

    System.out.println("태조 = "+ taejo);
  }
}

class Period {
    //변수
    private Day from; //시작일
    private Day to;   //종료일
  
    // 생성자
    public Period(Day from, Day to){
      this.from = new Day(from);
      this.to = new Day(to);
    
    // 매서드
    public Day getFrom() {
      return new Day(from);
    }
    public Day getTo()   {
      return new Day(to);
    }
  
    public String toString() {
      return "{" + from + "~" + to + ")";
    }
  }
  
  

  