package 시간입력;

import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 클론(:) 기준을 입력) 문자열 만들고
// 출력 : 오후 11시 005분 03초 시분초를 잘라야함
public class TimesSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간 입력 : ");
        String times = sc.next();
        String[] splitTime = times.split(":"); //split 콜론을 이용해 문자열 배열이 0 1 2로 나뉘어짐
        int intHour = Integer.parseInt(splitTime[0]);
        int intMin = Integer.parseInt(splitTime[1]);
        int intSec = Integer.parseInt(splitTime[2]);


        if (intHour > 11) { //
            intHour -= 12;
            System.out.printf("오후 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);//2자리로 잡음 2자리가 안될 시 0으로 채움
        } else {
            System.out.printf("오전 %02d시 %02d분 %02d초\n", intHour, intMin, intSec);

        }
    }
}
