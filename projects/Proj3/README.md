CIS 111 Project 3 (50 points)
Due Friday, March 27 by midnight
Description
In this assignment, you will write a Java program that asks the user for how many courses they
took. You will then get the number of hours and letter grade for each course; then, you will
calculate and print the corresponding GPA. Here is a sample run of the program:
Requirements
This program should contain a single class (called Proj3) with a main method. Your program
should compile and run in BlueJ.
Your program should look exactly like the screenshot above when it runs, except for the values
of the numbers.
You should format the output to round the GPA to the nearest two decimal places. Here is an
example of how you will do that:
//Do this at the very top of the file
import java.text.*;
//Do this once at the beginning of main
DecimalFormat df = new DecimalFormat(“#0.00”);//Suppose you want to round val to the nearest three decimal places
double val = 3.278514;
System.out.println(df.format(val));
This will print out 3.28 (val rounded to two decimal places). You can round any value to two
decimal places by putting that variable name in the line above instead of “val”.
Calculating GPA
To calculate GPA, you need to know two things: how many total hours the student took, and
how many total points they earned. For each class, an A is worth 4 points, a B is worth 3 points,
a C is worth 2 points, a D is worth 1 point, and an F is worth 0 points. You can calculate the
number of points in a class by multiplying the point value of the letter grade times the number of
hours for that class. For example, a 5 hour class where a student earns a B is worth 15 points (5
hours times 3 points for a B).
Suppose a student took three courses, and achieved the following grades: A (3 hours), B (4
hours), C (5 hours). You can find the number of points as follows:
Points = 3 hours * 4 points + 4 hours * 3 points + 5 hours * 2 points = 34 points
You can find the total number of hours as follows:
Hours = 3 + 4 + 5 = 12 hours
Then you can find the GPA by dividing the total number of points by the total number of hours:
GPA = 34 / 12 = 2.83
Documentation
You should put a description of the project at the top of the file. Please use this template:
/**
* (description of the project)
*
* @author (your name)
* @version (which number project this is)
*/
Submission
To submit your project, find the proj3 folder that BlueJ created. (Inside that folder should be a
file called Proj3.java.) Right-click on the FOLDER and select “Send To->Compressed
(zipped) folder”. This will create the file proj3.zip. Go to “Files and Content->Modules->File Dropbox” on K-State Online, and
upload the proj3.zip file. Put your name and Project 3 in the description box.
Grading
Projects will be graded according to the following rubric:
Requirement Points
Ask the user how many courses they want to enter 3
Use a loop to get the number of hours and letter grade for each course 10
Correctly calculate the total number of hours 10
Correctly calculate the total number of points 10
Correctly calculate and print the GPA 10
Format exactly matches example (including rounding to two decimal places) 5
Documentation 1
Submission (zip file, used dropbox,
included name and project number)
1
Total 50
