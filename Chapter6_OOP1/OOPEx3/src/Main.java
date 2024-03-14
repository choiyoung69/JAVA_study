//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("카드의 가로는 " + Card.width + "이다.");
        Card.width = 90;
        System.out.println("카드의 가로는 " + Card.width + "이다.");

        Card c1 = new Card();
        c1.height = 300;

        Card c2 = new Card();
        System.out.println("c2의 세로는 " + c2.height + "이다.");
    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 400;
}