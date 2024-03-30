//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    class InstanceInner{
        int iv = 100;
        //static int cv = 100;
        static final int CONST = 100;
    }
    class ClassInner{
        int iv = 200;
        static int cv = 200;
    }

    void method(){
        class LocalInner{
            int iv = 300;
            //static int cv = 300;
            final static int CONST = 300;
        }
    }
    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(ClassInner.cv);
    }
}