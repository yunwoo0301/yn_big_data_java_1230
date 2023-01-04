package 변수의생존범위;
import java.util.Scanner;
// 상수란? 변수와 마찬가지로 데이터를 저장하는 메모리 공간을 의미
// 변수와 다른 점은 프로그램이 실행되는 동안 값이 변경되지 않음.
// 자바에서 상수는 final 키워드로 정의하고 단, 한 번만 값을 설정할 수 있다. 되도록 대문자를 씀.
public class ScopeData {
    public static void main(String[] args) {
        final double taxRate = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 수입을 입력 하세요 : ");
        int income = sc.nextInt();
        System.out.println("당신이 내야할 세금은" + income * taxRate);

    }
}


