package 문자열반전;

import java.util.Scanner;

// abcdefg => gfedcba 반대로 출력
// 힌트 : For문 활용
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
//        int index = str.length();
//        while(true) {
//            index--; // 문자열보다 -1 적기 때문(0부터 시작하므로)
//            System.out.print(str.charAt(index));
//            if(index == 0) break;
//        }
        for(int i = str.length()-1; i >= 0; i--) { // 뒤에서부터(-1) 0이 될 때까지
            System.out.print(str.charAt(i));
        }


        }

    }
