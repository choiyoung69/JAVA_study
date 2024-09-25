// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();

		System.out.println(p.x);
		System.out.println(p.y);
		p.method();
		p.method2();

		System.out.println(c.x);
		System.out.println(c.y);
		c.method();
		c.method2();


	}
}

class Parent{
	int x = 100;
	static int y = 1;

	void method(){
		System.out.println("Parent instance Method");
	}
	static void method2(){
		System.out.println("Parent static method");
	}
}

class Child extends Parent{
	int x = 200;
	static int y = 2;

	void method(){
		System.out.println("Child instance method");
	}
	static void method2(){
		System.out.println("Child static method");
	}
}