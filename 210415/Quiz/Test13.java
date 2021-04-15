import java.util.Random;

public class Test13 {
    public static void main(String[] args){
        Random random = new Random();
        int x = 1+ random.nextInt(9); //9미만 = 8+1 = 9
        int y = -1 - random.nextInt(9); // 마이너스1에서 마이너스 9
        int z = 10 + random.nextInt(90); // 10이상 99미만
        System.out.println("3개의 난수를 생성했습니다.");
        System.out.println("한 자리 양의 정수 : "+x);
        System.out.println("한 자리 음의 정수 : "+y);
        System.out.println("두 자리 양의 정수 : "+z);
    }
}
