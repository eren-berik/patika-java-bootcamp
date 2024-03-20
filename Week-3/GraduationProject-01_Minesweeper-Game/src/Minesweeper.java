import java.util.Objects;
import java.util.Random;

public class Minesweeper {

    public String[][] createTheGameBoard(int row, int col, int mines) {
        String[][] gameBoard = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gameBoard[i][j] = "-";
            }
        }

        deployMines(gameBoard, mines);

        return gameBoard;
    }

    private void deployMines(String[][] gameBoard, int mines) {
        Random rand = new Random();
        int deployedMines = 0;

        while (deployedMines < mines) {
            int row = rand.nextInt(gameBoard.length);
            int col = rand.nextInt(gameBoard[0].length);

            if (!gameBoard[row][col].equals("*")) {
                gameBoard[row][col] = "*";
                deployedMines++;
            }
        }
    }

    public boolean hasCoordinateMine(String[][] gameBoard, int row, int col) {
        return gameBoard[row][col].equals("*");
    }

    public String[][] maskGameBoard(String[][] gameBoard) {
        String[][] maskedGameBoard = new String[gameBoard.length][gameBoard[0].length];

        // Mask the game board
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (gameBoard[i][j].equals("*")) {
                    maskedGameBoard[i][j] = "-";
                } else {
                    maskedGameBoard[i][j] = gameBoard[i][j];
                }
            }
        }

        return maskedGameBoard;
    }

    public void insertCountOfMines(String[][] gameBoard, int row, int col, int count) {
        gameBoard[row][col] = Integer.toString(count);
    }

    public void printTheGameBoard(String[][] gameBoard) {
        // Print column numbers
        System.out.print("\t");
        for (int j = 0; j < gameBoard[0].length; j++) {
            System.out.print(j + "\t");
        }
        System.out.println();

        // Print game board with row numbers
        for (int i = 0; i < gameBoard.length; i++) {
            // Print row numbers
            System.out.print(i + "\t");

            // Print cells
            for (String cell : gameBoard[i]) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
        System.out.println("=========================");
    }

    public int countSurroundingMines(String[][] gameBoard, int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            if (i < 0 || i > gameBoard.length - 1) {
                continue;
            }

            for (int j = col - 1; j <= col + 1; j++) {
                if (j < 0 || j > gameBoard[0].length - 1) {
                    continue;
                }

                if (Objects.equals(gameBoard[i][j], "*")) {
                    count++;
                }
            }

        }

        return count;
    }

    public boolean isWin(int rows, int cols, int mineCount, int moves) {
        return ((moves + mineCount) == (rows * cols));
    }

    public boolean isVisited(String[][] gameBoard, int row, int col) {
        return !(gameBoard[row][col].equals("-"));
    }

    public boolean isCoordinateWithinGameBoard(String[][] gameBoard, int row, int col) {
        return (row < gameBoard.length && col < gameBoard[0].length);
    }

    public boolean isGameBoardValid(int row, int col) {
        return row >= 2 && col >= 2;
    }
}
