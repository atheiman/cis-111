// Austin Heiman | Apr 27 | Lab 10
//
// The program should ask the user for their first name, then print the number
// of vowels and consonants. Ask for their middle name, and then print the
// number of vowels and consonants. Ask for their last name, and then print the
// number of vowels and consonants. You should use a separate method for
// printing the vowels and consonants in a String.

import java.util.*;
import java.text.*;


public class Lab10 {
    public static void main(String[] args) {
        String error = "Error, try to enter your name again.";
        String name = getStr("Enter first name: ", error);
        summarizeStr(name);
        name = getStr("Enter middle name: ", error);
        summarizeStr(name);
        name = getStr("Enter last name: ", error);
        summarizeStr(name);
    }

    private static void summarizeStr(String name) {
        int vowelCount = 0;
        int consonantCount = 0;
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
                               "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

        for (String letter : name.split("")) {
            if (Arrays.asList(vowels).contains(letter.toLowerCase()))
                vowelCount++;
            if (Arrays.asList(consonants).contains(letter.toLowerCase()))
                consonantCount++;
        }

        System.out.printf("Vowels: %d\nConsonants: %d",
                          vowelCount,
                          consonantCount);

        System.out.println();
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
