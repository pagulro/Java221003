package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class CopyReference {

    /**
     *
     * @param args
     *      arrayOfInt1.equals(arrayOfInt2) compare references
     *      Arrays.equals(arrayOfInt1, arrayOfInt2) compare values
     */
    public static void main(String[] args) {
        int[] arrayOfInt1 = {1, 2, 3};    // first array
        int[] arrayOfInt2 = {1, 2, 3};    // second array with separate reference
        int[] arrayOfInt3 = arrayOfInt1;  // third array same reference with first

        System.out.println(arrayOfInt1.equals(arrayOfInt2));  // return false
        System.out.println(arrayOfInt1.equals(arrayOfInt3));  // return true

        arrayOfInt2[0] = 7;
        System.out.println(arrayOfInt1[0]);     // return 1, no changes

        arrayOfInt3[1] = 10;
        System.out.println(arrayOfInt1[1]);     // return 10, changed

    }
}
