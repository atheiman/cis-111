/**
 * On a sheet of paper, write a method that will:
 * - Take a sentence (a string) as a parameter
 * - Use a StringTokenizer to break apart the sentence (using " ,!?." as your
 *   possible delimeters) and print each word. You will need to use a loop.
 *
 * Assume you are in the same class as the method above, and write a main method
 * where you:
 * - Create a string variable and initialize it to "This is a test."
 * - Call your method above, passing your string.
 *
 * Usage:
 *
 *    $ javac Apr27.java && java Apr27
 *    This
 *    is
 *    a
 *    test
 *
 * @author Austin Heiman
 * @version Prelab Apr 27
 */

import java.util.Scanner;
import java.util.StringTokenizer;

class Apr27 {
    public static void main(String[] args) {
        printStringComponents("This is a test.");
    }

    private static void printStringComponents(String str) {
        StringTokenizer st = new StringTokenizer(str, " ,!?.");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
