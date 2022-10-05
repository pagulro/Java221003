package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class NewSwitchV17 {

    public static void main(String[] args) {
        Double doubleVar = 12.5;

        String result = checkObject(doubleVar);
        System.out.println(result);
    }

    /**
     * @param obj argument must be an object
     * @return return type must be String
     * the method check type of object
     * 1. if object is String
     * 2. if object is Double and have exact 12.5 value
     * 3. if object have another Double value
     * 4. if object is Integer
     * 5. if it's null
     */
    public static String checkObject(Object obj) {
        return switch (obj) {
            case String h -> "Is string";
            case Double d && d == 12.5 -> "Is exact 12.5";
            case Double d1 -> "Is a simple double";
            case Integer s -> "Is integer";
            case null -> "Is null";
            default -> "It is not a known object";
        };
    }
}