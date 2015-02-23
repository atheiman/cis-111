// Prelab HW Feb 23
import java.util.Scanner;

class Feb23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current GPA? ");
        double dub = in.nextDouble();
        String returnStr;

        if (dub >= 3.9)
            returnStr = "Dean's List";
        else if (dub >= 3.5)
            returnStr = "Honor Roll";
        else if (dub >= 2.0)
            returnStr = "Good Standing";
        else
            returnStr = "Academic Warning";

        // Print the letter grade without whitespace
        System.out.println(returnStr);
    }
}
