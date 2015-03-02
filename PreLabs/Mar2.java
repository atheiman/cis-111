/*
 * Assignment:
 *
 * - Ask the user for a positive whole number
 * - Use a while loop to add up all even numbers less than or equal to the user input
 *     (so if the user enteres 100, add all the even numbers from 2 up to 100)
 *
 *
 *
 * Algorithm:
 *
 *   1. take positive integer input as bound
 *   2. while counter is less than or equal to bound
 *     a. add counter to total
 *     b. add 2 to counter
 *
 *
 *
 * usage:
 *
 *     javac Mar2.java && java Mar2
 *
 * @author Austin Heiman
 * @version Prelab Mar 2
 */

import java.util.Scanner;

class Mar2 {
    public static void main(String[] args) {
        int bound, total, counter;
        bound = total = counter = 0;
        boolean errorBool = true;
        String errorStr = "Expected a positive whole number. Try again.";

        do {
            try {
                System.out.print("Enter a positive whole number: ");
                Scanner in = new Scanner(System.in);
                bound = in.nextInt();
                if (bound > 0)
                    errorBool = false;
                else
                    System.out.println(errorStr);    // input was negative
            }
            catch (Exception e) {
                System.out.println(errorStr);    // input was not an Int
            }
        } while (errorBool);

        counter = 2;
        while (counter <= bound) {
            total += counter;
            counter += 2;
        }

        System.out.printf("Total of even numbers from 2 to %d: %d\n", bound, total);
    }
}
