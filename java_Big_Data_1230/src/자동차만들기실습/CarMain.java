package 자동차만들기실습;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역을 선택하세요 [1]부산 [2]대전 [3]강릉 [4]광주");
        int loc = sc.nextInt();
        System.out.print("이동할 승객 수를 입력하세요");
        int personNum = sc.nextInt();
        System.out.println("이동차량을 선택하세요 [1]스포츠카 [2]승용차 [3]버스");
        int vhc = sc.nextInt();
        switch (vhc) {
            case 1 : SportsCar sportsCar = new SportsCar("스포츠카");
            case 2 : MiNi mini = new MiNi("승용차");
            case 3 : Bus bus = new Bus("버스");
            default: System.out.println("차량 선택이 잘못 되었습니다.");
        }





    }

}

