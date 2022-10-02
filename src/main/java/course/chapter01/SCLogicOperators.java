package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class SCLogicOperators {
    /**
     *
     * @param args
     * we can use short-circuit logic operators to evaluate multiple dependent condition
     */
    public static void main(String[] args) {
        System.out.println(5 < 4 & 10 > 2);     // evaluate both expressions
        System.out.println(5 < 4 && 10 > 2);    // evaluate only first expressions
        System.out.println(5 > 4 | 10 > 2);     // evaluate both expressions
        System.out.println(5 > 4 || 10 > 2);    // evaluate only first expressions

        String[] name = null;                   // a Strings array - test successive all conditions
        if (name != null
                && name.length > 0
                && name[0] != null
                && name[0].length() > 0) {
            System.out.println(name[0]);
        }
        System.out.println("Another instructions");
    }
}
