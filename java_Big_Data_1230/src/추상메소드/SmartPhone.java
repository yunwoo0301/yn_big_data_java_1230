package 추상메소드;

public class SmartPhone extends Phone{
    SmartPhone(String name) { // 부모의 생성자 호출
        super(name);
    }

    @Override
    void call() {
     System.out.println("부모의 요청으로 통화 기능을 구현 합니다.");

    }
    void internet() {
     System.out.println("인터넷 기능을 만듭니다.");


    }
}
