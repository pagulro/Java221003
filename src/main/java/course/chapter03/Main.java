package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-10-03
 */

public class Main {

    public static void main(String[] args) {
        PersonGetSet personGetSet = new PersonGetSet();
        personGetSet.setAge(-2);
        personGetSet.setAge(20);
        System.out.println(personGetSet.getAge() == 0 ? "Must be authenticate" : personGetSet.getAge());

        // personGetSet.authenticate = true;                    // inaccessible from other class
        // can create a setter in original class

        // System.out.println(personGetSet.age);                // inaccessible from other class
        System.out.println(personGetSet.getAge() == 0 ? "Must be authenticate" : personGetSet.getAge());

    }
}
