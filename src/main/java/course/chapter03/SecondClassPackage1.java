package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class SecondClassPackage1 {

    /**
     * in other class, from same package, private attributes and methods are not visible
     */

    void accessFromSCP1(){
        FirstClassPackage1 firstClassObject = new FirstClassPackage1();
        firstClassObject.publicVarFCP1++;        // ok
        //firstClassObject.privateVarFCP1++;     // not accessible
        firstClassObject.protectedVarFCP1++;     // ok
        firstClassObject.defaultVarFCP1++;       // ok
        firstClassObject.accessFromFCP1();
    }

    public static void main(String[] args) {
        new SecondClassPackage1().accessFromSCP1();
    }
}
