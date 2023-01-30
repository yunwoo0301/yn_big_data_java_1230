package 어레이리스트예제1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// List 인터페이스란? 배열과 비슷한 구조를 가지면 하위에 ArrayList, LinkedList, Vector 클래스로 구성됨.
// 요소의 저장 이거나 유지, 중복 저장 허용, 동적 할당(크기 지정을 안해도 됨). 다양한 메소드 제공
// ArrayList : 물리적으로 연속돤 공간에 저장, 검색을 인덱스로 하기 때문에 빠름, 삽입, 삭제는 느림(단, 맨뒤 삽입 / 삭제는 빠름)
// Vector : ArrayList 와 동일 특성을 가짐, 멀티스레드 환경을 위해 동기화 기능 지원하기 때문에 안정적이나, ArrayList 보다 느림
// LinkedList : 물리적으로 연속된 공간이 아님, 참조로 다음 저장 위치를 가리킴. 삽입/삭제가 매우 빠름. 검색은 느림
public class ArrayListEx1 {
    public static void main(String[] args) {
        String[] data = {"138", "145", "121", "155", "105"}; // 이미 만들어진 배열
        List<String> pitches = new ArrayList<>(Arrays.asList(data)); // asList()는 이미 만들어진 배열을 List 에 추가함.
//        pitches.add("138"); // ArrayList 마지막에 값 추가(이때 사이즈가 증가함)
//        pitches.add("129");
//        pitches.add("138"); // 중복된 값도 가능
//        pitches.add(1, "155"); // 해당 인덱스에 값 추가(성능에 영향을 미침)
//        pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(pitches);
//        System.out.println(pitches.get(3)); // 전달된 인덱스의 값을 반환함
//        System.out.println(pitches.get(5)); // 없는 인덱스를 전달하면 예외가 발생함.(예외처리에서 죽지 않게끔 할 수 있음)
//        System.out.println(pitches.size()); // ArrayList 의 개수 반환
//        System.out.println(pitches.contains("129")); // false 출력됨, 전달된 값이 ArrayList 내 있는지 확인
//        System.out.println(pitches.remove(0)); // 리스트에서 해당 항목을 삭제하고 삭제된 요소를 반환함.
//        System.out.println(pitches.remove("144")); // 리스트에서 해당 항목을 삭제하고 true/false 로 반환.

    }
}
