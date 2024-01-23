import java.util.*;

public class Main {
    public static void main(String[] args) {
        int input = 0;

        System.out.println("숫자를 하나 입력하시오: ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        if (input == 0) {
            System.out.println("입력하신 숫자은 0입니다.");
        }
        if (input != 0) {
            System.out.println("입력하신 숫자는 0이 아닙니다");
        }
    }
}