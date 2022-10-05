package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class Overloading {
    public int addNumbers(int nr1, int nr2) {
        return nr1 + nr2;
    }

    public int addNumbers(int nr1, int nr2, int nr3) {
        return nr1 + nr2 + nr3;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        System.out.println(overloading.addNumbers(3, 7));           // return 10
        System.out.println(overloading.addNumbers(3, 7, 11));       // return 21
    }
}
