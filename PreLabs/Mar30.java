// If you haven't already done, so:
// - Watch the lecture on "Arrays"
// - Read the lecture notes on "Arrays"

// On a sheet of paper, write a Java program that will:

// - create an array to hold 20 student exam scores (ints)
// - use a for-loop to ask the user for each score and read them into the array

// - declare a count variable and initialize it to 0
// - use a for-loop to help you count how many students passed the exam (where
//     (60 and higher is considered passing)
//     - Add one to your count every time you find a passing score

// - Display the count after the loop


import java.util.Scanner;

class Mar30 {
    public static void main(String[] args) {
        int scoreCount = 20;
        int[] scoresArray = new int[scoreCount];
        String scorePrompt = "Score %d: ";
        String scoreErr = "Expected an integer. Try again.";
        for (int i = 0; i < scoresArray.length; i++) {
            scoresArray[i] = getInt(String.format(scorePrompt, i + 1),
                                    scoreErr);
        }

        int passedCount = 0;
        int passingMin = 60;
        for (int i = 0; i < scoresArray.length; i++) {
            if (scoresArray[i] >= passingMin)
                passedCount++;
        }

        System.out.printf("Passing scores: %d\n", passedCount);
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
