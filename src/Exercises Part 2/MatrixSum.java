public class MatrixSum {

    //Program that calculates the sum of two matrices
    public static void main(String[] args) {
        System.out.println("---------------------");

        int[][] matrixA = {{2, 5, 4}, {5, 8, 3}};
        int[][] matrixB = {{6, 4, 7}, {1, 5, 2}};

        int rows = 2, columns = 3;
        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("The sum of the 2 matrices:");
        for (int[] row : sumMatrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
