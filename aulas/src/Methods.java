public class Methods {
    public static void main(String[] args) {
        String name = "Kauê";

        hello(name);
        hello(name.replace('ê', 'ã'));

        System.out.println("O nome " + name + " tem " + howManyLetters(name));
    }

    static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    static int howManyLetters(String word) {
        return word.length();
    }
}
