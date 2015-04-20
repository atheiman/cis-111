
/**
 * Proj5 is a two-player Tic-Tac-Toe game
 *
 * @author Austin Heiman
 * @version Project 5
 */

import java.util.*;

import java.util.*;
public class Proj5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] board = new char[3][3];

        //YOU DO THIS
        //use a nested loop to fill board with '_' (blank) at each position
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }

        //count how many moves have been made
        int moves = 0;

        //keep track of whose turn it is
        char turn = 'X';

        System.out.println("Current board: ");
        //YOU DO THIS
        //Use a nested loop to print the board

        //keep playing while less than 9 moves
        while (moves < 9) {
            //YOU DO THIS
            //Ask the user for the row and the column

            //check to see that it is a valid move (row/col should be from 0-2,
            //and that value in the array should be '_' for empty)

            //If it is valid:
                //place the user's piece (turn) at that spot in the array
                //print the board (copy and paste the loops above that printed the initial board)

                //check for a winner
                boolean win = false;
                for (int i = 0; i < 3; i++) {
                    //checks for three in a row
                    if (board[i][0] == board[i][1] &&
                        board[i][1] == board[i][2] &&
                        board[i][0] == turn) win = true;

                    //checks for three in a column
                    if (board[0][i] == board[1][i] &&
                        board[1][i] == board[2][i] &&
                        board[0][i] == turn) win = true;
                }

                //YOU DO THIS
                //check for three on a diagonal (note that there are two diagonals)

                //Prints who won
                if (win) {
                    System.out.println(turn + " wins!");

                    //end the game
                    break;
                }

                //YOU DO THIS
                //switch whose turn it is
                //if turn is 'X' right now, make it 'O'
                //otherwise, make it 'X'

                //One more move has gone by
                moves++;
        }

        //if moves made it to 9, must be a tie
        if (moves == 9) System.out.println("Tie game.");
    }
}
