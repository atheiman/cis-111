/**
 * - Ask the user to enter a word, and read it into a String variable
 * - Count the number of lower-case letters in the word, and print the result
 *
 * @author Austin Heiman
 * @version Prelab Apr 13
 */

import java.util.Scanner;

class Apr13 {
    public static void main(String[] args) {
        String input = getStr("Input a String: ",
                              "Error, try to input a String again.");
        int lowerCase = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c))
                lowerCase++;
        }
        System.out.printf("Received %d lower-case letters.\n", lowerCase);
    }

    private static String getStr(String prompt, String error) {
        boolean errorBool = true;
        String input = "";
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(prompt);
                input = in.nextLine();
                errorBool = false;
            } catch (Exception e) {
                System.out.println(error);    // bad input
            }
        } while (errorBool);
        return input;
    }
}
