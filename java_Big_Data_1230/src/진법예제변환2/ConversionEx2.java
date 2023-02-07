package 진법예제변환2;
// 10진수를 입력받아 2진수로 변경  -> 10진수로 변경
// 배열 사용 X 않고 정수 타입 변수를 이용해 변환, 문자열 사용 금지
// 입력 : 10
// 이진수 1010
// 십진수 10
import java.util.Scanner;
public class ConversionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 :");
        int val = sc.nextInt();
        val = decToBin(val);
        System.out.println("이진수 : " + val);
        val = binToDec(val);
        System.out.println("십진수 : " + val);

    }
    static int decToBin(int dec) { // 10진수를 입력 받아 2진수 반환
        int calc; // 계산으로 만들어진 이진수
        int bin = 0; // 최종 결과
        int pos = 1; // 자리이 이동을 위한 포지션 변수
        while (dec !=0) {
            calc = dec % 2; // 2로 나눈 나머지를 구함
            bin = bin + calc * pos; // 총합
            dec = dec / 2;
            pos = pos * 10;

        }
        return bin;
    }
    static int binToDec(int bin) { // 2진수를 입력 받아 10진수 반환
            int dec = 0; // 최종결과
            int i = 0; // 인덱스 계산용 변수
        int tmp; // 계산을 위한 임시값 저장용
        while(bin !=0) {
            tmp = bin % 10; // 10으로 나눈 나머지 구함
            bin =bin / 10;
            dec += tmp * Math.pow(2, i++);
        }

            return dec;
        }

}
