package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class SwitchExpression {

    public static void main(String[] args) {
        int nota = 9;

            // case with yield
        String result = switch (nota) {
            case 9, 10:
                yield  nota + " A";
            case 7, 8:
                yield nota + " B";
            default:
                yield  nota + " C";
        };
        System.out.println(result);

            //case with arrow
        result = switch (nota) {
            case 9, 10 -> nota + " A";
            case 7, 8 -> nota + " B";
            default -> nota + " C";
        };
        System.out.println(result);
    }
}
