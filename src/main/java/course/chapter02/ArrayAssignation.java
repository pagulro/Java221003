package course.chapter02;

import java.util.Arrays;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ArrayAssignation {

    public static void main(String[] args) {
        int[] uni = {1, 2, 3, 4};
        int[] reverseUni = {4, 3, 2, 1};
        int[][] biDim = new int[4][];
        int[][][] triDim = new int[4][4][];

        // biDim = uni;             // error, incorrect dimensions
        // biDim = triDim;          // error, incorrect dimensions
        // triDim[3][3] = biDim;    // error, incorrect dimensions
        biDim[2] = uni;             // correct! (uni dimensional)
        triDim[3] = biDim;          // correct! (bi dimensional)
        triDim[3][3] = uni;         // correct! (uni dimensional)
        triDim[3][3][0] = reverseUni[0];   // correct! scalar (int)
        System.out.println(Arrays.deepToString(biDim));
        biDim = triDim[2];          // correct! (bi dimensional)

        System.out.println(Arrays.deepToString(triDim));
        System.out.println(Arrays.deepToString(biDim));
    }
}
