package exercises.beta;

public class MatrixMultiplication {

    // Program to calculate the multiplication of 2 matrices
    public static void main(String[] args) {
        int rowsA = 2, columnsA = 3;
        int columnsB = 2;
        int[][] matrixA = {{3, -2, 5}, {3, 0, 4}};
        int[][] matrixB = {{2, 3}, {-9, 0}, {0, 4}};
        int[][] result = multiplyMatrix(matrixA, matrixB, rowsA, columnsA, columnsB);
        printResult(result);
    }

    private static int[][] multiplyMatrix(int[][] matrixA,
                                          int[][] matrixB,
                                          int rowsA,
                                          int columnsA,
                                          int columnsB) {

        int[][] matrixProduct = new int[rowsA][columnsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    matrixProduct[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixProduct;
    }

    private static void printResult(int[][] product) {
        System.out.println("Multiplication of two matrices is:");
        for (int[] row : product) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
}
