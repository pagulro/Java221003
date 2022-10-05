package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class PersonAttributes {
    int iq = 110;                                          // attribute

    public void learn() {
        iq++;
    }                          // or this.iq

    public void seNewIq(int iq) {
        this.iq = iq;
    }          // required this.iq

    public static void main(String[] args) {
        PersonAttributes person1 = new PersonAttributes();
        System.out.println(person1.iq);
        person1.learn();
        System.out.println(person1.iq);
        person1.seNewIq(119);
        System.out.println(person1.iq);
    }

}
