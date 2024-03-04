// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for(int i = 0; i < numArr.length; i++){
			numArr[i] = (int)(Math.random() * 10);
			System.out.print(numArr[i]);
		}
		System.out.println();

		for(int i = 0; i < numArr.length; i++){
			counter[numArr[i]]++;
		}
		for(int i = 0; i < counter.length; i++){
			System.out.println((i + "의 개수 : " + counter[i]));
		}
	}
}