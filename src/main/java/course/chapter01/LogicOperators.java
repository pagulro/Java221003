package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class LogicOperators {

    public static void main(String[] args) {
        double nr1 = Math.random() * 1000;   // [0, 1)
        double nr2 = Math.random() * 1000;

        System.out.println("Your numbers are: " + nr1 + " and " + nr2);
        System.out.println(nr1 > 100 & nr2 < 900);  // both condition must be true for true
        System.out.println(nr1 > 100 | nr2 < 900);  // minim one condition must be true for true
        System.out.println(!(nr1 > 100 & nr2 < 900));  // inverse boolean result of expression
        System.out.println(nr1 > 100 ^ nr2 < 900);  // one and only one condition must be true for true
    }
}