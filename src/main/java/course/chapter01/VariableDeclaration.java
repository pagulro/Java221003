package course.chapter01;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class VariableDeclaration{
    /**
     *
     * @param args  name args can be changed
     *              main() signature must be respected
     */
    public static void main(String[] args){
        int number1;            // declared and not initialized
        number1 = 10;           // initialized
        System.out.println(number1 + "initial");
        number1 = 99;
        String name = "John";   // declared and initialized
        System.out.println(name + " is number " + number1);     // variable use
    }
}