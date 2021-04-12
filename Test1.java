public class Test1 {
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args){
        Test1 test = new Test1();
        try{
            test.sayNick("fool");
            test.sayNick("genious");
        }catch(FoolException e) {
            System.err.println("FoolException이 발생했습니다.");
        }
    }
}
