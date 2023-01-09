package 중첩어레이;
// 2차원 배열에 대해
public class doubleArrayEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int k = 10;
        for(int i = 0; i < arr.length; i++) { // arr.length: 행의 갯수를 알 수 있음 / 2행(0,1) 3열
            for(int j = 0; j < arr[i].length; j++) { // 0행의 3열, 1행의 3열 모두 뜻함
                arr[i][j] = k; //i의 0번째 j의 0번째
                k += 10;
            }
            }
        for(int[] row : arr) { // e는 행을 뜻하므로 성립x 행에 대한 배열 row를 넣음
            for(int e : row) System.out.print(e + " ");
            System.out.println();

    }

}
    }
