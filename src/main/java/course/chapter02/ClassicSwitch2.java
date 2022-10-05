package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ClassicSwitch2 {

    public static void main(String[] args) {
        int nota = 9;
        // classic
        switch (nota) {
            case 10:
            case 9:
                System.out.println(nota + " A");
                break;
            case 8:
            case 7:
                System.out.println(nota + " B");
                break;
            default:
                System.out.println(nota + " C");
                break;
        }
        // enhanced
        switch (nota) {
            case 10, 9 -> System.out.println(nota + " A");
            case 8, 7 -> System.out.println(nota + " B");
            default -> System.out.println(nota + " C");
        }
    }
}
