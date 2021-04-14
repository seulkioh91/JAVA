public class ExamExam {
    public static void main(String[] args) {
        ExceptionExam ex = new ExceptionExam();      
        // int num = ex.get50thItem(new int[100]);
        // System.out.println("array 배열의 50번째 요소의 값 : "+ num);

        int num = ex.get50thItem(new int[30]);
        System.out.println("array 배열의 50번째 요소의 값 : "+ num);
    }
}