package course.chapter03;

import java.text.MessageFormat;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class FirstClassPackage1 {

    public int publicVarFCP1;
    private int privateVarFCP1;
    protected int protectedVarFCP1;
    int defaultVarFCP1;

    /**
     * all attributes and methods are visible in there class, included protected and private.
     */
    public void accessFromFCP1() {
        publicVarFCP1++;        // ok
        privateVarFCP1++;       // ok
        protectedVarFCP1++;     // ok
        defaultVarFCP1++;       // ok
        System.out.println(MessageFormat.format("Pub {0} \nPri {1} \nPro {2} \nDef {3}",
                publicVarFCP1, privateVarFCP1, protectedVarFCP1, defaultVarFCP1));
    }
    public static void main(String[] args) {
        FirstClassPackage1 firstClassPackage1 = new FirstClassPackage1();
        firstClassPackage1.accessFromFCP1();
    }
}
