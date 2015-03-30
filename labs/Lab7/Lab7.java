// Austin Heiman | Mar 30 | Lab 7
//
// Programming with Arrays
//
// You will create a Java application using BlueJ splits up a pizza bill:
//
// The program should ask how many people are eating pizza, the total slices,
// and the total price for the pizza. Use this number to determine the size of
// the array you will use in the next step. Then, for each person eating, ask
// how many slices that person ate and store it in an array. The program should
// then output a summary indicating how many slices each person ate and how much
// they owe.
//
// Example:
//
//     How many people are eating? 2
//     How many slices? 8
//     How much did the pizza cost? 24.32
//
//     Person 1, how many slices? 3
//     Person 2, how many slices? 5
//
//     Summary:
//     Person 1 ate 3 slices and owes 9.12
//     Person 2 ate 5 slices and owes 15.2


import java.util.*;
import java.text.*;

public class Lab7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("How many people are eating?");
        int people=Integer.parseInt(s.nextLine());
        System.out.println("How many slices?");
        int slices=Integer.parseInt(s.nextLine());
        System.out.println("How much did the pizza cost?");
        double cost=Double.parseDouble(s.nextLine());
        int[] count=new int[people];
        double oneSliceCost=cost/slices;

        for (int i=0;i<people;i++){
            System.out.println("Person "+(i+1)+", how many slices?");
            count[i] = Integer.parseInt(s.nextLine());
        }

        System.out.println("Summary: ");
        DecimalFormat df = new DecimalFormat("#0.00");
        for (int i=0;i<people;i++){
            System.out.printf("Person %d ate %d slices and owes ",
                              i + 1,
                              count[i]);
                              // oneSliceCost * count[i]);
            System.out.print(df.format(oneSliceCost * count[i]));
            System.out.print("\n");
        }

    }
}


// import java.util.Scanner;

// class Lab7 {
//     public static void main(String[] args) {
//         int input, inputCount, bCount, aCount, maxInputs;
//         input = inputCount = bCount = aCount = 0;
//         maxInputs = 10;
//         String prompt = "Enter exam score (#%d): ";
//         String output = "\nAs received: %d, Bs received: %d\n";

//         while (inputCount < maxInputs) {
//             System.out.printf(prompt, inputCount + 1);
//             Scanner in = new Scanner(System.in);
//             input = in.nextInt();
//             if ((input > 79) && (input < 90))
//                 bCount++;
//             if (input > 89)
//                 aCount++;
//             inputCount++;
//         }

//         System.out.printf(output, aCount, bCount);
//     }


//     private static int getNum(String type, String prompt, String error) {
//         boolean errorBool = true;
//         int input = 0;
//         do {
//             try {
//                 Scanner in = new Scanner(System.in);
//                 System.out.print(prompt);
//                 input = in.nextInt();
//                 errorBool = false;
//             } catch (Exception e) {
//                 System.out.println(error);    // input was not an Int
//             }
//         } while (errorBool);
//         return input;
//     }
// }
