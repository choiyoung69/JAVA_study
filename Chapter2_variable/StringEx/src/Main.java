// 문자열 관련 실습

public class Main {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b = %d%n", b);  //1로 예상
        System.out.printf("s = %d%n", s);  //2로 예상
        System.out.printf("c = %c, %d %n", c, (int)c);  //A로 에상, 65로 예상
        System.out.printf("finger = [%5d]%n", finger);   // '   10' 이렇게 출력될 것으로 예상
        System.out.printf("finger = [%-5d]%n", finger);   // '10   ' 이렇게 출력될 것으로 예상
        System.out.printf("finger = [%05d]%n", finger);   // '00010' 이렇게 출력될 것으로 예상
        System.out.printf("big = %d%n", big);   // 100000000000
        System.out.printf("hex = %#x%n", hex);   // 여기서 #은 접두사를 의미한다. 16진수의 경우 0x를 표현하고, 8진수의 경우 0을 표현해준다
                                                    //0xFFFFFFFFFFFFFFFF
        System.out.printf("octNum = %o, %d%n", octNum, octNum);   // 10, 8로 출력
        System.out.printf("hexNum = %x, %d%n", hexNum, hexNum);   // 10, 16로 출력
        System.out.printf("binNum = %s, %d%n", Integer.toBinaryString(binNum), binNum);   // 10, 2로 출력
        
    }
}