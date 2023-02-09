package 구간의합구하기실습;
import java.util.Scanner;
// 수 N개가 주어졌을 때, i 번째 수부터 j 번째 수까지 합 구하는 문제
// 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어짐, 둘째 줄에는 N개의 수가 주어짐.
// 수는 1,000보다 작거나 같은 자연수이며, i와 j가 주어짐
public class SubIntervalEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 개수
        int x = sc.nextInt(); // 테스트 케이스
        int[] arr = new int[n]; // 배열의 개수(임의의 갯수)만큼 배열 생성
        for(int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int left =0, right = 0;
        while(x != 0) { // 0과 같지 않은 동안에 반복순회(true)
            long sum =0;
            left = sc.nextInt();
            right = sc.nextInt();
            for(int i = left - 1; i < right; i++){
                sum += arr[i];
            }
            System.out.println(sum);
            x--;

        }
    }
}
