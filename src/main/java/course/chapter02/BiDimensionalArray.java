package course.chapter02;

import java.util.Arrays;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class BiDimensionalArray {

    public static void main(String[] args) {
        // declare and initialize parent array
        int[][] biDimensionalArrayOfInt;
        String[][] cars = {
                {"lexus", "rav 4", "corolla"},
                {"duster", "mcv", "logan"},
                {"bmw 335i", "bmw m2", "bmw m5"},
                {"ferrari812 GTS", "ferrari SP 48"}
        };

        // initialize array elements
        biDimensionalArrayOfInt = new int[3][];     // reference to secondary arrays
        biDimensionalArrayOfInt[0] = new int[4];   // reference to sec elements
        biDimensionalArrayOfInt[0][0] = 7;         // assign value
        biDimensionalArrayOfInt[1] = new int[]{9, 8, 7, 6};  // assign values

        System.out.println(Arrays.deepToString(cars));
        System.out.println(Arrays.deepToString(biDimensionalArrayOfInt));
    }
}
