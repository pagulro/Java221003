package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ParseArray {

    public static void main(String[] args) {
        String[] cars = {"lexus", "duster", "bmw", "ferrari"};
            // simple for
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

            // for each
        for (String car : cars) {
            System.out.println(car);
        }
            // both loops prints all elements
    }
}
