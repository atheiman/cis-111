CIS 111 Project 4 (50 points)
Due Friday, April 10 by midnight


## Description

In this assignment, you will write a Java program that gets 10 test scores from
the user and then asks for a letter grade. It should then print out how many of
those scores would receive that letter grade. Here is a sample run of the
program:


## Requirements

This program should contain a single class (called Proj4) with a main method.
Your program should compile and run in BlueJ.

Here are some additional requirements/tips:
- You should first create an integer array that can hold 10 numbers. Then you
  should use a loop to ask the user for each test score, and store them in the array
- You can get a single character from the user like this (assuming s is the name
  of your Scanner):
  ```java
  System.out.println(“Enter a character: “);
  char letter = (s.nextLine()).charAt(0);
  ```
- You should then have another loop that counts how many scores receive the
  given letter grade. (Assume the usual 90/80/70/60 cutoff for A/B/C/D/F.) You
  will likely want several if-statements inside that loop. For example, IF the
  user wants to count As, then you will count all the scores that are greater
  than or equal to 90. IF the user wants to count Bs, you will count all the
  scores that are between 80 and 90.
- Your program should look EXACTLY like the example above when it runs (except
  the values of the scores, depending on user input)


## Documentation

You should put a description of the project at the top of the file. Please use this template:
```java
/**
* (description of the project)
*
* @author (your name)
* @version (which number project this is)
*/
```


## Submission

To submit your project, first create a folder called proj4, and move your
`Proj4.java` file into that folder. (If you used BlueJ, you can skip this step).
Then, right-click on that folder (or the folder you created for your BlueJ
project) and select “Send To->Compressed (zipped) folder”. This will create the
file proj4.zip. Go to “Files and Content->Modules->File Dropbox” on K-State
Online, and upload the proj4.zip file. Put your name and Project 4 in the
description box.


## Grading

Projects will be graded according to the following rubric:

Requirement | Points
----------- | ------
Loop to get 10 test scores | 10
Store scores in an array | 10
Ask for a letter grade | 5
Loop to count how many scores have that grade | 15
Correctly prints the letter grade count | 6
Output format exactly matches example | 2
Documentation | 1
Submission (zip file, used dropbox, included name and project number) | 1
Total | 50
