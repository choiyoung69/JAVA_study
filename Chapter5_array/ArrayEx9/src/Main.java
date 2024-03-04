// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] name = {"Kim", "Park", "Yi"};

        for(int i = 0; i < name.length; i++){
            System.out.println("name[" + i + "] : " + name[i]);
        }

        String tmp = name[2];
        System.out.println("tmp : " + tmp);
        name[0] = "Yu";

        for(String str:name){
            System.out.println(str);
        }
    }
}