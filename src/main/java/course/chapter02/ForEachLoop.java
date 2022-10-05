package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ForEachLoop {
    // enhanced for loop
    public static void main(String[] args) {
        String[] fruits = {"pere", "apple", "strawberry"};
        for (String fruit : fruits) {
            System.out.println("I like " + fruit);
        }
    }
}
