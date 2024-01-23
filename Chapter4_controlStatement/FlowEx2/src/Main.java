import java.util.*;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하시오 > ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        if(score >= 90){
            grade = 'A';
        }
        else if(score >= 80) {  //if로 변환시 80 <= score && score <= 90 으로 바뀜
            grade = 'B';
        }
        else if(score >= 70) {
            grade = 'C';
        }
        else {
                grade = 'F';
        }

        System.out.printf("성적은 " + grade + "입니다.");
    }
}