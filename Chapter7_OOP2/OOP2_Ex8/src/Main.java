// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		Fighter f = new Fighter();

		if(f instanceof Unit){
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}
		if(f instanceof Fightable){
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		}
		if(f instanceof Movable){
			System.out.println("f는 Movalbe 인터페이스를 구현했습니다.");
		}
		if(f instanceof Attackable){
			System.out.println("f는 Movalbe 인터페이스를 구현했습니다.");
		}
		if(f instanceof Object){
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
	}
}


class Fighter extends Unit implements Fightable {
	public void move(int x, int y){

	}
	public void Attack(Unit u){

	}
}

class Unit {
	int currentHp;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {}

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void Attack(Unit u);
}