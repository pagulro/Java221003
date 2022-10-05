package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class DefineMethods {

    public int addition(int x, int y) {
        return x + y;
    }

    public String fullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }

    public Person person1() {
        return new Person();            // class Person definition must exist in same package
    }
}
