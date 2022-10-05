package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class AssignmentOperators {
    /**
     *
     * @param args
     *  = operator permits on the right side a value, an expression or function/method call
     *  the operator can be combined with other operators (e.g. +=, *=, etc)
     *  we can reassign the variable value (must respect same data type)
     */
    public static void main(String[] args) {
        byte byteVar = 100;
        char charVar = 'A';
        int intVar = charVar;     // assign 65 the Unicode value
        long longVar = intVar;
        intVar += 35;               // increments with 35
        longVar *= 3;               // multiply by 3
        longVar = 9000000000L;
        intVar = (int) longVar;

        System.out.println(longVar);
        System.out.println(intVar);
    }
}
