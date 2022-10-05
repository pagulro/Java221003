package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class Break {

    public static void main(String[] args) {
        int number = 7;
        while (number > 0) {
            System.out.println(number--);   // out condition
            if (number == 5) {
                break;
            }   // prints 7, 6 and stop iterations when number decrease at 5
        }
        System.out.println("Finish");   // printing Finish
    }
}
