package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class UsingBiDimensionalArray {

    public static void main(String[] args) {
        String[][] cars = {
                {"lexus", "rav 4", "corolla"},
                {"duster", "mcv", "logan"},
                {"bmw 335i", "bmw m2", "bmw m5"},
                {"ferrari812 GTS", "ferrari SP 48"}
        };

        String[] ferrari = cars[3];     // use a unidimensional array
        System.out.println(ferrari[0]); // prints ferrari812 GTS
        System.out.println(cars[3][1]); // prints ferrari SP 48
        System.out.println(cars[1][0]); // prints duster
        System.out.println(cars[2][1]); // prints bmw m2
    }
}
