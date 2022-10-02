package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class ArithmeticUnaryOperators {

    public static void main(String[] args) {
        int x = 7;
        System.out.println("x : " + x);         // initially value 7
        System.out.println("++x : " + ++x);     // prints 8, x increase to 8
        System.out.println("x++ : " + x++);     // prints 8, x increase to 9
        System.out.println("--x : " + --x);     // prints 8, x decrease to 8
        System.out.println("x-- : " + x--);     // prints 8, x decrease to 7
    }
}