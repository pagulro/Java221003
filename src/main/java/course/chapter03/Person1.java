package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class Person1 {                             // class name
    public String name;                     // attribute
    private String hobby = "ski";
}

class Firm {
    Person1 director = new Person1();
}
