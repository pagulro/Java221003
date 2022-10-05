package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class Continue {

    public static void main(String[] args) {

        for (int i = 1; i <= 14; i++) {

            if (i % 2 == 1) {
                System.out.println("continue, i is: " + i);
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("divisible with 6: " + i);
            } else {
                System.out.println("divisible with 2: " + i);
            }

        }
    }
}