public class Test {
    // 1. 입력과 출력이 모두 있는 메소드
    public int sum(int a, int b) {
        return a+b;
    }
    // 2. 입력이 없는 출력만 있는 메소드
    public String say() {
        return "Hi";
    }

    // 3. 입력은 있는, 출력이 없는 메소드
    public void sum2(int a, int b) {
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"이다.");

    }
    // 4. 입력도 없고, 출력도 없는 메소드
    public void say2() {
        System.out.println("Hi");
        
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test myTest = new Test();
        int c = myTest.sum(a, b);
        System.out.println(c);

        String d = myTest.say();
        System.out.println(d);

        myTest.sum2(3,4);
        myTest.say2();
    }
}
