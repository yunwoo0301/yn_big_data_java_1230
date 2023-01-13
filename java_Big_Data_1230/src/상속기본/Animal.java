package 상속기본;

public class Animal {
    String name;
    void setName(String name) { // 필드의 값을 설정하는 setName
        this.name = name;
    }
}
// 상속을 받기 위해서는 extends
// Animal class 로부터 상속을 받아 Dog class 를 생성
// Dog class 에서 아무런 기능을 구현하지 않아도 자동으로 부모의 필드와 메소드가 포함되어있음
class Dog extends Animal {
    void sleep() {
        System.out.println(name + "잠을 잡니다.");
    }
}
class HouseDog extends Dog {
    @Override // 어노테이션
    void sleep() {
        System.out.println(name + "집에서 잠을 잡니다.");
    }
    void sleep(int time) {
        System.out.println(name + "가 " + time + "시간 동안" + "집에서 잠을 잡니다.");
    }
}
