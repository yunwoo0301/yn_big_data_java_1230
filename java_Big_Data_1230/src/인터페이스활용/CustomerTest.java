package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // Customer Type 의 customer 참조변수를 Buy 인터페이스형 buyer 참조 변수에 대입(형변환)
        buyer.buy(); // buyer 는 Buy 인터페이스의 메소드만 호출 가능
        buyer.order(); // 재정의된 메소드가 호출됨

        Sell seller = customer; // 자동 형변환이 일어남

     }
}
