package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class Firm3 {

    public void directorName(Person3 person) {
        person.name = "new name";
    }

    public static void main(String[] args) {
        Person3 person1 = new Person3();
        Firm3 alpha = new Firm3();
        person1.name = "George";
        System.out.println(person1.name);        // George
        alpha.directorName(person1);
        System.out.println(person1.name);        // new name
    }
}

class Person3 {
    String name;
}