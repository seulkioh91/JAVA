public class Tiger extends Predator implements Barkable {
    public String getFood() {
        return "apple";
    }
    public void bark(){
        System.out.println("roar");
    }
}


// 인터페이스는 다중 구현이 가능하다.
// public class Tiger extends Animal implements Predator , a, b, c, 등등등... {
//     public String getFood();
// }
// 단 구현시킬 인터페이스들의 내용은 모두 사용되어야 한다.