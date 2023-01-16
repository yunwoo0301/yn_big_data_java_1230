package 접근제한자;

public class ParentRest {
    public String name; // public : 누구나 접근 가능
    protected String money; // protected : 동일 패키지와 다른 패키지의 상속 관계가 있으면 접근 가능
    String addr; // default : 접근 제한자는 동일 패키지 내에서 접근 가능
    public ParentRest() { // 생성자는 거의 모든 경우 public 으로 생성
        name = "곰돌이사육사";
        money = "100억";
        addr = "서울 영등포구";


    }

}
