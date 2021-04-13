//생성자 오버로딩과 this 실습

public class Car2 {
    String name;
    int number;
    
    public Car2(){
        this("이름없음",0);
    }
    public Car2(String name){
        this(name,0);
    }
    public Car2(String name, int number){
        this.name = name;
        this.number = number;
    }
}
