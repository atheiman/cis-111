import java.text.*;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        double bill;
        double tax;
        double subtotal;
        double tip;
        double grandtotal;

        Scanner in = new Scanner(System.in);

        System.out.print("Bill amount: ");
        bill = in.nextDouble();

        tax = bill * .085;
        subtotal = bill + tax;
        tip = .20 * subtotal;
        grandtotal = subtotal + tip;

        System.out.print("Grandtotal is $");
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(df.format(grandtotal));
    }
}
