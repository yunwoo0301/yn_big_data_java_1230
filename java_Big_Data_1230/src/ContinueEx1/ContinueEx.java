package ContinueEx1;

public class ContinueEx {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if(i % 3 == 0) continue;
            System.out.println(i);

        }
    }
}
