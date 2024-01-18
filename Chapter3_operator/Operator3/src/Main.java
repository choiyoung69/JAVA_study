public class Main {
    public static void main(String[] args) {
        int a = 1_000_000;  // 10^6
        int b = 2_000_000;  // 10^6

        long c = a * b;    // int형식으로 최종 계산된다음 형반환
        long c1 = (long)a * b;  //long 형식으로 최종 계종계산된다음에 c1에 저장

        System.out.println(c);
        System.out.println(c1);
    }
}