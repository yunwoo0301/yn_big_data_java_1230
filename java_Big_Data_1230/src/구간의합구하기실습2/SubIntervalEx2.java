package 구간의합구하기실습2;
import java.util.Scanner;

public class SubIntervalEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        long[]sumArr = new long[n]; // 합배열(입력용 어레이)
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i ==0) sumArr[0] = arr[0];
            else sumArr[i] = sumArr[i-1] + arr[i]; // S[i] = S[i-1] + A[i]
        }
        int left = 0, right = 0;
        while(x != 0) {
            left = sc.nextInt();
            right = sc.nextInt();
            // 구간합 계산하기 : sum[R] - sum[L-1], 인덱스로 계산하기 위해서는 -1을 더해준다. 시간의 복잡도 : 0(1)
            if(left != 1) System.out.println(sumArr[right-1] - sumArr[left-2]);
            else System.out.println(sumArr[right - 1] - 0);
            x--;
        }
    }
}
