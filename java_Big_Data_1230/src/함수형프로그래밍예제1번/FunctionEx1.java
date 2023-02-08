package 함수형프로그래밍예제1번;
// 함수형 프로그래밍이란? 자바8에서 도입, 수학공식과 유사함,불변성의 원칙, 조건문,반복문 사용 금지 등의 특징을 가짐
// 람다(Lambda) : 화살표 표현식으로 사용됨. 생략 가능한 모든 것을 생략하는 것을 기본원칙으로 합니다.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재할 수 없으므로 함수형 인터페이스가 필요합니다.
@FunctionalInterface // 함수형 인터페이스 : 메소드 1개만 올 수 있음! <-> 여러 개의 메소드 가능
interface Calculator {
    int sum(int a, int b); // 함수형 선언
}
@FunctionalInterface
interface MyFuncInterface {
    void method(int x); // 매개변수가 있는 타입
}
@FunctionalInterface
interface MyFuncInterface2 {
    int min(int x, int y); // 반환타입이 있는 형식
}

public class FunctionEx1 {
    public static void main(String[] args) {
//        Calculator mc =(a, b) -> a + b; // 함수형 프로그래밍 구현 방식(선언)
//        int rst = mc.sum(3,4); // 매개변수(a,b) 호출
//        System.out.println(rst);
//        MyFuncInterface fi = x -> { // 매개변수 : x
//          int result = x * 5;
//          System.out.println(result);
//        }; // 선언부
//        fi.method(2);
        MyFuncInterface2 fi = (x,y) -> x < y ? x : y; // 구현부
        System.out.println(fi.min(3,4));
    }
}

