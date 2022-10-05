package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class PersonOver {

    private String name;
    private int age;

    PersonOver() {
    }                                                       // default constructor

    PersonOver(String name, int age) {
        this.name = name;
        this.age = age;                                     // constructor with parameters
    }

    PersonOver(String name) {
        this(name, 0);
    }         // use other constructor

    public static void main(String[] args) {
        PersonOver person0 = new PersonOver();              // correct
        System.out.println(person0.name + " is " + person0.age + " years old");
        // null is 0 years old
        PersonOver person1 = new PersonOver("John");        // correct
        System.out.println(person1.name + " is " + person1.age + " years old");
        // John is 0 years old
        PersonOver person2 = new PersonOver("Mary", 27);    // correct
        System.out.println(person2.name + " is " + person2.age + " years old");
        // Mary is 27 years old
    }
}
