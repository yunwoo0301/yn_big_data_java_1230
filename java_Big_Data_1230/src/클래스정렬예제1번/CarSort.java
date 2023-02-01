package 클래스정렬예제1번;
// 자동차 연식으로 정렬하기
public class CarSort implements Comparable<CarSort> {
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }


    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear) {
            return this.modelName.compareTo(o.modelName); // 사전순 정렬(문자열 비교) 뒤가 짧으면 양수
            // 앞의 문자열 사전순으로 뒤에 있으면 양수값 변환
        }
        return this.modelYear - o.modelYear; // 앞이 뒤보다 크면 정렬 (오름차순 정렬)
    }
}
