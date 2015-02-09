/**
* On a sheet of paper, write a Java program that will:
*
* - Ask the user to enter a (whole) number
* - Print the number that is twice as big as the input
*
* @author Austin Heiman
* @version Prelab Feb 9
*/

import java.util.Scanner;

class Feb9 {
    public static void main(String[] args) {
        int inInt;
        boolean bError = true;

        do {
            try {
                System.out.print("Enter a whole number: ");
                Scanner in = new Scanner(System.in);
                inInt = in.nextInt();
                bError = false;
                System.out.println(inInt * 2);
            }
            catch (Exception e) {
                // Only integers should be accepted input
                System.out.println("Expected an integer. Try again.");
            }
        } while (bError);
    }

}
