// 두 변수를 교환하는 코드
// 임시 저장소를 사용한다.
public class Main {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp;

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x: " + x + " y: " + y);
    }
}