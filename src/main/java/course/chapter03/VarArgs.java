package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class VarArgs {

    public static double mean(int... nr) {
        int total = 0;
        for (int j : nr) {
            total += j;
        }
        return ((double) total) / nr.length;
    }

    public static void main(String[] args) {
        System.out.println(mean(13, 17, 25));               // 18.33
        System.out.println(mean(12, 33, 45, 99));           // 47.25
    }
}
