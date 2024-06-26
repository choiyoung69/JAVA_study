// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child extends Parent implements MyInterface, MyInterface2{
	public void method1() {
		System.out.println("method1() in Child class");
	}
}

class Parent{
	public void method2(){
		System.out.println("method2 in Parent class");
	}
}

interface MyInterface {
	default void method1 () {
		System.out.println("method1() in MyInterface");
	}
	default void method2 () {
		System.out.println("method1() in MyInterface");
	}
	static void staticMethod () {
		System.out.println("staticMethod in MyInterface");
	}
}

interface MyInterface2{
	default void method1(){
	System.out.println("method1() in MyInterface2");
	}
	static void staticMethod () {
		System.out.println("staticMethod in MyInterface");
	}

}