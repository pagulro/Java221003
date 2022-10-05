package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class PersonGetSet {

    private int age;
    private boolean authenticate = false;

    public int getAge() {
        if (authenticate) {
            return age;
        } else return 0;
    }

    public void setAge(int age) {
        if (age < 150 && age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }

    public static void main(String[] args) {
        // see in Main
    }
}
