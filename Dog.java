public class Dog extends Animal {

    public Dog() {

    }
     //Dog이라는 생성자 : 1. 이름이 클라스명과 동일하다. 2. return이 없다.
    public void sleep() {
        System.out.println(this.name+" zzz");
    }
}