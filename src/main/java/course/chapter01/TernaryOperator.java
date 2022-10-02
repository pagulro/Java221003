package course.chapter01;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class TernaryOperator {
    /**
     *
     * @param args
     * ThreadLocalRandom.current().nextInt(int n, int m)
     *      return an aleatory number between n and m (n must be shorter than m)
     */
    public static void main(String[] args) {
        int x = ThreadLocalRandom.current().nextInt(1, 100);
        int y = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println("x is: " + x + ", y is : " + y);
        System.out.println(x > y ? "x is greater than y" : "y is greater than x");
    }
}
