// Austin Heiman | March 9 Prelab | Mon 3:30pm
//
// On a sheet of paper, write a Java program with a for-loop that will:
//
// - Ask the user for 10 different integers (use a for-loop to count 10 times)
// - At the end, print out how many of the numbers were positive (greater than 0)
//
// Hint: you will want a variable to hold the count of how many positive numbers
// you've seen. Set this to 0 before the loop. After reading in each number in
// the loop, check to see if that number is greater than 0 (use an if-statement).
// If it is, add one to your count variable.

import java.util.Scanner;

class Mar9 {
    public static void main(String[] args) {
        int posCount = 0;
        int count = 1;
        int inputs = 10;
        boolean errorBool = true;
        String errorStr = "Expected an integer, try again.";
        String prompt = "Enter integer number %d: ";

        while (count < inputs + 1) {
            do {
                try {
                    System.out.printf(prompt, count);
                    Scanner in = new Scanner(System.in);
                    if (in.nextInt() > 0)
                        posCount++;
                    errorBool = false;
                    count++;
                }
                catch (Exception e) {
                    System.out.println(errorStr);     // input was not an Int
                }
            } while (errorBool);
        }

        System.out.printf("Positive inputs: %d\n", posCount);
    }
}
