// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Car{
	String color;
	int door;

	void drive(){
		System.out.println("drive, brrr ~~~");
	}
	void stop(){
		System.out.println("stop!!!!!");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("water!!!!!!!!!!!!!");
	}
}

public class Main {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = new FireEngine();

		fe.water();
		car = fe;
		//car.water;    car 타입의 참조변수로는 FireEngine의 멤버를 참조할 수 없다
		fe2 = (FireEngine)car; //자손 = 조상 이기 때문에 형변환 필요, car이 FireEngine의 인스턴스를 가리키고 있기 때문에 에러 없음
		fe2.water();
	}
}