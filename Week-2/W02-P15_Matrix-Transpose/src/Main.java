import java.util.Scanner;

/**
 * This program prompts the user to input the number of rows and columns for a 2D matrix.
 * It then creates the original matrix based on the user input and prints it.
 * After that, it calculates and prints the transpose of the original matrix.
 */


public class Main {
    public static void main(String[] args) {
        int row, col;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row(s): ");
        row = sc.nextInt();

        System.out.print("Enter the number of column(s): ");
        col = sc.nextInt();

        int[][] originalMatrix = create2dMatrix(row, col);
        System.out.println("Original matrix: ");
        print2dMatrix(originalMatrix);

        System.out.println("Transposed matrix: ");
        print2dMatrix(transposeMatrix(row, col, originalMatrix));
    }

    public static int[][] create2dMatrix(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter [" + i + "][" + j + "] element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static int[][] transposeMatrix(int row, int col, int[][] arr) {
        int[][] transposeMatrix = new int[col][row];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                transposeMatrix[j][i] = arr[i][j];
            }
        }

        return transposeMatrix;
    }

    public static void print2dMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}