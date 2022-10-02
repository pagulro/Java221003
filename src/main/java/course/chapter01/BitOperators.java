package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class BitOperators {

    public static void main(String[] args) {
        int x = 215;
        // bit logical operators
        System.out.println("Bit 0 is: " + (x & 1));           // 1
        System.out.println("Bit 1 is: " + ((x >> 1) & 1));    // 1
        System.out.println("Bit 2 is: " + ((x >> 2) & 1));    // 1
        System.out.println("Bit 3 is: " + ((x >> 3) & 1));    // 0

        // bit shift operators
        System.out.println("Shift r " + (256  >> 1));       // equivalent 256 / 2^1
        System.out.println("Shift r " + (256  >> 2));       // equivalent 256 / 2^2
        System.out.println("Shift l " + (256  << 1));       // equivalent 256 * 2^1
        System.out.println("Shift l " + (256  << 2));       // equivalent 256 * 2^2
    }
}
