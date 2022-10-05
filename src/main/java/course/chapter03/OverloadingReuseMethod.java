package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class OverloadingReuseMethod {
    public int max(int nr1, int nr2) {
        return nr1 > nr2 ? nr1 : nr2;
    }

    public int max(int nr1, int nr2, int nr3) {
        return max(max(nr1, nr2), nr3);                   // reuse max method with 2 parameters
    }

    public static void main(String[] args) {
        OverloadingReuseMethod overloading = new OverloadingReuseMethod();
        System.out.println(overloading.max(3, 7));        // return 7
        System.out.println(overloading.max(3, 7, 11));    // return 11
    }
}
