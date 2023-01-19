package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton(); // 참조 변수는 1개만 생성됨
    private Singleton() { // private : 생성자를 통해 객체가 생성되지 않도록 접근 제한을 설정(그 외 public 사용)
        name = "test";
        id = 100;
    }
    //getSingleton() 메소드를 호출 시 반환 값으로 이미 만들어져 있는 싱글톤 객체의 참조 변수를 반환
    static Singleton getSingleton() { // 반환타입 : Singleton
        return singleton;

    }

}
