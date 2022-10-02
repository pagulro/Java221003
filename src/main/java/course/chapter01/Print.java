package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class Print {
    /**
     *
     * @param args
     *  System.out.println accept one expression and transform result of them in string
     *      after print the cursor jumps to the next line
     *      plus operator made concatenation with string
     *      if we need a numeric operation before concatenation use parenthesis
     *  System.out.print accept one expression and transform result of them in string
     *      after print the cursor remain on the current line
     */
    public static void main(String[] args) {
        // print on separate lines:
        System.out.println("Your text here");        // Your text here - without quotes
        System.out.println("Another " + "text " + "here");      // Another text here
        System.out.println("Addition: 2 + 2 = : " + (2 + 2));  // Addition: 2 + 2 = 4
        System.out.println("Concatenate: " + 2 + 2);            // Concatenate: 22

        // print on same line:
        System.out.print("Mary ");
        System.out.print("likes ");
        System.out.print("singing\n");                            // Mary likes singing
    }
}