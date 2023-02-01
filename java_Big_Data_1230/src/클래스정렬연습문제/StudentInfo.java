package 클래스정렬연습문제;

import java.util.Comparator;

public class StudentInfo implements Comparator<StudentInfo> {
    String name;
    int score;
    String number;

    public StudentInfo(String name, int score, String number) {
        this.name = name;
        this.score = score;
        this.number = number;
    }

    @Override
    public int compare(StudentInfo o1, StudentInfo o2) {
        if(o1.score == o2.score) {
            return o1.number.compareTo(o2.number);
        }
        return o2.score - o1.score; // 큰값부터 작은 값 순서로 정렬하는 내림차순

    }
}
