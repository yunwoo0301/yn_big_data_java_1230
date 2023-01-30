package 배수찾기;
// 문제 : 정수 n과 수의 목록이 주어졌을 때, 목록에 들어있는 수가 n의 배수인지 아닌지 구하는 프로그램 작성
// 입력 : 첫째 중에 n이 주어짐, 다음 줄에 한줄에 한 개씩 목록에 들어있는 수가 주어짐( 0 ~ 10000)
// 출력 : 목록에 있는 수가 n의 배수인지 아닌지를 구한 후 아래 처럼 출력
// 입력 예시
// 3 -> 주어진 수
// 1
// 7
// 99
// 321
// 777
// 0 -> 반복문에 대한 종료
// 출력
// 1 is Not a multiple of 3.
// 7 is Not a multiple of 3.
// 99 is Not a multiple of 3.
// 321 is Not a multiple of 3.
// 777 is Not a multiple of 3.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleSearchEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // ArrayList 생성
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 주어진 수
        int val; // 주어진 값의 배수인지 아닌지 판별하기 위한 값을 입력 받음
        while (true) { // 항상 참인 경우이므로 무한 반복하는 반복문, while 문은 탈출 조건 필요
            val = sc.nextInt(); // 키보드로부터 값 입력 받음
            if (val == 0) break; // 반복문의 탈출 조건
            list.add(val); // add 에 인덱스를 지정하지 않으면 마지막 위치에 저장됨.
        }
        for (Integer v : list) {
            if (v % n == 0) System.out.println(v + " is a multiple of " + n + ".");
            else System.out.println(v + " is a multiple of " + n + ".");
        }
    }
}

