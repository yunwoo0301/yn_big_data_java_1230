package 소수판별하기;
// 소수란? 1과 자기자신 이외에는 나누어 지지 않는 수
// 소수 판별하기 :

import java.util.Scanner;

public class PrimeEx1 {
    //        PrimeEx1 primeEx1 = new PrimeEx1();
    //        isPrime(100); // isPrime을 객체로 만들어야함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("소수 여부 : " + rst);

        }

    // static 키워드로 선언되면 객체 생성 시 생성이 안되고 클래스 생성 시 단 한 번 만들어짐
    // 해당 메소드 수행 후 반환값이 true/false 임
    // 정수값을 입력 받아 해당 정수가 소수인지 아닌지 판별 후 결과를 반환함
    static boolean isPrime(int n) {
    //1과 입력 받은 값을 제외, 즉 2 ~ 입력받은 값 미만
        for(int i = 2; i < n; i++) {
            if(n % i == 0) return false; // 전달 받은 수를 1과 자기자신을 제외하고 나누어지는 경우를 의미
        }
        return true;
    }
}
