package 멀티타입파라미터;
// 타입변수란? 참조형 타입을 의미하고 어떤 문자로 이름을 지정해도 상관없지만 일반적으로 'T'
// 타입 변수는 클래스 뿐만 아니라 메소드의 매개변수나 반환타입으로 사용 가능
public class MultiTypeEx {
    public static void main(String[] args) {
        Product<String, Integer> product1 = new Product<>("TV",1234);
        Product<Integer, String> product2 = new Product<>(1234,"1234");
        // Product "<>" 데이터 타입
        System.out.println(product1.getYear());
        System.out.println(product1.getName());
        System.out.println(product2.getYear());
        System.out.println(product2.getName());

    }
}

class Product<T, M> { // "<>" 제너릭타입 or 컬렉션 프레임워크 구현 시 사용
    private T name;
    private M year;

    public Product(T name, M year) {
        this.name = name;
        this.year = year;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}
