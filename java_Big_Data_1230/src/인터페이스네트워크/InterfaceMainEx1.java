package 인터페이스네트워크;

import java.util.Scanner;

public class InterfaceMainEx1 {
    public static void main(String[] args) {
        NetworkAdapter adapter = null; // 참조 변수 타입이기 때문에 초기값인 null임
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택 하세요 [1]WiFi [2]5G [3]LTE : ");
        int num = sc.nextInt();
        switch (num) {
            case 1 :
                adapter = new WiFi("KT Megapass");
                break;
            case 2 :
                adapter = new fiveG("SK Telecom");
                break;
            case 3 :
                adapter = new LTE("LG U+");
                break;
            default :
                System.out.println("네트워크를 잘못 선택 하였습니다.");
        }
        adapter.connect();

    }
}
