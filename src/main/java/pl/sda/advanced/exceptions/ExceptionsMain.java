package pl.sda.advanced.exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {
        System.out.println(method1("Ania"));
        System.out.println(method1("5"));
    }

    public static Integer method1(String text) {
        return method2(text);
    }

    public static Integer method2(String text) {
        try {
            return Integer.parseInt(text);  // w tym miejscu zostanie rzucony wyjatek
        } catch (NumberFormatException exception) {
            System.out.println("Wystąpił błąd " + exception.getMessage());
            return null;
        } finally {   // uruchamia sie ZAWSZE na koncu
            System.out.println("blok finnaly");   // to miejsce potrzebne jest aby posprzatac np. po polaczeniach do bazy
//            return 7;
        }
    }
}
