/**
 * Asks the user how many courses they took. Receives input for number of
 * courses, then hours and letter grade for each course. Calculates and prints
 * the corresponding GPA. Here is a sample run of the program:
 *
 *     How many courses did you take? 4
 *
 *     Course (1): How many hours? 3
 *     Course (1): Letter grade? D
 *     Course (2): How many hours? 5
 *     Course (2): Letter grade? B
 *     Course (3): How many hours? 3
 *     Course (3): Letter grade? A
 *     Course (4): How many hours? 4
 *     Course (4): Letter grade? B
 *
 *     GPA: 2.80
 *
 * @author Austin Heiman
 * @version Project 3 due Mar 27
 *
 * Write a Java program that asks the user for how many courses they took. You
 * will then get the number of hours and letter grade for each course; then, you
 * will calculate and print the corresponding GPA. Here is a sample run of the
 * program:
 *
 */

import java.text.*;
import java.util.Scanner;

class Proj3 {
    public static void main(String[] args) {
        double courses, hours, hoursTotal, points;
        courses = hours = hoursTotal = points = 0;

        DecimalFormat df = new DecimalFormat("#0.00");

        String coursesErr = "ERROR - Expected courses as positive int.";
        String hoursErr = "ERROR - Expected hours as int.";
        String letterErr = "ERROR - Expected 'A', 'B', 'C', 'D', or 'F'.";
        String coursesPrompt = "How many courses did you take? ";
        String hoursPrompt = "Course (%d): How many hours? ";
        String letterPrompt = "Course (%d): Letter grade? ";
        String outString = "GPA: ";

        // get number of courses
        courses = getPosInt(coursesPrompt, coursesErr);

        System.out.println();

        // get points for each course
        for (int i = 0; i < courses; i++) {
            hours = 0;

            hours = getPosInt(String.format(hoursPrompt, i + 1), coursesErr);
            hoursTotal += hours;
            points += hours * getPoints(String.format(letterPrompt, i + 1),
                                        letterErr);
        }

        System.out.println();

        System.out.println(outString + df.format(points / hoursTotal));
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


    private static int getPoints(String prompt, String error) {
        boolean errorBool = false;
        int points = 0;
        String input;
        do {
            errorBool = false;
            System.out.print(prompt);
            Scanner in = new Scanner(System.in);
            try {
                input = Character.toString(in.next(".").charAt(0)).toUpperCase();
                switch (input) {
                    case "A":
                        points = 4;
                        break;
                    case "B":
                        points = 3;
                        break;
                    case "C":
                        points = 2;
                        break;
                    case "D":
                        points = 1;
                        break;
                    case "F":
                        points = 0;
                        break;
                    default:
                        errorBool = true;
                        break;
                }
            } catch (Exception e) {
                errorBool = true;
            }
            if (errorBool)
                System.out.println(error);
        } while (errorBool);
        return points;
    }
}
