# CIS 111 Project 5 (50 points)
# Due Friday, April 24 by midnight


## Description

In this assignment, you will write a Java program that is a Tic-Tac-Toe game
between two players. Here is an example of the program:

```
Current board:
_ _ _
_ _ _
_ _ _

X, enter row: 0
X, enter column: 0

Current board:
X _ _
_ _ _
_ _ _

O, enter row: 0
O, enter column: 0
That spot is taken
O, enter row: 0
O, enter column: 1

Current board:
X O _
_ _ _
_ _ _

X, enter row: 1
X, enter column: 1

Current board:
X O _
_ X _
_ _ _

O, enter row: 1
O, enter column: 0

Current board:
X O _
O X _
_ _ _

X, enter row: 2
X, enter column: 2

Current board:
X O _
_ X _
_ _ X

X wins!
```


## Requirements

This program should contain a single class (called Proj5) with a main method.
Your program should compile and run in BlueJ. This project has been started for
you – please download Proj5.java from K-State Online, copy the code, and paste
it into a new BlueJ project. This code contains comments on what parts you still
need to do. DO NOT remove any of the code that is currently there – those parts
are already done!

Here are some additional requirements/tips (some of these things are already
finished, and the started program prompts you to do the others):

- As soon as one player gets three in a row, the game should end

- If the board fills up, the program should print that there was a tie, and the
  game should end

- If the user enters a row/column that is outside the board (less than 0 or more
  than 2), print an error and let them enter another spot. Similarly, if they
  enter a row/column and another piece is already in that spot, print an error
  and let them enter another position.

- Your program should look EXACTLY like the example above when it runs (except
  the values in the board, depending on user input)


## Documentation

This program has already been documented. But, please add your name to the list
of authors in the comment block.


## Submission

To submit your project, first create a folder called proj5, and move your
`Proj5.java` file into that folder. (If you used BlueJ, you can skip this step).
Then, right-click on that folder (or the folder you created for your BlueJ
project) and select “Send To->Compressed (zipped) folder”. This will create the
file proj5.zip. Go to “Files and Content->Modules->File Dropbox” on K-State
Online, and upload the proj5.zip file. Put your name and Project 5 in the
description box.


## Grading

Projects will be graded according to the following rubric:

| Requirement | Points |
| ----------- | ------ |
| Ask the user for row/column | 4 |
| Check that the position is a valid move (prompt again if not) | 10 |
| Place the piece and print the updated board | 7 |
| Switch turns after each move | 5 |
| Complete winner check (add check for diagonals) | 10 |
| Output exactly matches example | 3 |
| Tic-Tac-Toe program functions properly | 10 |
| Documentation and submission (zip file, used dropbox, included name and project number) | 1 |
| Total | 50 |
