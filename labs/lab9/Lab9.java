// Austin Heiman | Apr 13 | Lab 9
//
// The program should ask the user to enter a sentence. Once the user presses the “Enter”
// key, the program should print out the following statistics:
// 1. How many vowels are in the sentence.
// 2. How many consonants are in the sentence.
// 3. How many words are in the sentence.
// 4. Print the sentence backward, word by word (e.g. if the sentence was “Print the
// sentence backward” then it would print “backward sentence the Print”). Use a
// StringTokenizer to get the words.
// E.g.:
//     Enter a sentence? Mary had a little lamb
//     Vowels: 6
//     Consonants: 12
//     Words: 5
//     Backwards: lamb little a had Mary


import java.util.*;
import java.text.*;


public class Lab9 {
    public static void main(String[] args) {
        String input = getStr("Enter a sentence: ",
                              "Error, try to input a sentence again.");
        int vowelCount = 0;
        int consonantCount = 0;
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
                               "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
        String[] words = input.split(" ");

        for (String letter : input.split("")) {

            if (Arrays.asList(vowels).contains(letter.toLowerCase()))
                vowelCount++;
            if (Arrays.asList(consonants).contains(letter.toLowerCase()))
                consonantCount++;
        }

        System.out.printf("Vowels: %d\nConsonants: %d\nWords: %d\n",
                          vowelCount,
                          consonantCount,
                          words.length);

        System.out.print("Backwards: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
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
