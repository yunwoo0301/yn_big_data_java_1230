package 간판만들기;

import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다르다
// 0은 4칸,1은 2칸, 나머지 수는 3칸을 차지
// 간판의 각 숫자 사이는 1칸의 여백이 필요.
// 총 입력한 숫자를 표기하기 위해 몇 칸의 공간이 필요한지 계산하는 문제
// 120 = 1 + 2 + 1 + 3 + 1 + 4 + 1 = 13
// 5611 = 처음 한칸 + 3 + 1 +  3  +  1 + 2 + 1 + 1
// 입력은 0이 들어올 때까지 계속 반복
public class signBoardMake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        String signNumber; // 문자열 입력받는 변수
        int[] numberSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0; // 총 몇자리의 공간을 차지하는지 누적하는 변수
        while (true) {
            signNumber = sc.next();
            if (signNumber.equals("0")) break;
            for (int i = 0; i < signNumber.length(); i++) {
                sum += numberSize[signNumber.charAt(i) - '0'] + 1; // 숫자 뒤에 공간을 위해 1 더해 줌
            } // 전체 공간에서 맨앞 공간을 위해 1을 더해 줌
            System.out.println(sum + 1);
            sum =0;
        }
    }
}



