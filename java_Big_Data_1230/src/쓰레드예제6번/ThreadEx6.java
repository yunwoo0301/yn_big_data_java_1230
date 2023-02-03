package 쓰레드예제6번;

import static java.lang.Thread.sleep;

// 스레드의 안전한 종료 방법은 stop 플래그를 구현하는 방법과 interrupt()메소드를 사용하는 방법이 있음.
public class ThreadEx6 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        sleep(10000);
//        runThread.setStop(true);
        InterruptThread intThread = new InterruptThread();
        intThread.start();
        sleep(10000);
        intThread.interrupt(); // 일시정지 상태의 쓰레드에 Interrupt Exception 발생시킴


    }
}
