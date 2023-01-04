package 입출력예제2;

import java.io.IOException;
import java.util.Scanner; // 두 번째로 많이 사용되는 자바 API

// 콘솔 입력
// ★ System.in.read() : 키보드의 입력을 ASCII 코드값으로 읽어 들임 ★ 시험에 중요! 실무엔 안쓰임
// Scanner 입력 : 키보드의 입력 원하는 데이터 타입으로 반환 받음.
public class ScannerEx {
    public static void main(String[] args) { //예외가 발생하면 외부로
        Scanner sc = new Scanner(System.in); // sc : 참조 타입의 변수
        byte a = sc.nextByte(); // 키보드의 입력을 byte형으로 반환
        short b = sc.nextShort(); //
        int t = sc.nextInt();
        char ch = sc.next().charAt(0); // sc.next 문자열을 입력하는 메소드, 문자열에서 첫번째 문자를 추출
        String s1 = sc.next(); // 문자열을 공백 단위로 입력 받음
        String s2; // 문자열을 줄바꿈 기준으로 입력 받음
        s2 = sc.nextLine();
    }
}








