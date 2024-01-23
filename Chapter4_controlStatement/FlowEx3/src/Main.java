import java.util.*;

public class Main {
    public static void main(String[] args) {
        int month = 0;

        System.out.printf("현재 달을 입력하세요 > ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        month = Integer.parseInt(tmp);

        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("계절을 봄입니다");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("계절을 여름입니다");
                break;
            case 7: case 8: case 9:
                System.out.println("계절을 가을입니다");
                break;
            case 10: case 11: case 12:
                System.out.println("계절을 겨울입니다");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}