import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        for(int i = 0; i < inputString.length(); i++){
            char check = inputString.charAt(i);
            if (Character.isUpperCase(check)) {
                inputString[i] = Character.toLowerCase(check);
            }
            else{
                inputString.charAt(i) = Character.toUpperCase(check);
            }
        }
    }
}