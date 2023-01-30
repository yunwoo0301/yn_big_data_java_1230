package 제네릭응용;

public class GenericApplyEx {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>(); //
        powderGenericPrinter.setMaterial(new Powder()); // Powder 타입의 객체를 생성해서 매개변수로 전달
        Powder powder = powderGenericPrinter.getMaterial();
        System.out.println(powder);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plastic);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
    }
}
