/**
 * Proj5 is a two-player Tic-Tac-Toe game
 *
 * @author Julie Thornton, Austin Heiman
 * @version Project 5
 */

import java.util.*;

public class Proj5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cols = 3;
        int rows = 3;
        char[][] board = new char[cols][rows];
        int[] move = new int[2];

        // count how many moves have been made
        int moves = 0;

        // keep track of whose turn it is
        char turn = 'X';

        // assign initial empty board
        for (int col = 0; col < board.length; col++) {
            for (int row = 0; row < board[col].length; row++) {
                board[col][row] = '_';
            }
        }

        // print the initial empty board
        printBoard(board);

        // keep playing while less than 9 moves
        while (moves < 9) {
            // Ask the user for the row and the column
            move = getMove(turn, board);    // [col, row]
            board[move[0]][move[1]] = turn;

            // If it is valid:
            // place the user's piece (turn) at that spot in the array
            // print the board (copy and paste the loops above that printed
            // the initial board)
            printBoard(board);

            // check for a winner
            boolean win = false;
            for (int i = 0; i < 3; i++) {
                // checks for three in a row
                if (board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2] &&
                    board[i][0] == turn) {
                    // System.out.println("row victory!");
                    win = true;
                }

                // checks for three in a col
                if (board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i] &&
                    board[0][i] == turn) {
                    // System.out.println("col victory!");
                    win = true;
                }
            }

            // check for three on a diagonal (note that there are two diagonals)
            if (turn == board[1][1]) {
                if ((board[0][0] == board[2][2] && board[0][0] == turn) ||
                    (board[0][2] == board[2][0] && board[0][2] == turn)) {
                    // System.out.println("diagonal victory!");
                    win = true;
                }
            }

            // Prints who won
            if (win) {
                // end the game
                System.out.println(turn + " wins!");
                break;
            }

            // switch whose turn it is
            if (turn == 'X')
                turn = 'O';
            else
                turn = 'X';

            // One more move has gone by
            moves++;
        }

        // if moves made it to 9, must be a tie
        if (moves == 9)
            System.out.println("Tie game.");
    }

    private static int[] getMove(char turn, char[][] board) {
        int[] move = new int[2];
        String rowPrompt = String.format("%s, enter row [1-3]: ", turn);
        String colPrompt = String.format("%s, enter column [1-3]: ", turn);
        String takenError = "That spot is taken.";
        String badInputError = "Bad input, should be 1, 2, or 3.";
        boolean errorBool = true;
        int row = 0;
        int col = 0;
        do {
            try {
                col = getMoveInt(rowPrompt, badInputError);
                row = getMoveInt(colPrompt, badInputError);

                // check to see that it is a valid move
                if (board[col][row] == '_') {
                    move[0] = col;
                    move[1] = row;
                    errorBool = false;
                } else {
                    System.out.println(takenError);
                }
            } catch (Exception e) {
                // something bad happened
                System.out.println(badInputError);
            }
        } while (errorBool);
        return move;
    }

    private static int getMoveInt(String prompt, String error) {
        boolean errorBool = true;
        int input = 0;
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(prompt);
                input = in.nextInt();
                if ((input > 0) && (input < 4))
                    errorBool = false;
                else
                    System.out.println(error);
            } catch (Exception e) {
                // input is not 1, 2, or 3
                System.out.println(error);
            }
        } while (errorBool);
        return input - 1;
    }

    private static void printBoard(char[][] board) {
        System.out.println("  1 2 3");
        for (int col = 0; col < board.length; col++) {
            System.out.print(col + 1);
            for (int row = 0; row < board[col].length; row++) {
                System.out.printf(" %s", board[col][row]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
