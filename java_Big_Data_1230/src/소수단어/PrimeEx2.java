package 소수단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

// 알파벳 대소문자로 이루어진 영어단어가 있을 때 a => 1, b => 2,..., z => 26, 'A' => 27, 'Z' => 52 합을 구하기
// 예시 : cyworld 의 합 100이 되고, abcd 는 10이 된다.
// 단어 20자 이하 / 소수 단어인 경우 It is a prime word. 아닌 경우 It is not a prime word.
public class PrimeEx2 {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 문자를 더해서 총 합계를 만드는 변수
        boolean isPrime = true; // 소수인 상태를 기본값 설정
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        System.out.println("합 : " + sum);
        // 소수인지 아닌지 판별하기, 1은 소수 정하기로 정했기 때문에 조건에서 제외
        for(int i = 2; i < sum; i++) {
            if(sum % i == 0) isPrime = false; // 나누어지면 소수가 아님
        }
        if(isPrime) System.out.println("If is a prime word.");
        else System.out.println("It is not a prime word.");
        }
    }

