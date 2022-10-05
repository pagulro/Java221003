package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class LabeledContinueAndBreak {

    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            System.out.println("i is " + i);
            innerLoop:
            for (int j = 1; j <= 5; j++) {
                System.out.println("j is " + j);
                if (i == j) {
                    System.out.println("i = j = " + j);
                    System.out.println("continue outer loop");
                    continue outerLoop;
                } else if (i + j == 7) {
                    System.out.println("i + j = " + (i + j));
                    System.out.println("out from inner loop");
                    break innerLoop;
                }
            }
        }
    }
}
