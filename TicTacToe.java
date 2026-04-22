import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // ===== UC1: Create Board =====
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println("Initial Board:");
        printBoard(board);

        // ===== UC2: Toss Logic =====
        Random rand = new Random();
        int toss = rand.nextInt(2); // 0 or 1

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol, player2Symbol;
        String currentPlayer;
        char currentSymbol;

        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
            currentSymbol = player1Symbol;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
            currentSymbol = player2Symbol;
        }

        // ===== Display Results =====
        System.out.println("\nToss Result:");
        System.out.println(currentPlayer + " starts first!");

        System.out.println(player1 + " symbol: " + player1Symbol);
        System.out.println(player2 + " symbol: " + player2Symbol);

        System.out.println("\nCurrent Turn: " + currentPlayer + " (" + currentSymbol + ")");
    }

    // Separate method → clean design
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
