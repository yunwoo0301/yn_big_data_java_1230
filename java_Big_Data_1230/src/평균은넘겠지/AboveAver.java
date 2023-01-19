package 평균은넘겠지;
// 테스트 케이스의 개수 C가 주어진다.
// 둘째줄 부터 각 테스트 케이스마다 학생의 수 N(1<= N <= 1000, N은 정수)이 첫 수로 주어지고 이어서 N명의 점수를 구한다.
// 점수는 0 <= score <= 100
// 각 케이스마다 한 줄 씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋쩨자리까지 츨력한다.

//      5 => 총 테스트 케이스
//      5 50 50 70 80 100 ==>> 40.00% (학생 수 성적 성적 성적 성적 성적) ==> 평균이 넘는 비율을 100분율로 표기
//      7 100 95 90 80 70 60 50 ==> 57.143%
//      3 70 90 80
//      3 70 90 81
//      9 100 99 98 97 96 95 94 93 91

import javax.swing.*;
import java.util.Scanner;

public class AboveAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt(); // 테스트 케이스에 대한 횟수(?)
        double[] rst = new double[testCnt];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = overRate();
        }
        for (double e : rst) {
            System.out.printf("%.3f%%\n", e);
        }

    }
        // 학생수를 입력 받고 입력 받은 학생수 만큼의 성적을 입력 받음
        // 평균을 구하기 위해서 먼저 총점을 구하고 이를 나누어 평균을 구함
        // 구해진 평균을 가지고 각각의 입력 받은 성적을 비교해 평균을 넘는 학생수를 구함
        // 구해진 학생수를 100분율로 변환해서 반환
        static double overRate() {
            Scanner sc = new Scanner(System.in);
            int cnt = sc.nextInt(); // 학생의 수 입력
            int total = 0; // 총점을 구하기 위한 변수
            int overCnt = 0; // 평균을 넘는 학생의 수를 구하는 변수
            int[] score = new int[cnt]; // 학생의 수만큼 성적을 입력 받기 위한 배열 생성
            for (int i = 0; i < score.length; i++) {
                score[i] = sc.nextInt(); // 학생의 수만큼 성적을 입력 받아 배열에 대입
                total += score[i]; // 학생의 수만큼 입력된 성적을 누적해서 총점을 구함
            }
            double aver = (double) total / cnt; // 총점을 학생의 수로 나누어 평균을 구함
            for (int e : score) // e : 요소의 값
                if (e > aver) overCnt++; // 평균을 넘는 학생의 수 구하기

        return (double) overCnt / cnt * 100; // 소수점 이하가 있는 백분율 반환

    }
}







