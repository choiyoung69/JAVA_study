//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] m1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] m2 = {
                {1,2},
                {3,4},
                {5,6}
        };

        final int ROW = m1.length;
        final int COLUMN = m2[0].length;
        final int M1_COLUMN = m1[0].length;

        int[][] m3 = new int[ROW][COLUMN];

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMN; j++){
                for(int k = 0; k < M1_COLUMN; k++){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COLUMN; j++){
                System.out.printf("%3d ", m3[i][j]);
            }
            System.out.println();
        }
    }
}