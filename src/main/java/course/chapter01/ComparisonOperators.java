package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class ComparisonOperators {
    /**
     *
     * @param args
     * don't use == to compare float or double values
     */
    public static void main(String[] args) {
        float nr1 = 0.1f;
        double nr2 = 0.7d;
        int nr3 = 8;
        System.out.println(nr3 == (nr1 + nr2) * 10); // false

        System.out.println(5 > 3);      // true
        System.out.println(5 < 3);      // false
        System.out.println(5 <= 5);     // true
        System.out.println(5 >= 6);     // false
        System.out.println(!(5 > 7));   // true
    }
}
