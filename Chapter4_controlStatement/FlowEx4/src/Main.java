import java.util.*;

public class Main {
    public static void main(String[] args) {
        int user = 0, com = 0;

        System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하시오 > ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        user = Integer.parseInt(tmp);
        com = (int)(Math.random() * 3 + 1);
        System.out.println("당신은 " + user + "입니다.");
        System.out.println("컴퓨터는 " + com + "입니다.");

        switch(user - com){
            case 2: case -1:
                System.out.println("당신이 졌습니다.");
                break;
            case -2: case 1:
                System.out.println("당신이 이겼습니다.");
                break;
            default:
                System.out.println("무승부입니다.");
                break;
        }
    }
}