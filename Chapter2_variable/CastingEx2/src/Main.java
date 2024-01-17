//Casting 연습2
public class Main {
    public static void main(String[] args) {
        float f = 9.1234567f;
        double d = 9.1234567;
        double d2 = (double)f;

        System.out.printf("f = %20.18f", f);  //  ' 9.123456~~~~~~~~~~~~~' 예상
        //원래라면 소수점 6번째 자리까지 구해졌겠지만, 20.18f이므로 유효 숫자 이후부터 오차 발생
        System.out.printf("d = %20.18f", d);  //  ' 9.1234567000000.....0' 예상
        //double 형식이 15자리까지 유효하므로 제대로 저장되고 그 이후로 0을 채워짐
        System.out.printf("d2 = %20.18f", d2); // ' 9.123456~~~~~~~~~~~~'
        //float에서 저장된 이상한 값이 15자리까지 유효하게 저장되고 그 뒤의 값도 저장됨.

    }
}