package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class PersonPublic {

    String name;

    public static void main(String[] args) {
        PersonPublic person = new PersonPublic();
        person.name = "Mary";           // ok

        person.name = "abc";            // not ok, but cannot control that
        person.name = null;             // we have access direct at mane and can make this
    }
}
