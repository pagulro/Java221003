package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class ArithmeticBinaryOperators{
    /**
     *
     * @param args
     * char in arithmetic operation are transformed in integer
     * division between two integer result an integer
     * if one division operand is double the result will be double
     * be carefully at order in string with integers plus operations
     */

    public static void main(String[] args) {
        System.out.println(3 + 7 + 13);	        // 23  (int)
        System.out.println("3" + 7 + 13);	    // 3713  (String)
        System.out.println(3 + 7 + "13");	    // 1013  (String)
        System.out.println("3" + (7 + 13));	    // 320  (String)
        System.out.println(3 + '7' + 13);       // 71  (int)
        System.out.println(7 / 3);		        // 2  (int)
        System.out.println(7 / 3.0);		    // 2.3(3) (double)
        System.out.println(7 % 3);              // 1 (int)
    }
}