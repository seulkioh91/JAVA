
    //OverWriting --> 할아버지(Animal)/부모클라스(Dog)의 상속보다, 현재 나의(자식) 클라스가 우선시되어 실행된다.
    //OverLoading --> 

public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    } //생성자 : 1. 이름이 클라스명과 동일하다.
    //          2. return이 없다.
    
    public HouseDog(int type) {
        if(type == 1){
            this.setName("yorkshire");
        } else if (type == 2){
            this.setName("bulldog");
        }
    }

    public void sleep() {
        System.out.println(this.name+" zzz in house");
    }

    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for" + hour + " hours");
    }
    
    public void sleep(int hour, int min) {
        System.out.println(this.name+" zzz in house for" + hour + " hours " + min + " minutes");
    }   
    
    // public static void main(String[] args) {
    //     HouseDog houseDog = new HouseDog() ;
    //     houseDog.setName("happy"); //Animal 메소드 상속
    //     houseDog.sleep(); // Dog 메소드 상속
    //     houseDog.sleep(3); // 입력항목에 따라 메소드 실행
    //     houseDog.sleep(4, 30); // 입력항목의 인수에 따라 메소드 실행 (이후 생성자에서 더 배우게 된다)
    // }

    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1);
        System.out.println(dog.name);
        System.out.println(yorkshire.name);
    }
}