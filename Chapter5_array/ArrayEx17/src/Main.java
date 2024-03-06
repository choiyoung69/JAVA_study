
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[][] wordList = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"cup", "컵"}
        };
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < wordList.length; i++){
            System.out.printf("Q%d. %s의 뜻은? ", i+1, wordList[i][0]);

            String answer = scanner.nextLine();

            if(answer.equals(wordList[i][1])){
                System.out.println("정답입니다.");
            }
            else{
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n", wordList[i][1]);
            }
        }
    }
}