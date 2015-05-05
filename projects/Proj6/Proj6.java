/**
 * Proj6 plays a simplified game of Hangman.
 *
 * @author Austin Heiman, Julie Thornton
 * @version Project 6
 */

import java.util.*;
import java.io.*;

public class Proj6 {
    public static Scanner s;

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Hangman!\n");

        s = new Scanner(System.in);

        String correct = pickWord("words.txt");
        char[] cur = new char[correct.length()];
        cur = init(cur.length);
        printPuzzle(cur);
        while (!solved(correct, cur)) {
            cur = guessLetter(correct, cur);
            printPuzzle(cur);
        }
        System.out.println("You win!");


        //YOU DO THIS
        //call init to get the original array with all _ values
        //print the puzzle (call printPuzzle)
        //while the user has not solved the puzzle
            //have them guess a letter (call guessLetter)
            //if the guess was in the puzzle, call printPuzzle
            //otherwise, print that the letter wasn't found
    }

    /**
     * printPuzzle prints the puzzle so far with the letters the user
     * has guessed, and _ for the other spots
     *
     * @param cur An array with the letters the user has guessed so far
     *      and _ for the other spots
     */
    public static void printPuzzle(char[] cur) {
        for (char letter : cur) {
            System.out.print(letter);
        }
        System.out.println();
    }

    /**
     * pickWord randomly picks a word for the puzzle from
     * the input file
     *
     * @param filename The input file of dictionary words
     * @return A random word from that file
     */
    public static String pickWord(String filename) throws IOException {
        Scanner inFile = new Scanner(new File(filename));
        int size = Integer.parseInt(inFile.nextLine());

        Random r = new Random();
        int line = r.nextInt(size);
        for (int i = 1; i < line; i++) {
            inFile.nextLine();
        }

        return inFile.nextLine();
    }

    /**
     * init builds an array of _ _ _ ... that is the same size
     * as the word the user is trying to guess
     *
     * @param size The size of the word the user needs to guess
     * @return A an array of _ _ ... of that same size
     */
    public static char[] init(int size) {
        char[] letters = new char[size];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

        return letters;
    }

    /**
     * solved determines whether the user has correctly solved
     * the puzzle
     *
     * @param correct The correct word the user is trying to guess
     * @param cur An array with the letters the user has guessed so far
     *      and _ for the other spots
     * @return Whether the user has solved the puzzle (all letters from
     *      cur should match the letters in correct, with no _ remaining
     */
    public static boolean solved(String correct, char[] cur) {
        boolean winner = true;

        for (int i = 0; i < correct.length(); i++) {
            if (correct.charAt(i) != cur[i])
                winner = false;
        }

        return winner;
    }

    /**
     * guessLetter lets the user guess a letter, and then plugs that
     * letter into the puzzle.
     *
     * @param correct The correct word the user is trying to guess
     * @param cur An array with the letters the user has guessed so far
     *      and _ for the other spots
     * @return Whether the user guessed a letter in the correct word
     */
    public static char[] guessLetter(String correct, char[] cur) {
        char letter = getChar("Guess a letter: ",
                              "Something went wrong, try again.");
        int correctCount = 0;

        for (int i = 0; i < correct.length(); i++) {
            if (Character.toLowerCase(correct.charAt(i)) == letter) {
                cur[i] = letter;
                correctCount++;
            }
        }

        if (correctCount > 0) {
            System.out.printf("Found %d '%s'!", correctCount, letter);
        } else {
            System.out.printf("Found no '%s'.", letter);
        }

        System.out.println("\n");

        return cur;
    }

    public static char getChar(String prompt, String error) {
        boolean errorBool = true;
        char returnChar = ' ';

        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(prompt);
                returnChar = in.next(".").charAt(0);
                errorBool = false;
            } catch (Exception e) {
                System.out.println(error);    // something bad happened
            }
        } while (errorBool);

        return returnChar;
    }
}
