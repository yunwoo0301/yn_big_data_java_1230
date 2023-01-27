package 손익분기점;

import java.util.Scanner;

public class BreakEventEx {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 고정비용
        int B = sc.nextInt(); // 가변비용(생산비용)
        int C = sc.nextInt(); // 판매금액
        if(B >= C) {
            System.out.println("-1");
            return;
        }
        System.out.println((A / (C-B)) + 1);





    }
}
