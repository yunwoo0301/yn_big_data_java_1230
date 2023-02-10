package 성능향상보조스트림;
import java.io.*;
public class AssistStreamEx1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null; // 입력에 대한 보조 스트림
        BufferedOutputStream bos = null; // 출력에 대한 보조 스트림

        int data = -1; // 더이상 읽을 데이터가 없음을 의미함.
        long start = 0; // 경과시간 계산을 위한 변수
        long end = 0; // 경과시간 계산을 위한 변수

//        fis = new FileInputStream("src/성능향상보조스트림/puppy.jpg"); //파일 경로 익히기!
//        bis = new BufferedInputStream(fis);
//        fos = new FileOutputStream("clonepuppy.jpg");
//        start = System.currentTimeMillis(); // 1970년 1월1일 0시0분0초로부터
//        // 현재까지 경과시간을 밀리초로 표시
//        while((data = bis.read()) != -1) {
//            fos.write(data); // 실제 작성하는데 경과되는 시간
//        }
//        fos.flush();
//        end = System.currentTimeMillis();
//        fos.close();
//        bis.close();
//        fis.close();
//        System.out.println("버퍼 사용을 하지 않는 시간 : " +(end - start) + "ms");


        fis = new FileInputStream("src/성능향상보조스트림/puppy.jpg"); //파일 경로 익히기!
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("clonepuppy.jpg");
        bos = new BufferedOutputStream(fos);
        start = System.currentTimeMillis();
        while((data = bis.read()) != -1) {
            fos.write(data);
        }
        bos.flush();
        end = System.currentTimeMillis();
        bos.close();
        fos.close();
        bis.close();
        fis.close();
        System.out.println("버퍼 사용률 사용하는 경우 " +(end - start) + "ms");
    }
}
