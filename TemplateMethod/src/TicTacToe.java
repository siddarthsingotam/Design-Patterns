import java.util.Scanner;

public class TicTacToe extends Game {

    private char[][] board;
    private char currentPlayer;

    @Override
    public void initializeGame(int numberOfPlayers) {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
        System.out.println("Let's play Tic Tac Toe!");
        displayBoard();
    }

    @Override
    public boolean endOfGame() {
        return checkWinner() || isBoardFull();
    }

    @Override
    public void playSingleTurn(int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player " + currentPlayer + ", enter your move (row[1-3] col[1-3]): ");
        int row = scanner.nextInt() - 1;
        int col = scanner.nextInt() - 1;

        while (!isValidMove(row, col)) {
            System.out.println("Invalid move! Try again.");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        }

        board[row][col] = currentPlayer;
        displayBoard();
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    @Override
    public void displayWinner() {
        if (checkWinner()) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }

    private boolean checkWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
