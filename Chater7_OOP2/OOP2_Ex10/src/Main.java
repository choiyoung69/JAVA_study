// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship ds = new Dropship();
		Marine m = new Marine();

		SCV scv = new SCV();

		scv.repair(tank);
		scv.repair(ds);
		//scv.repair(m);
	}
}

class Unit{
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

interface Repairable {}

class Tank extends GroundUnit implements Repairable{
	Tank() {
		super(150);
		hitPoint = MAX_HP;
	}

	public String toString(){
		return "Tank";
	}
}

class Dropship extends  AirUnit implements Repairable{
	Dropship(){
		super(125);
		hitPoint = MAX_HP;
	}

	public String toString(){
		return "Dropship";
	}
}

class Marine extends GroundUnit {
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit {
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r){
		if(r instanceof Unit){
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP){
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}