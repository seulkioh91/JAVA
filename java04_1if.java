import java.util.*;
public class java04_1if {
    public static void main(String[] args) {
//     int money = 2000;
//     if (money >= 3000) {
//         System.out.println("택시를 타고 가라");
//     }else {
//         System.out.println("걸어가라");
//     }
// }
// int money = 2000;
// boolean hasCard = true;

// if (money>=3000 || hasCard) {
//     System.out.println("택시를 타고 가라");
// }
// else{
//     System.out.println("걸어가라");
// }
// }

// | , || --> OR
// | 둘다 전부 따져서 결과 도출
// || 하나만 따져서 결과 도출
// True | False --> True 1개확인
// True | True --> True 1개 확인
// False || True --> True 2개 확인
// False || False --> False 2개확인

// &,&& --> AND
// & 둘다 전부 따져서 결과 도출
// && 하나만 따져서 결과 도출
// True & False --> False 1개확인
// True && False --> False 1개확인
// False & False --> False 2개확인
// False & False --> False


boolean hasCard = true;
ArrayList<String> pocket = new ArrayList<String>();
pocket.add("paper");
pocket.add("handphone");
pocket.add("money");
if (pocket.contains("money")) {
    System.out.println("택시를 타고 가라");
}else if(hasCard) {
    System.out.println("택시를 타고 가라");
}else {
    System.out.println("걸어가라");
}
    }
}