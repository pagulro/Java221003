package course.chapter02;

/**
 * @author paul fratila
 * @version 2.0.2
 * @since 2022-09-15
 */

public class ParseBiDimensionalArray {

    public static void main(String[] args) {
        String[][] cars = {{"lexus", "rav 4", "corolla"}, {"duster", "mcv", "logan"}
                , {"bmw 335i", "bmw m2", "bmw m5"}, {"ferrari812 GTS", "ferrari SP 48"}};

        int index = 0;                      // offer access to array index

        for (String[] brand : cars) {
            String supplier = "";
            if (index == 0) {                // select the correct supplier
                supplier = "Toyota";
            } else if (index == 1) {
                supplier = "Dacia";
            } else if (index == 2) {
                supplier = "BMW";
            } else if (index == 3) {
                supplier = "Ferrari";
            }
            System.out.println(supplier + " cars:");

            for (String car : brand) {
                System.out.println("\t" + car); // prints one supplier cars
            }
            index++;

        }

        index = 0;
        for (String[] brand : cars) {
            String supplier = switch (index) {                // select the correct supplier
                case 0 -> "Toyota";
                case 1 -> "Dacia";
                default -> "BMW";
                case 3 -> "Ferrari";
            };
            System.out.println(supplier + " cars:");

            for (String car : brand) {
                System.out.println("\t" + car); // prints one supplier cars
            }
            index++;
        }
    }
}
