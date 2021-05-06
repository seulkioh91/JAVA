public class ifexam {
    public static void main(String[] args) {

    // int base = 180;
    // int height = 185;
    // boolean isTall = height > base;

    // if (isTall) {
    //     System.out.println("키가 크다.");
    // }

    String a = "hello";
    String b = "java";
    String c = "hello";
    String d = new String ("hello");
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(a==c);
    System.out.println(a==d);
    System.out.println(a.equals(d));
    System.out.println(a);
    System.out.println(d);
    System.out.println(System.identityHashCode(a)); //주소값 같다. 변수명은 다르지만
    System.out.println(System.identityHashCode(c)); //주소값 같다. 변수명이 다르지만 글자가 같기때문에
    System.out.println(System.identityHashCode(d)); //new string으로 만든것은 hello가 같더라도 주소값 다르다.
}
}