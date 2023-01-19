package 싱글톤;
// 싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장하는 방법
// 사용하는 이유 : 메모리의 효율성과 데이터 공유의 이첨이 있음
// 단점 : 구현이 까다로움, 데이터의 무결성이 깨질 수 있음(멀티스레드에서 사용 시 동기화(Synchronized)가 필요)
public class singletonMain {
    public static void main(String[] args) {
       ReferenceTest1 ref1 = new ReferenceTest1();
       ReferenceTest2 ref2 = new ReferenceTest2();
       ref1.setInfo("안유진", 21);
       ref2.viewInfo();
    }
}
