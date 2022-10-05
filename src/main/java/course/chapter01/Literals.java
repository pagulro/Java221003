package course.chapter01;


/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class Literals {

    /**
     *
     * @param args number float must have f after last character
     *             float literals accept hexadecimal notation without f
     *             char have numeric representation (0 - 65355)
     *
     */
    public static void main(String[] args) {
        int intPositive = 3;
        int intNegative = -3;
        int intPosHex   = 0xCAFEA;
        int intNegHex   = -0xFF;
        int intPosBin   = 0b11111111;
        int intNegBin   = -0b1001;
        short shortPositiveHex    = 0x15;
        long longHexPosNotation   = 0xffffffff;
        long longNatNegNotation   = -92_23_372_036_854_775_808L;
        byte bytePositiveHex      = -0x10;
        float naturalPosFloat     = 13.1F;
        float naturalNegFloat     = -15.99f;
        float floatLeftENotation  = 1599E-2f;
        float floatRightENotation = 0.1599e2F;
        double naturalDouble      = 99.999f;
        double doubleENotation    = 99999e-3;
        String name      = "Mary";
        char normalChar  = 'A';
        char unicodeChar = '\u0041';

        System.out.println(normalChar);
        System.out.println(unicodeChar);
        }
}