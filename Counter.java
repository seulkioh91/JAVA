class Updater {
    // public void update(int count) {
    //     count++;
    public void update(Counter counter) {
        counter.count++;
    }

}

public class Counter {
    int count = 0;  // 객체변수
    public static void main(String[] args) {        
        Counter myCounter = new Counter();        
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        // myUpdater.update(myCounter.count);
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
// 주석된 내용으로 진행하면 0출력
// 변경한 내용으로 진행하면 1출력
// 변수로 전달 --> 객체로 전달