//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            short sMin = -32768;
            short sMax = 32767;

            char cMin = 0;
            char cMax = 65535;

            System.out.println(sMin);
            System.out.println((short)(sMin - 1)); //(short)를 안해줄 경우 int 형식으로 바꿔서 출력
            System.out.println(sMax);
            System.out.println((short)(sMax + 1));
            System.out.println((int)cMin);
            System.out.println((int)--cMin);
            System.out.println((int)cMax);
            System.out.println((int)++cMin);

    }
}