public class Main {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;


        System.out.printf("10.0 == 10.0f  %b%n", 10.0 == 10.0f); //오차 허용범위라서 오류 안남
        System.out.printf("0.1 == 0.1f  %b%n", 0.1 == 0.1f);  //오차 허용범위 아니라서 오류남
        System.out.printf("f = %19.17f%n", f);
        System.out.printf("d = %19.17f%n", d);
        System.out.printf("d2 = %19.17f%n", d2);

        System.out.printf("d==f  %b%n", d == f);    //f를 double로 바꿔봤자 뒤에 0만 채워지는 것이여서 서로 다름
        System.out.printf("d==d2  %b%n", d == d2);  //마찬가지로 f형식 뒤에 0만 채운 거므로 서로 다름
        System.out.printf("d2==f  %b%n", d2 == f);  //f 뒤에 0붙인거랑  f는 값이 같음
        System.out.printf("(float)d==f  %b%n", (float)d == f);  //double을 f까지 자르면 뒷부분은 같은 오차 발생
    }
}