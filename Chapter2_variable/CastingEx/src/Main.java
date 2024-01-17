//형 변환 연습
public class Main {
    public static void main(String[] args) {
        int i = 10;
        byte b = (byte)i; //int를 byte로 형변환
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b); //10은 byte도 표현할 수 있기 때문에 값 손실 없음

        i = 300;
        b = (byte)i;  //byte의 표현범위가 -128 ~ 127이므로 값 손실 발생
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        b = 10;
        i = (int)b; // 작은 타입에서 큰 타입으로 변환
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        b = -2;
        i = (int)b; // 작은 타입에서 큰 타입으로 변환
        System.out.printf("[int -> byte] i = %d -> b = %d%n", i, b);

        System.out.println("i="+Integer.toBinaryString(i));  //2진수로 표현된 값을 문자열로 표현
        //i가 음수이므로 1의 값으로 채워진 것을 확인할 수 있다.

    }
}