package 입출력스트림예제6번;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InOutStreamEx6 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 전산이 죽었던 경로에 대한 내용의 원인을 stack 에 담음
        }
        Scanner sc = new Scanner(inputStream);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
