package course.chapter02;

import java.util.Arrays;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ArraysMethods {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        String[][] cars = {
                {"lexus", "rav 4", "corolla"}, {"duster", "mcv", "logan"}
                , {"bmw 335i", "bmw m2", "bmw m5"}, {"ferrari812 GTS", "ferrari SP 48"}
        };

        System.out.println(Arrays.deepToString(cars));
        for (String[] item : cars) {
            Arrays.sort(item);
        }
        System.out.println(Arrays.deepToString(cars));
        System.out.println(Arrays.binarySearch(cars[2], "bmw m2")); // 1
        String[][] newCars = Arrays.copyOf(cars, 5);    // new array with plus one elem
        System.out.println(Arrays.deepToString(newCars));        // has 1 more element (null)
        System.out.println(Arrays.equals(cars[1], newCars[1]));  // true
        int[] newNumbers = Arrays.copyOf(numbers, 7);   // new array with plus 3 elem
        Arrays.fill(newNumbers, 4, 7, 7);     // fill new elem to value 7
        System.out.println(Arrays.toString(newNumbers));         // [1, 2, 3, 4, 7, 7, 7]
    }
}
