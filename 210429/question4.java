import java.util.*;
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 월입니까(1~12):");int m = sc.nextInt();
        String monthString = "";
        switch (m) {
            case 12: case 1 :case 2 : 
            monthString = "해당 월의 계절은 겨울입니다.";
                    break;
            case 3 : case 4 : case 5 : 
            monthString = "해당 월의 계절은 봄입니다.";
                    break;
            case 6 :  case 7 : case 8 : 
            monthString = "해당 월의 계절은 여름입니다.";
                    break; 
            case 9 : case 10 : case 11 : 
            monthString = "해당 월의 계절은 가을입니다.";
                    break;                       
            default : monthString = "";
                    break;   

        }
        System.out.println(monthString);
}
    }
