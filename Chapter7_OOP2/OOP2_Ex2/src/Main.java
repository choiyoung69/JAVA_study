// 자바 프로그래밍 - chapter 7
public class Main {
	public static void main(String[] args) {
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);

		d.shuffle();
		c = d.pick(0);
		System.out.println(c);
	}
}

class Deck{
	static final int CARD_NUM = 52;
	Card[] cardArr = new Card[52];

	Deck(){
		int i = 0;

		for(int k = Card.KIND_MAX; k > 0; k--){
			for(int j = 0; j < Card.NUM_MAX; j++){
				cardArr[i++] = new Card(k, j + 1);
			}
		}
	}
	Card pick(int index){
		return cardArr[index];
	}
	Card pick(){
		int index = (int)(Math.random() * CARD_NUM);
		return cardArr[index];
	}

	void shuffle(){
		for(int i = 0; i < cardArr.length; i++){
			int r = (int)(Math.random() * CARD_NUM);

			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
}

class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card(){
		this(SPADE, 1);
	}

	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}

	public String toString(){
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};

		String numbers = "0123456789XJQK";

		return "kind : "  + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}