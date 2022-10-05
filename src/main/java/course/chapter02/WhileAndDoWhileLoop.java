package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class WhileAndDoWhileLoop {

    public static void main(String[] args) {
        int number = 100;

        while (number > 0) {
            System.out.println(number);
            number -= 17;
        } // prints 100, 83, 66, 49, 32, 15 and stop loop. Number remain -2

        do {
            System.out.println(number);
            number++;
        } while (number < 5); // prints all integers between -2 and 4 including
    }
}
