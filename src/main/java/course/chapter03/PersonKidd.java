package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class PersonKidd {
    private byte kidsNumber = 0;

    public void increaseFamily() {
        kidsNumber++;
    }

    public byte getKidsNumber() {
        return kidsNumber;
    }

    public static void main(String[] args) {
        PersonKidd personKidd = new PersonKidd();
        personKidd.increaseFamily();
        System.out.println(personKidd.getKidsNumber());

        PersonKiddALt personKiddALt = new  PersonKiddALt();
        personKiddALt.increaseFamily();
        System.out.println(personKiddALt.getKidsNumber());
    }
}

class PersonKiddALt {
    private int kidsNumber = 0;
    int newBirthKids = 1;

    public void increaseFamily() {
        kidsNumber += newBirthKids;
    }       // can change internal implementation

    public byte getKidsNumber() {
        return (byte) kidsNumber;
    }
}
