// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
	public static void main(String[] args) {
		int[][] score = {
			{100, 100, 100},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		};

		int korTotal = 0, engTotal = 0, mathTotal = 0;

		for(int[] tmp : score){
			int sum = 0;
			float avg = 0.0f;
			korTotal += tmp[0];
			engTotal += tmp[1];
			mathTotal += tmp[2];

			for(int i : tmp){
				sum += i;

				System.out.printf("%5d", i);
			}
			avg = sum / (float)tmp.length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}