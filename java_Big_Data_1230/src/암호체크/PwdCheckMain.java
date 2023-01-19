package 암호체크;
import java.util.Scanner;

public class PwdCheckMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PwdCheckClass pwdCheck = new PwdCheckClass();
        String pwd; // 암호를 입력 받는 변수 선언
        while(true) {
            System.out.print("암호 입력 : ");
            pwd = sc.next();

            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;

            if (!pwdCheck.validLength(pwd)) {
                System.out.println("Bad Length password");
                continue;
            }
            if(!pwdCheck.validNumber(pwd)) {
                System.out.println("Bad Number password");
                continue;
            }
            if(!pwdCheck.validLowerAlphabet(pwd)) {
                System.out.println("Bad Lower Alphabet password");
                continue;
            }
            if(!pwdCheck.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper Alphabet password");
                continue;
            }
            if(!pwdCheck.validRex(pwd)) {
                System.out.println("Bad validRex password");
                continue;
            }
            System.out.println("Good password");

        }

    }


}


