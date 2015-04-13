Create a new Java program in BlueJ that:

- Asks the user for a character (like 'x')
- Creates a 5x5 array of chars
- Uses nested loops to set every element in that array to be the user input character
    (so if the user entered 'x', you would create a 5x5 array
    where every value was 'x')

- Uses nested loops to print the array like this:

*******
*xxxxx*
*xxxxx*
*xxxxx*
*xxxxx*
*xxxxx*
*******

(This assumes that the user entered 'x' for the character.)  Notice that it is
printing every value in the array inside a box of '*'s.  You will want to do something
like this:

loop, counting up to 7 (there are 7 *'s on the first line)
   print a *
print a new line

loop, counting up to 5 (there are 5 rows in the array)
   print a * (every line starts with a *)
   loop, counting up to 5 (there are 5 columns in the array)
      print the current row and column in the array

   print a * (every line ends with a *)
   print a new line


Remember, to get a single character as user input, we can do:

    char letter = (s.nextLine()).charAt(0);

Assuming s is the name of our Scanner.

**********************
It is possible to do this lab without using arrays and without even using loops.  Please follow the
pseudocode above using arrays and loops, though, as it is very good practice for the next project.
