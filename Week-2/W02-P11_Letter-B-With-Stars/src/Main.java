/**
 * This program draws the letter 'B' using a 2D array of strings.
 *
 * Loops Explanation:
 *
 * 1. Outer Loop (for i): This loop iterates over the rows of the 2D array representing the letter 'B'.
 *    - It iterates from 0 to 6 (inclusive) because the letter 'B' has 7 rows.
 *
 * 2. Inner Loop (for j): This loop iterates over the columns of each row in the 2D array.
 *    - It iterates from 0 to 3 (inclusive) because the letter 'B' has 4 columns.
 *
 * Inside the nested loops:
 *
 * 3. Conditionals:
 *    - The first conditional (if i == 0 || i == 3 || i == 6) checks if the current row is the top, middle, or bottom row of the letter 'B'.
 *    - The second conditional (else if j == 0 || j == 3) checks if the current column is the first or last column of the letter 'B'.
 *
 *    - If either of the conditions is true, the corresponding element in the 2D array is set to " * ", indicating a part of the letter 'B'.
 *    - Otherwise, the element is set to "   ", indicating an empty space.
 *
 * 4. Printing:
 *    - After filling the 2D array with the appropriate characters, another set of nested loops is used to print each element of the array.
 *    - This printing loop iterates over each row and column of the array and prints the corresponding element.
 *    - After printing all elements of a row, a new line is printed to move to the next row.
 */


public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        drawLetterB(letter);
    }

    public static void drawLetterB(String[][] letter) {

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}