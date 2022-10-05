package course.chapter03;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class VarArgsPlus {

    public static void friends(String name, String ...friendsArray){
        System.out.print(name + "'s friends are : ");
        for(String friend: friendsArray){
            System.out.print(friend + ", ");
        }
    }

    public static void main(String[] args){
        friends("Mary", "John", "Ben", "Chris");
        System.out.println("\n");

        String[] persons = {"Diana", "John","Robert"};
        friends("George", persons);
    }
}
