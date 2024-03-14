//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Tv{
    String color;
    boolean power;
    int channel;

    void power(){power = !power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}
}

public class Main {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}