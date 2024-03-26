// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();

		if(fe instanceof FireEngine){
			System.out.println("This is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instace");
		}
		if(fe instanceof Object) System.out.println("This is a Object instance");
		Car car = null;
		if(car instanceof FireEngine) System.out.println("THis is a FireEngine instace");
	}
}

class Car{}
class FireEngine extends Car {}