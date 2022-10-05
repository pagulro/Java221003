package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

class ClassicSwitch {

    public static void main(String[] args) {
        String season = "winter";
        // classic switch
        switch (season) {
            case "spring":
                System.out.println("flower");
                break;
            case "summer":
                System.out.println("sun");
                break;
            case "autumn":
                System.out.println("fruits");
                break;
            case "winter":
                System.out.println("ski");
                break;
            default:
                System.out.println(season + " unknown");
                break;
        }
        // enhanced switch with similar result
        switch (season) {
            case "spring" -> System.out.println("flower");
            case "summer" -> System.out.println("sun");
            case "autumn" -> System.out.println("fruits");
            case "winter" -> System.out.println("ski");
            default -> System.out.println(season + " unknown");
        }
    }
}