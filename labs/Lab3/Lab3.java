import java.text.*;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        double avg;
        double one;
        double two;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        one = in.nextInt();
        System.out.print("Enter second number: ");
        two = in.nextInt();

        // avg = (one + two) / 2;
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.print("The average is ");
        System.out.println(df.format((one + two) / 2));

    }
}
