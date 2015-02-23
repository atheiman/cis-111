// Lab 4 -  Feb 23
import java.util.Scanner;

class Lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("First int: ");
        int int1 = in.nextInt();
        System.out.print("Second int: ");
        int int2 = in.nextInt();
        System.out.print("Third, and final, int: ");
        int int3 = in.nextInt();

        int largest = 0;
        int middlest = 0;
        int smallest = 0;
        int diff = 0;

        // if (int1 == int2 || int2 == int3 || int3 == int1)
        //     System.out.println("What the hell are you doing. Gimme different numbers.");

        if (int1 > int2) {
            largest = int1;
            middlest = int2;
        } else {
            largest = int2;
            middlest = int1;
        }

        if (largest > int3 && middlest > int3) {
            smallest = int3;
        } else if (int3 > largest) {
            smallest = middlest;
            middlest = largest;
            largest = int3;
        } else if (int3 < largest && middlest < int3) {
            smallest = middlest;
            middlest = int3;
        }

        diff = largest - middlest;

        System.out.print("large: ");
        System.out.println(largest);
        System.out.print("mid: ");
        System.out.println(middles);
        System.out.print("small: ");
        System.out.println(smallest);
        // System.out.format("Largest: %d\nMiddlest: %d\nSmallest: %d\nDifference: %d\n",
        //                   largest, middlest, smallest, diff);

        // if (dub >= 3.9)
        //     returnStr = "Dean's List";
        // else if (dub >= 3.5)
        //     returnStr = "Honor Roll";
        // else if (dub >= 2.0)
        //     returnStr = "Good Standing";
        // else
        //     returnStr = "Academic Warning";

        // // Print the letter grade without whitespace
        // System.out.println(returnStr);
    }
}
