/**
 * Gets 10 test scores from the user and then asks for a letter grade. Then
 * prints out how many of those scores would receive that letter grade. Here is
 * a sample run of the program:
 *
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *     Enter score: 75
 *
 *     Which grade would you like to count? B
 *     There are 2 Bs
 *
 * @author Austin Heiman
 * @version Project 4 due Apr 10
 */

import java.text.*;
import java.util.Scanner;
import java.util.Arrays;

class Proj4 {
    public static void main(String[] args) {
        int[] scoresArray = new int[10];
        int[] scoreRange = new int[2];
        String grade;
        int numGrades = 0;

        String scorePrompt = "Enter score %d: ";
        String letterPrompt = "Which grade would you like to count? ";
        String scoreErr = "ERROR - Expected score as int.";
        String letterErr = "ERROR - Expected 'A', 'B', 'C', 'D', or 'F'.";

        // get scores
        for (int i = 0; i < scoresArray.length; i++) {
            scoresArray[i] = getInt(String.format(scorePrompt, i + 1),
                                    scoreErr);
        }

        System.out.println();

        grade = getGrade(letterPrompt, letterErr);

        switch (grade) {
            case "A":
                scoreRange[0] = 90;
                scoreRange[1] = 200;
                break;
            case "B":
                scoreRange[0] = 80;
                scoreRange[1] = 90;
                break;
            case "C":
                scoreRange[0] = 70;
                scoreRange[1] = 80;
                break;
            case "D":
                scoreRange[0] = 60;
                scoreRange[1] = 70;
                break;
            case "F":
                scoreRange[0] = -100;
                scoreRange[1] = 60;
                break;
            default:
                break;
        }

        // get count of grade instances
        for (int i = 0; i < scoresArray.length; i++) {
            if ((scoresArray[i] >= scoreRange[0]) &&
                (scoresArray[i] < scoreRange[1]))
                numGrades++;
        }

        // print the summary string
        if (numGrades == 1)
            System.out.println(String.format("There is %d %s",
                                             numGrades,
                                             grade));
        else
            System.out.println(String.format("There are %d %ss",
                                             numGrades,
                                             grade));
    }


    private static int getInt(String prompt, String error) {
        boolean errorBool = true;
        int input = 0;
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(prompt);
                input = in.nextInt();
                errorBool = false;
            } catch (Exception e) {
                System.out.println(error);    // input was not an Int
            }
        } while (errorBool);
        return input;
    }


    private static int getPosInt(String prompt, String error) {
        int input = 0;
        do {
            input = getInt(prompt, error);
            if (input > 0)
                return input;
            else
                System.out.println(error);
        } while (true);
    }


    private static String getGrade(String prompt, String error) {
        boolean errorBool = true;
        String[] gradesArray = {"A", "B", "C", "D", "F"};
        String grade = "";
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(prompt);
                grade = Character.toString(in.next(".").charAt(0)).toUpperCase();
                if (Arrays.asList(gradesArray).contains(grade))
                    errorBool = false;
            } catch (Exception e) {
                System.out.println(error);    // input was not a grade
            }
        } while (errorBool);
        return grade;
    }
}
