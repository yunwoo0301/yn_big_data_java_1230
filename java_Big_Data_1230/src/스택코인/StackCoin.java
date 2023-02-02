package 스택코인;
import java.util.Stack;

public class StackCoin {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();
        coinBox.push(new Coin(100)); // new Integer() 동일, 외부의 값을 내부의 객체에 담음
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));
        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop(); // 리턴값 반환을 위해 pop 사용
            System.out.println("꺼내온 동전 : " + coin.getValue());

        }

    }
}

class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}