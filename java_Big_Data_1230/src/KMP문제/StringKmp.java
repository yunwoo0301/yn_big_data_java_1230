package KMP문제;

import java.util.Scanner;

// 입력 : Knuth-Marris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
public class StringKmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 :");
        String name = sc.next();
//        String[] splitName = name.split("-");
        //첫 번째 방법 : split() 이미 만들어진 배열이 있는 경우 향상된 for문
//        String[]splitName = name.split("-");
//        for(String e : splitName) System.out.print(e.charAt(0));//
//      }
//  }


        // 두 번재 방법 : 대문자만 골라내는 방법
//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') { //대문자 구간
//                System.out.print(name.charAt(i));
//      }
//  }

//        // 세 번째 방법 : 0번째 문자 출력, 그리고 '-'다음 문자 출력
//        for(int i = 0; i < name.length(); i++) {
//            if (i == 0) System.out.print(name.charAt(i));
//            else {
//                if (name.charAt(i) == '-') System.out.print(name.charAt(i + 1));
//            }
//        }


        // 네 번째 방법 : 문자 배열로 변경 후 대문자 골라 내기
        char[] chName = name.toCharArray();
        for(char e : chName) {
           if(e >= 'A' && e <= 'Z') System.out.print(e);


            }
        }
    }




