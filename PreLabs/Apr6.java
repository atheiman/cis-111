/*
@author Austin Heiman
@version Prelab Apr 6
*/

import java.util.Scanner;

class Apr6 {
    public static void main(String[] args) {
        int[][] students = new int[3][2];
        String prompt = "Student %d, score %d: ";
        String error = "Expected an integer, try again.";
        String[] output = {"Student %d:", "\t%d", "\n"};

        for (int s = 0; s < students.length; s++) {
            for (int e = 0; e < students[s].length; e++) {
                students[s][e] = getInt(
                    String.format(prompt, s + 1, e + 1),
                    error
                );
            }
        }

        for (int s = 0; s < students.length; s++) {
            System.out.printf(output[0], s + 1);
            for (int e = 0; e < students[s].length; e++) {
                System.out.printf(output[1], students[s][e]);
            }
            System.out.printf(output[2]);
        }
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
}
