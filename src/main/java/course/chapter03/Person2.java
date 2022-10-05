package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class Person2 {
    int iq = 110;
    public void learn(){
        setNewIq(iq + 5);                   // use a method
    }

    public void setNewIq(int iq) {
        this.iq = iq;
    }

    public static void main(String[] args) {
        Person2 person = new Person2();
        System.out.println(person.iq);
        person.setNewIq(125);
        System.out.println(person.iq);
        person.learn();
        System.out.println(person.iq);
    }
}
