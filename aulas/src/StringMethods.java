import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Kauê";

        boolean isEqualTo = name.equalsIgnoreCase("kauê");
        int nameLength = name.length();
        char nameLetterAt = name.charAt(2);
        int nameLetterIndex = name.indexOf("a");
        boolean isNameEmpty = name.isEmpty();
        String uppercase = name.toUpperCase();
        String lowercase = name.toLowerCase();
        String newName = name.replace('ê', 'ã');
    }
}
