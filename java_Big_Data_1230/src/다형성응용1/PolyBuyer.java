package 다형성응용1;
// 매개변수의 다형성 예제
public class PolyBuyer {
    public static void main(String[] args) {
        Buyer buyer = new Buyer(); // 구매를 하는 객체
        TV tv = new TV();
        Audio audio = new Audio();
        Computer computer = new Computer();
        buyer.buy(tv); // 부모 타입의 상속받은 객체들을 대입시킴 / 제품과 바이어는 별개
        buyer.buy(audio);
        buyer.buy(computer);
        buyer.viewInfo();

    }
}
