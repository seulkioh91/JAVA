public class Test1 {

    public int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test1 myTest = new Test1();
        int c = myTest.sum(a, b);

        System.out.println(c);
    }
}
