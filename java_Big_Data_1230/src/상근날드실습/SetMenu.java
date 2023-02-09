package 상근날드실습;

import java.util.Scanner;

// 상근날드 가게에서는 세트 메뉴를 판매 합니다.
// 햄버거는 3개 종류가 있고
// 음료는 2가지 종류가 있음
// 입력은 총 5개의 값을 연속으로 입력 하는데 햄버거 3가지 가격, 음료 2가지 가격을 연속으로 입력
// 햄버거 0 1 2, 음료 3 4  / 배열 5개로 잡음
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2가지 중 싼 것 선택하고, 세트 메뉴기 때문에 50원 할인
// 0 1 2 중 최소값 / 3 4 중에 최소값 / -50
// 총 세트메뉴의 금액을 구하는 문제
public class SetMenu {
    public static void main(String[] args) {
        int[] menu = new int[5]; // 5개의 정수로 구성된 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : "); // 햄버거 3개와 음료 2개 화면 출력
        for (int i = 0; i < menu.length; i++) { // 지역변수 {} 범위 내에서 생성
            menu[i] = sc.nextInt(); // 배열의 길이만큼 순회하면서 값을 연속으로 입력 받음

        }
        int minBurger = menu[0]; // 0 ~ 2 인덱스 사이의 햄버거 중 하나의 값을 기본값을 설정(맨 처음 값)
        int minDrink = menu[3]; // 3 ~ 4 인덱스 사이의 음료 중 하나의 값을 기본값으로 설정(맨 처음 값)
        // 반복문을 순회하면서 햄버거 1개와 음료 1개 선택(제일 싼 메뉴)
        for (int i = 0; i < menu.length; i++) { // menu.length : 5
            if ((i < 3) && (minBurger > menu[i])) minBurger = menu[i]; // 비교 연산자 > 논리연산자 우선순위 높음 ( ) 필요!
            if ((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50); // 정수이므로 따옴표 필요 무 minBurger : 800 minDrink : 1000


    }
}
