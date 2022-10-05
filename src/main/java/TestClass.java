import java.util.concurrent.ThreadLocalRandom;

public class TestClass {

    public static void main(String[] args) {
        System.out.println("Salut " );
        int number = ThreadLocalRandom.current().nextInt(1, 99);

        String string = """
                ana
                are
                mere
        """;
        System.out.println(string);
    }
}
