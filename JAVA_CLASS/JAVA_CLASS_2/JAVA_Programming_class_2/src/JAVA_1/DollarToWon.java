//Daller to WON  System인데 사용자로부터 입력을 받아야 함
package JAVA_1;

import java.util.Scanner;

public class DollarToWon {
	static final int USD_1 = 1100;

	int KRW;

	double dollar;

	// 생성자로 만들어야 할까 ? 아니면 일반 메소드로??
	//멤버를 초기화하는 거니까 생성자로 만들자 ! 
	DollarToWon(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input KRW >> ");
		KRW = sc.nextInt();

		dollar = KRW / (double)USD_1;
	}

	void showDollar(){
		System.out.print(KRW + " KRW is " + dollar + " USD");
	}
}