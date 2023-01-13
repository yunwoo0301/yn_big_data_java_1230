package 상속기본;

public class BasicInheritance {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep(); // 부모가 가진 변수
        houseDog.sleep(4); // 오버라이딩 변수

    }
}
