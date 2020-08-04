package pl.sda.advanced.exceptions;

public class ExceptionsMain {
    public static void main(String[] args) {
        System.out.println(method1("Ania"));
        System.out.println(method1("5"));
        try {
            System.out.println(method3("abc"));
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(method5("cba"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("jeszcze jedna linijka");
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

    public static Integer method3(String text) throws MyException { // z powodu tego ze jest to checkedException trzeba go obsluzyc lub delegowac dalej
        if (text.contains("a")) {

            throw new MyException("Słowo zawiera litere a ");
        }
        return Integer.parseInt(text);

    }// obsluga od razu  po wystapieniu wyjatku

    public static Integer method4(String text) {
        try {
            if (text.contains("a")) {

                throw new MyException("Słowo zawiera litere a ");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
        return Integer.parseInt(text);
    }

    public static Integer method5(String text) { // nie trzeba obslugiwac w sposob jawny
        if (text.contains("a")) {

            throw new MyRunTimeException("Słowo zawiera litere a ");
        }
        return Integer.parseInt(text);

    }
}

