package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class CodeSequenceAndBlock {

    public static void main(String[] args) {
        // code sequence
        int number1 = 7;
        int number2 = 3;
        int productOfNumbers = number1 * number2;
        System.out.println(productOfNumbers);

        // code block
        if (number1 > number2) {
            // fragment of statements. Can contain sequence or other blocks
            System.out.println("Done");
        }
    }
}
