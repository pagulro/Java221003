package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class FirstArray {

    public static void main(String[] args) {
        String[] productsArray;                 // declaring an array
        productsArray = new String[5];          // initialize an array
        double[] doubleArray = new double[10];  // declaring and initialize an array
        int[] numbersArray = {1, 3, 7, 11};     // declaring and initialize with values
        System.out.println(addition(new int[]{3, 7})); // anonymous array
    }

    public static int addition(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
