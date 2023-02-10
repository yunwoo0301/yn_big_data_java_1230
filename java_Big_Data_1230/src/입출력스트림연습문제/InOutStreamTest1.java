package 입출력스트림연습문제;
import java.io.*;
import java.util.Scanner;
import java.util.TreeSet;
public class InOutStreamTest1 {
    public static void main(String[] args) throws IOException {
        // 적절한 위치에 이름과 성적 파일 생성 >> file : Score 따로 생성 후 내용 복붙
        // 1. 이름과 3개의 성적을 객체 단위로 관리하기 위해 클래스 생성하고 정렬을 위해 Comparable 을 상속받거나 Comparator
        // 2. Comparable 를 상속 받아 정렬 기준에 대한 메소드를 오버라이딩해 정렬에 대한 조건을 구현하거나 Comparator 를 상속 받음
        // 3. 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기(총점이 같으면 이름순으로..)
//      ----------------------------------------------------------------------------------
        TreeSet<StudentInfo> ts = new TreeSet<>(); // TreeSet<클래스> ts = new TreeSet<>();
        FileInputStream is = new FileInputStream("src/입출력스트림연습문제/score"); // FileInputStream 으로 생성된 파일을 읽기 위한 스트림 생성
        Scanner sc = new Scanner(is); // 3. 파일을 스캐너로 읽어 들이기 위해 스캐너 생성 후 입력으로 스트링 연결
        while (sc.hasNextLine()) { // 읽어 들일 라인이 있으면 true / 4. 스캐너의 hasNextLine() 메소드를 이용해 읽을 라인이 있는 동안 반복 수행(while 문)
            String line = sc.nextLine(); //    스캐너의 NextLine()로 라인별로 문자를 읽어들임(예 : 안유진 98 87 45)
            String[] strArr = line.split(" "); // 공백 기준으로 자르고 이를 문자열 배열에 대입(요소가 4개인 배열 생성)
            ts.add(new StudentInfo(strArr[0], // ts.add(new 클래스(생성));
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3]))); //첫번째 요소는 문자열이기 때문에 변환이 필요없고 나머지는 연산을 위해 Integer.parseInt()로 변환 필요
        }
        for (StudentInfo e : ts) { // 향상된 for 문을 순회하면서 결과 출력
            System.out.println(e.getName() + " : " + e.getTotal());

        }
    }
}



