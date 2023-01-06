package 배열기본;

public class BasicArray {
    public static void main(String[] args) {
        int[] score = {80, 99, 70};
        int sum = 0;
        for (int i = 0; i < score.length; i++) {// 총점을 구하는 조건식
            sum += score[i]; // sum = sum + score[i] 0+0번째 = 90 /
        }
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n", (double)sum/score.length);

    }
}
