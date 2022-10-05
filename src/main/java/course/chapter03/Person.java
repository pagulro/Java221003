package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class Person {

    String name;    // attribute
    String hobby = "ski";

    public static void main(String[] args) {
        Person person1;                     // declare an object
        person1 = new Person();             // initialise object
        Person person2 = new Person();      // declare and initialize object
        person1.sayHello();                 // I'm null and I like ski
        person2.sayHello();                 // I'm null and I like ski
        person1.setName("Mary");
        person2.setName("George");
        person1.setHobby("chess");
        person1.sayHello();                 // I'm Mary and I like chess
        person2.sayHello();                 // I'm George and I like ski
    }

    public void sayHello() {                // method
        System.out.println("I'm " + name + " and I like " + hobby);
    }

    public void setName(String value) {
        name = value;
    }

    public void setHobby(String newHobby) {
        hobby = newHobby;
    }

}
