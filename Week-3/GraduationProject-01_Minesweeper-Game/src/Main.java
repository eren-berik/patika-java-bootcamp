import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Minesweeper game = new Minesweeper();
        int rows, cols, moves = 0;

        do {
            System.out.print("Enter number of rows: ");
            rows = sc.nextInt();

            System.out.print("Enter number of columns: ");
            cols = sc.nextInt();

            if (!game.isGameBoardValid(rows, cols)) {
                System.out.println("Invalid game board dimensions. Size must be greater or equal to 2x2");
            }
        } while (!game.isGameBoardValid(rows, cols));

        int mineCount = rows * cols / 4;
        String[][] gameBoard = game.createTheGameBoard(rows, cols, mineCount);
        String[][] maskedGameBoard = game.maskGameBoard(gameBoard);

        if (gameBoard == null) {
            System.out.println("Something went wrong :( Please restart the program.");
            return;
        }

        System.out.println("Original Game Board");
        game.printTheGameBoard(gameBoard);

        System.out.println("Masked Game Board");
        game.printTheGameBoard(maskedGameBoard);

        while (true) {
            System.out.print("\nEnter the row: ");
            int row = sc.nextInt();

            System.out.print("Enter the column: ");
            int col = sc.nextInt();

            if (!game.isCoordinateWithinGameBoard(maskedGameBoard, row, col)) {
                System.out.println("Coordinates are out of game board. Current board size is " + gameBoard.length + "x" + gameBoard[0].length);
                continue;
            }

            if (game.hasCoordinateMine(gameBoard, row, col)) {
                System.out.println("Booomm! Game Over!");
                break;
            }

            if (game.isVisited(maskedGameBoard, row, col)) {
                System.out.println("Coordinate already visited. Please enter a different coordinate");
                continue;
            }

            int surroundingMineCount = game.countSurroundingMines(gameBoard, row, col);
            game.insertCountOfMines(maskedGameBoard, row, col, surroundingMineCount);
            game.printTheGameBoard(maskedGameBoard);
            moves++;

            if (game.isWin(rows, cols, mineCount, moves)) {
                System.out.println("\nYOU WON !!");
                break;
            }
        }
    }
}
