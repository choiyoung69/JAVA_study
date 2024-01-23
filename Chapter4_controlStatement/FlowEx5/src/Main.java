import java.util.*;

public class Main {
    public static void main(String[] args) {
        int line_count = 0;

        System.out.println("출력할 라인의 개수를 입력하시오 > ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        line_count = Integer.parseInt(tmp);

        for(int i = 0; i < line_count; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}