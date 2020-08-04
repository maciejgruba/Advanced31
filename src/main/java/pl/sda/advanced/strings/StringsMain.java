package pl.sda.advanced.strings;

public class StringsMain {
    private static String text = "12  , Adam, 1200";

    public static void main(String[] args) {
        String[] split = text.split(",");
        for (String s : split) {
            System.out.println(s.trim());
        }
        String[] split1 = text.split("\\W+");
        for (String s : split1) {
            System.out.println(s);
        }
    }
}
