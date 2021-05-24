public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
                // 2 rows 3 col
        };
        int[][] m2 = {
                {7, 8},
                {9, 10},
                {11, 12}
                // 3 rows 2 col
        };
        // the num of col of first matrix match with the number of rows in the sceond matrix then multliplication possible
        int sum = 0;
        int[][] r = new int[2][2];
        for (int i = 0; i < 2; i++) {
            // the number of rows in the first matrix thats why i<2
            for (int j = 0; j < 2; j++) {
                // the number of col in the first matrix thats why i<2
                for (int k = 0; k < 3; k++) {
                    // K Depends Upon The Number Of Columns Of The First Matrix or The Number Of rows Of The Second Matrix
                    sum = sum + m1[i][k] * m2[k][j];
                }
                r[i][j] = sum;
                sum = 0;

            }
        }
        // For Loop For Printing
        for (int h = 0; h<2 ; h++ ){
            for (int y = 0; y<2 ; y++ ){
                System.out.print(r[h][y] +" ");
            }
            System.out.println();
        }
    }
}
