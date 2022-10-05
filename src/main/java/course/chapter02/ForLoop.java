package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 3; i <= 10; i++) {
            System.out.println("2 to the " + i + "th power = " + (int) Math.pow(2, i));
        } // prints 2 powers from 3 to 10.

        String stringVar = "abcd";
        for (int i = 0; i < stringVar.length(); i++) {
            System.out.println(stringVar.charAt(i));
        }
    }
}
