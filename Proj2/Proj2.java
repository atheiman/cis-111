/**
* CIS 111 Proj 2, Calculating Exam Letter Grade
* Calculates a letter grade from an input integer exam score.
*
* @author Austin Heiman
* @version Project 2
*/

import java.util.Scanner;

class Proj2 {
    public static void main(String[] args) {
        int score;
        String returnStr;
        boolean bError = true;

        do {
            try {
                System.out.print("Enter a score (0-100): ");
                Scanner in = new Scanner(System.in);
                score = in.nextInt();
                bError = false;

                // Determine the letter grade
                if (score >= 90)
                    returnStr = "A";
                else if (score >= 80 && score < 90)
                    returnStr = "B";
                else if (score >= 70 && score < 80)
                    returnStr = "C";
                else if (score >= 60 && score < 70)
                    returnStr = "D";
                else
                    returnStr = "F";

                if (returnStr != "F")
                    // append '+' or '-' if not 'F'
                    returnStr += getPlusOrMinus(score);

                // Print the letter grade without whitespace
                System.out.println(returnStr.trim());
            }
            catch (Exception e) {
                // Only integers should be accepted input
                System.out.println("Expected an integer. Try again.");
            }
        } while (bError);
    }

    private static char getPlusOrMinus(int score) {
        int remainder = score % 10;
        char returnChar;

        if (remainder < 3)
            returnChar = '-';
        else if (remainder > 6)
            returnChar = '+';
        else
            returnChar = ' ';

        return returnChar;
    }
}
