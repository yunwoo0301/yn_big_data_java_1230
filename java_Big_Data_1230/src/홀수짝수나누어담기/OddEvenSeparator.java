package 홀수짝수나누어담기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 7개의 정수를 입력 받음 (배열 생성 필요)
// 정수 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
public class OddEvenSeparator {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();


    void inputArray() { // 7개의 정수를 입력 받음
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.print("정수 입력 : ");
        while (true) {
            value = sc.nextInt();
            if (value == 999) break;
            inList.add(value); // ArrayList 값을 추가함
        }
    }
    void separatorArray() {
        for (int e : inList) {
            if (e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void printArray() { //홀수 / 짝수 배열 출력
        System.out.print("홀수 : ");
        for (int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for (int e : evenList) System.out.print(e + " ");
    }
}





// 배열로 표현하기
//    int[] inputArr = new int[7];
//    int[] oddArr = new int[7];
//    int[] evenArr = new int[7];
//    int evenIdx = 0;
//    int oddIdx = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("정수를 입력하세요 : ");
//        for(int i = 0; i < inputArr.length; i++) {
//            inputArr[i] = sc.nextInt();
//홀수 / 짝수 나누어 담기
//        for(int e : inputArr) {
//            if(e % 2 == 0) evenArr[evenIdx++] = e;
//            else oddArr[oddIdx++] = e;
//        }
//    }
//void printArray() { //홀수 / 짝수 배열 출력
//        System.out.print("홀수 : ");
//        for(int i=0; i < oddIdx; i++) System.out.print(oddArr[i] + " ");
//        System.out.println();
//        System.out.print("짝수 : ");
//        for(int i=0; i <evenIdx; i++) System.out.print(evenArr[i] + " ");
//    }
//}

