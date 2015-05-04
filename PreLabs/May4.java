/**
 * Write a method called square that will:
 * - take an integer value as a parameter
 * - return the square of the parameter (for example, the square of 4 is 4*4)
 *
 * Write another method called countA that will:
 * - take a string value as a parameter
 * - return the count of how many 'a' letters are in the parameter (for example,
 *   there are three 'a' letters in "banana")
 *
 * Write a main method that will:
 * - Create a string variable called str and initialize it to "banana"
 * - Call your countA method above, passing str as the parameter. Store the
 *   result in a new variable called count.
 * - Call your square method above, passing count as the parameter. Store the
 *   result in a new variable called sq.
 * - Print the value of sq.
 *
 * @author Austin Heiman
 * @version Prelab May 4
 */

class May4 {
    public static void main(String[] args) {
        String str = "banana";
        int count = countA(str);
        System.out.printf("count: %d\n", count);
        int sq = square(count);
        System.out.printf("sq: %d\n", sq);
        System.out.println(sq);
    }

    private static int square(int value) {
        return value * value;
    }

    private static int countA(String value) {
        int count = 0;
        for (char c : value.toCharArray()) {
            if (c == 'a')
                count++;
        }
        return count;
    }
}
