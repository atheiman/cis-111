// Austin Heiman | Apr 6 | Lab 8
//
// Take in 25 chars as a 5 x 5 two dimensional array. Print them out surrounded
// in star characters


import java.util.*;
import java.text.*;


public class Lab8 {
    public static void main(String[] args){
        String[][] chars = new String[5][5];
        String prompt = "Row %d, Col %d: ";
        String error = "Expected a char, try again.";
        String[] output = {"*******\n", "*", "*\n", "*******\n"};

        for (int r = 0; r < chars.length; r++) {
            for (int c = 0; c < chars[r].length; c++) {
                chars[r][c] = getChar(
                    String.format(prompt, r + 1, c + 1),
                    error
                );
            }
        }

        System.out.print(output[0]);
        for (int r = 0; r < chars.length; r++) {
            System.out.print(output[1]);
            for (int c = 0; c < chars[r].length; c++) {
                System.out.print(chars[r][c]);
            }
            System.out.print(output[2]);
        }
        System.out.print(output[3]);
    }

    private static String getChar(String prompt, String error) {
        boolean errorBool = true;
        String return_char = "";
        do {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(prompt);
                return_char = Character.toString(in.next(".").charAt(0));
                errorBool = false;
            } catch (Exception e) {
                System.out.println(error);    // something bad happened
            }
        } while (errorBool);
        return return_char;
    }
}
