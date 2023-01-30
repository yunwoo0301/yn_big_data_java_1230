package 제네릭응용;

public class GenericPrinter<T extends Material> { // Material 로 부터 상속 받은 클래스만 타입변수로 지정 가능하도록 함
    private T material; // 제네릭프린터를 구현하기 위한 재료 생성("material" 참조변수)

    public void setMaterial(T material) {
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }
    @Override
    public String toString() {
        return material.toString();
    }

}
