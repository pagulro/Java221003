package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class PersonC {

    private String name;
    private int age;

    PersonC(String name ,int age) {
        this.name = name;
        this.age = age;
    }                                               // constructor

    public static void main(String[] args) {
        // PersonC noName = new PersonC();         // error, Person object need two parameters
        PersonC person = new PersonC("Mary", 27); // correct
        System.out.println(person.name);
    }
}
