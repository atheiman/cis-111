// Austin Heiman | Apr 27 | Lab 10
//
// - Create the text file nums.txt
//   - this file should contain 10 integers, one per line
// - Create a new BlueJ project called Lab11
// - Store nums.txt in your lab folder
// - Create a Lab 11 class that contains:
//   - A main method (empty for now)
//   - A method that takes an integer parameter and returns its square
// - In the main method, open the nums.txt file and read the contents
//   into an array
// - For each element in the array, print its square (by calling your method)
// - Modify your program to print each square to an output file (squares.txt)

import java.util.Scanner;
import java.text.*;
import java.io.*;

public class Lab11 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("nums.txt"));
        PrintWriter p = new PrintWriter(new FileWriter("squares.txt"));
        while (s.hasNextLine()) {
            p.println(square(Integer.parseInt(s.nextLine())));
        }
        p.close();
        s.close();
    }

    private static int square(int value) {
        return value * value;
    }
}
