//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char ch = 'A';
        int code = ch;

        System.out.printf("%c = %d(%#X) %n", ch, code, code);

        char hch = '가';
        System.out.printf("%c = %d(%#X) %n", hch, (int)hch, (int)hch);

        char aCh = 65;
        int aCode = aCh;

        System.out.printf("%c = %d(%#X) %n", aCh, aCode, aCode);
        System.out.printf("%c", aCode);

    }
}