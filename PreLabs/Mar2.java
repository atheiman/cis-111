/*
 * If you haven't already done, so:
 * - Watch the lecture on "Designing Loops"
 * - Read the lecture notes on "Designing Loops"
 *
 * On a sheet of paper, write an algorithm that will:
 *
 * - Ask the user for a positive whole number
 * - Use a while loop to add up all even numbers less than or equal to the user input
 *     (so if the user enteres 100, add all the even numbers from 2 up to 100)
 *
 * - First, make a list of the variables you need. I suggest:
 *     - The user input number (call it bound)
 *     - A total to help you add together the numbers
 *     - The current number you wish to add (start it at 2)
 *
 * - You can just get the even numbers by starting your current number at 2 and
 *   adding 2 to it each time inside the loop.
 *
 * usage:
 *
 *     javac Mar2.java && java Mar2
 *
 * @author Austin Heiman
 * @version Prelab Feb 9
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
                    System.out.println(errorStr);
            }
            catch (Exception e) {
                System.out.println(errorStr);
            }
        } while (errorBool);

        do {
            if (counter % 2 == 0)
                total += counter;
            counter++;
        } while (counter <= bound);

        System.out.printf("Total of even numbers from 2 to %d: %d\n", bound, total);
    }
}
