// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());

		System.out.println(b.money);
		System.out.println(b.bonusPoint);
	}
}

class Product{
	int price;
	int bonusPoint;

	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		this(100);
	}
	Tv(int price){
		super(price);
	}

	public String toString() {return "TV";}
}

class Computer extends Product{
	Computer(){
		this(200);
	}
	Computer(int price){
		super(price);
	}

	public String toString() { return "Computer "; }
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product P){
		if(money < P.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= P.price;
		bonusPoint += P.bonusPoint;
		System.out.println(P + "를 구입하셨습니다.");
	}
}