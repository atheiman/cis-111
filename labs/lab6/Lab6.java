// Austin Heiman | Mar 9 | Lab 6
//
// You will create a Java application using BlueJ that asks the user for 10 exam
// scores (assume scores are between 0 and 100), and then prints how many scores
// were a B (between 80 and 90). You will need:
// 1. A variable to help count how many scores you’ve asked for so far
// 2. A variable to keep track of how many B’s you’ve seen so far
// 3. A variable for reading in the current score from the user
// 4. You might model your algorithm after the “Example: If-statements inside
//    loops” from the lecture notes. That example gets 100 numbers from the user
//    and prints the sum of those that are positive. This lab is also the same
//    problem that you solved last week, but now you will write Java code
//    instead of just an alogorithm.

import java.util.Scanner;

class Lab6 {
    public static void main(String[] args) {
        int input, inputCount, bCount, aCount, maxInputs;
        input = inputCount = bCount = aCount = 0;
        maxInputs = 10;
        String prompt = "Enter exam score (#%d): ";
        String output = "\nAs received: %d, Bs received: %d\n";

        while (inputCount < maxInputs) {
            System.out.printf(prompt, inputCount + 1);
            Scanner in = new Scanner(System.in);
            input = in.nextInt();
            if ((input > 79) && (input < 90))
                bCount++;
            if (input > 89)
                aCount++;
            inputCount++;
        }

        System.out.printf(output, aCount, bCount);
    }
}
