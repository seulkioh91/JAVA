public class Car {

    String name;
    int number;

    public Car(String name){
        this.name = name;
    }

    public Car(){
        // this.name = "이름없음";
        // this.number = 0;
        this("이름없음", 0); //생성자 호출
    }
    // 인수가 아무것도 없는 생성자를 호출할 때
    // Car.java에 있는데, 없단느 의미를 직접 부여할 수 있지만,
    // this("이름없음", 0); 이 한줄로 바꾸어 표현할 수 있다.

    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }
}
