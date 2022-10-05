package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ParseValue {

    public static void increment(int number) {
        System.out.println("Number from method " + ++number);
    }

    public static void main(String[] args) {
        int number1 = 10;
        increment(number1);
        System.out.println("Number1 " + number1);        // unchanged - 10
    }
}
