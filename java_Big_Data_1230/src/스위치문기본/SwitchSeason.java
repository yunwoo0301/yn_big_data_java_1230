package 스위치문기본;

import java.util.Scanner;

// 스위치문은 조건문이며, 스위치에는 조건식(비교,논리연산)은 올 수 없고 조건에 대한 변수만 올 수 있음.
// 변수는 정수, 문자, 문자열만 사용 가능
// 스위치의 각 케이스를 끝내기 위해서는 반드시 break문이 필요
// 해당하는 케이스가 없는 경우를 위해 defalut문이 필요
public class SwitchSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절을 입력하세요 : ");
        String season = sc.next(); // 공백 기준으로 문자열을 입력 받음
        switch(season) {
            case "spring" : case "SPRING" :  // ;이 아님
                System.out.println("꽃이 피는 봄이 왔어요^^*");
                break;
            case "summer" : case "Summer" :
                System.out.println("무더운 여름 입니다.");
                break;
            case "fall" : case "FALL" : case "autumn" : case "AuTUMN" :
                System.out.println("쓸쓸한 가을 입니다.");
                break;
            case "winter" : case "WINTER" :
                System.out.println("아직 추운 겨울 입니다. ㅠㅠㅠㅠㅠ");
                break;
            default :
                System.out.println("계절을 잘못 입력하셨습니다.");





        }

    }
}
