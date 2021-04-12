public class quiz {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        if(str1==str2){
            System.out.println("주소가 같습니다.");
        }else{
            System.out.println("주소가 다릅니다.");
        }

        if(str3==str4){
            System.out.println("주소가 같습니다.");
        }else{
            System.out.println("주소가 다릅니다.");
        }
        if(str3.equals(str4)){
            System.out.println("주소가 같습니다.");
        }else{
            System.out.println("주소가 다릅니다.");
    }
}
}