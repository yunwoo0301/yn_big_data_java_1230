package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("정연우", DevType.EMBEDDED, Career.SENIOR, Gender.FEMALE);
        developer.devInfo();

        Developer developer1 = new Developer("곰돌이", DevType.DBA, Career.JUNIOR, Gender.FEMALE);
        developer.devInfo();
    }
}
