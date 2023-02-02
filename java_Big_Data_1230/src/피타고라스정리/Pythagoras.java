package 피타고라스정리;

import jdk.jshell.SourceCodeAnalysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        ArrayList<String> rstList = new ArrayList<>();
        String rst;
        while (true) { // 0 0 0 들어올 때까지 반복문 수행
            rst = calcFunc();
            if (rst.equals("exit")) break;
            rstList.add(rst);
        }
        for (String e : rstList) System.out.println(e);
    }
    static String calcFunc() {
        int sum = 0;
        int[] arr = new int[3]; // 3번의 길이를 입력 받기 위해
        Scanner sc = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if (sum == 0) return "exit";
            Arrays.sort(arr); // 오름차순 정렬
            if((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                return "right";
            }
            return "wrong";
    }
}
