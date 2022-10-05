package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class OverloadingByType {
    public void printNumber(short number){
        System.out.println("This is short : " + number);
    }
    public void printNumber(long number){
        System.out.println("This is long : " + number);
    }
    public static void main(String[] args){
        OverloadingByType overloading = new OverloadingByType();
        int intVar = 33;
        long longVar = 333;
        float floatVar = 3.333f;
        byte byteVar = 3;
        overloading.printNumber(intVar);                // This is long: 33
        overloading.printNumber(longVar);               // This is long: 333
        // overloading.printNumber(floatVar);           // error
        overloading.printNumber(byteVar);               // This is short: 3
    }
}
