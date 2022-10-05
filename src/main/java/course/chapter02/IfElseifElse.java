package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class IfElseifElse {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 10);
        String delimiter = "-----------delimiter-------------";
        // 1. simple if
        if(number > 5){
            System.out.println(number + " is greater than 5");
        }
        // 2. if ... else
        System.out.println(delimiter);
        if(number > 5){
            System.out.println(number + " is greater than 5");
        } else {
            System.out.println(number + " is less or equal than 5");
        }
        // 3. if ...else if ... else
        System.out.println(delimiter);
        if(number > 5){
            System.out.println(number + " is greater than 5");
        } else if (number < 5) {
            System.out.println(number + " is less than 5");
        } else {
            System.out.println("Number 5");
        }
    }
}