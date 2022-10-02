package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class ExplicitConversion {

    public static void main(String[] args) {
        int intVar = 200;
        System.out.println(intVar);
        float floatVar = 99.999f;
        byte byteVar = (byte) intVar;       // assign -56
        System.out.println(byteVar);
        intVar = (int) floatVar;            // assign 99
        System.out.println(intVar);
        long longVar = 100_000_000_000L;
        intVar = (int) longVar;             // assign 1_215_752_192
        System.out.println(intVar);
    }
}
