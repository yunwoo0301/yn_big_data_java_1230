package 문자열연결;

import java.util.Scanner;

// 문자열 추가하기
// 첫 번째 문자열 입력 : seoul
// 두 번째 문자열 입력 : korea
// 정수값 입력 :
// 첫 번째 문자열에서 입력 받은 정수 갯수 만큼의 문자를 뒤에서 부터 잘라, 두 번째 문자열 앞에 축하하고
// 2를 입력하면 ulkorea
// 3을 입력하면 oulkorea
// 힌트 1. substring(index) : 문자열의 시작 위치 부터 끝까지 잘라냄
// 힌트 2. substring 메소드를 이용해 문자열 추출하기 전에 index 계산이 필요.
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String fstStr = sc.next(); //fst : first(첫 번째)
        System.out.print("두번째 문자열 입력 : ");
        String secStr = sc.next(); // sec : second(두 번째)
        System.out.print("정수값 입력 : ");
        int n = sc.nextInt();
        int position = fstStr.length()- n;
        String sub = fstStr.substring(position);
        System.out.println(sub+secStr);



    }
}
