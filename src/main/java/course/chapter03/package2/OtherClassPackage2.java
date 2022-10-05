package course.chapter03.package2;

import course.chapter03.FirstClassPackage1;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class OtherClassPackage2 {

    /**
     * private, protected or default attributes and methods are not accessible
     * directly from other package, but are accessible indirectly from public method
     */
    void accessFromOther(){
        FirstClassPackage1 firstClassObject = new FirstClassPackage1();
        firstClassObject.publicVarFCP1++;           // ok
        //firstClassObject.privateVarFCP1++;        // not accessible
        //firstClassObject.protectedVarFCP1++;      // not accessible
        //firstClassObject.defaultVarFCP1++;        // not accessible
        firstClassObject.accessFromFCP1();
    }

    public static void main(String[] args) {
        new OtherClassPackage2().accessFromOther();
    }
}
