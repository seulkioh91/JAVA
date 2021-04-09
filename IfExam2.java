public class IfExam2 {
    public static void main(String[] args){
        int x = 50;
        int y = 60;

        if(x>y) {
            System.out.println("x는 y보다 큽니다.");
            System.out.println("test 1");
        }

        if(x>y)
            System.out.println("x는 y보다 큽니다."); //괄호가 없으면, 이 줄을 true case로 인식하고
            System.out.println("test 2");
    }
    
}
