package exercises.beta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixTranspose {

    /* Program that transposes a matrix from the user's input
    Transpose a matrix is to turn the lines into columns
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("What are the dimensions m x n of your matrix?");
            System.out.print("The number of rows (m): ");
            int lines = scanner.nextInt();
            System.out.print("The number of columns (n): ");
            int columns = scanner.nextInt();

            int[][] myMatrix = new int[lines][columns];
            System.out.println("""
                    The elements of the matrix.
                    From left to right. Top to bottom:""");

            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < columns; j++) {
                    myMatrix[i][j] = scanner.nextInt();
                }
                System.out.println();
            }
            int[][] transpose = transposeMatrix(myMatrix, lines, columns);
            printMatrix(transpose);
        } catch (InputMismatchException e) {
            System.err.format("%s: wrong type of input%n", e);
        }
    }

    private static int[][] transposeMatrix(int[][] matrix, int lines, int columns) {
        int[][] transpose = new int[columns][lines];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("The transpose of your matrix:");
        for (int[] verticals : matrix) {
            for (int horizon : verticals) {
                System.out.print(horizon + "\t");
            }
            System.out.println();
        }
    }
}
