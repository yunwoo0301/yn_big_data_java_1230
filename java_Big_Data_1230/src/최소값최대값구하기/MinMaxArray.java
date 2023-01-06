package 최소값최대값구하기;

import java.util.Scanner;

// 정수값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수 값 입력 : 10
// 1 3 5 7 2 4 10 10 20 15
// Min : 1
// Max : 20
public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // 키보드 입력을 위한 스캐너 생성
        System.out.println("배열 갯수 입력 : ");
        int arrNum = sc.nextInt(); //배열 갯수 : arrNum
        int[] arr = new int[arrNum];
        for(int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 스캐너 값을 넣어야 하기 때문
        }
        int min = arr[0]; // 배열 내 기준값 정하기 위해 맨 앞에 숫자 0을 정함. 초기값은 배열의 특정한 값을 넣어야함.
        int max = arr[0];
//        for(int e : arr) { // e : 요소의 값(element) / 순회할 때 임의의 변수 e를 사용.
//            if(min > e) min = e;
//            if(max < e) max = e;
//            }
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
        }
        System.out.println("최소값 : " + min);
        System.out.println("최대값 : " + max);

        // 생성된 배열 갯수 만큼 순회 하면서 정수값을 입력 받음.
        // 정수 값 입력을 받음
        // 입력 받은 정수로 배열을 생성
        //값을 비교하기 위해 기준 값이 필요하므로 배열 0번째 값을 기준값으로 저장
        // 배열에서 제일 작은 값과 제일 큰 값을 찾음
        // 출력

    }
}
