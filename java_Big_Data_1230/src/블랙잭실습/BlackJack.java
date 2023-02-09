package 블랙잭실습;
import java.util.Scanner;
// 블랙잭 : 카드의 합이 21이 넘지 않는 한도 내 카드의 합을 최대로 만드는 게임
// 카드의 갯수 N(3 <= N <= 10)과 M(10 <= M <= 300,000)이 주어진다.
// 5 25 => 카드 장수, 주어진 값
// 5 6 7 8 9 => 카드 중 3장의 카드를 골라서 주어진 값과 같거나 작은 값 중 제일 가까운 값을 찾아야 함.
public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 3장의 카드의 합
        int rst = 0; // 3장의 카드의 합으로 만들어진 결과값
        System.out.print("카드 장 수 : ");
        int cnt = sc.nextInt();
        System.out.print("주어진 값 : ");
        int m = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = i + 1; j < cnt; j++) { // +1은 i 와 겹치면 안되므로
                for (int k = j + 1; k < cnt; k++) { // +1은 j 와 겹치면 안되므로
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && rst < sum) rst = sum;
                }
            }
        }
        System.out.println("결과 : " + rst);
    }
}
