package 참조타입확인;
// 참조 변수의 ==(같음을 확인?)
public class RefType {
    public static void main(String[] args) {
        String name1 = "진부연"; // name1과 name2 참조 주소가 같음
        String name2 = "진부연";
        String name3 = new String( "진부연");
        if (name1 == name3) { //객체 주소지가 같은지 묻는 조건문
            System.out.println("두개의 이름에 대한 참조가 같음");
        } else {
            System.out.println("두개의 이름에 대한 참조가 다름:");
        }
        if (name1.equalsIgnoreCase(name3)) { //실제 값이 같은지 >> 해당 식을 알아야함!
            System.out.println("두개의 이름의 내용이 같음");
        } else {
            System.out.println("두개의 이름의 내용이 다름");
        }
    }
//        int x = 0; // x라는 초기값
//        String str = null; // 해당 참조 타입 변수가 객체를 참조하지 않는다는 의미, 참조 타입의 기본값(null은 참조타입에만 올 수 있음)
//        int[] intArray = null;

//        Integer val = null; //0; 값도 넣을 수 있음
//        int val2 = val; // NullPointException 발생
//        System.out.println(val2); val2




    }
