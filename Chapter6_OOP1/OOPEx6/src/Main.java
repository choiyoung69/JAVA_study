//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Car{
    String color;
    String gearType;
    int door;

    Car(){
        this("white", "auto", 4);
    }
    Car(String color){
        this(color, "auto", 4);
    }
    Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");
        Car c3 = new Car("red", "auto", 5);

        System.out.println("c1의 color는 " + c1.color + ", gearType은 " + c1.gearType
                        + "door = " + c1.door);
        System.out.println("c2의 color는 " + c2.color + ", gearType은 " + c2.gearType
                + "door = " + c2.door);
        System.out.println("c3의 color는 " + c3.color + ", gearType은 " + c3.gearType
                + "door = " + c3.door);

    }
}