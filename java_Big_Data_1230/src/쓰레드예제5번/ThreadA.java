package 쓰레드예제5번;

public class ThreadA extends Thread {
    private WorkObject workObject; // 클래스 이름으로 참조변수 만듬(외부에서 내부 객체로 주입받음)
    public ThreadA(WorkObject workObject) { // 매개변수를 전달 받을 때 참조변수에 주입함
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }
}
