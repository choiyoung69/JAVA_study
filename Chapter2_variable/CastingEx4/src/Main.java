//정수 -> 실수 casting과
//실수 -> 정수 casting 연습
public class Main {
    public static void main(String[] args) {
        int i = 91234567;
        float f = (float)i; //8자리 정수이므로 오차 생김
        int i2 = (int)f;

        double d = (double)i;  //8자리 모두 제대로 저장됨
        int i3 = (int)d;

        float f2 = 1.666f;
        int i4 = (int)f2;

        System.out.printf("i = %d%n", i);
        System.out.printf("f = %f, i2 = %d%n", f, i2);
        System.out.printf("d = %f, i3 = %d%n", d, i3);
        System.out.printf("(int)%f = %d%n", f2, i4);
    }
}