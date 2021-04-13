public class StringMethodExam {
 public static void main(String[] args) {
    //  String str = new String("hello");
    String str = "hello";
    System.out.println(str.length());
    System.out.println(str.concat(" world")); // 문자를 붙인다.
    System.out.println(str);
    str = str.concat(" world");
    System.out.println(str);
    System.out.println(str. substring(3)); // 3번째부터 끝까지
    System.out.println(str.substring(3,6)); //3번째부터 6번째 자리 미만까지.
 }   
}