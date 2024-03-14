//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Document{
    static int count = 0;
    String name = "";

    Document(){
        this("제목없음" + ++count);
    }
    Document(String name){
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document();
        Document d3 = new Document("HI");
        Document d4 = new Document();
    }
}