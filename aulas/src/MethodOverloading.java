public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("--- Overloading Method Add ---");
        System.out.println("1 + 2 = " + add(1, 2));
        System.out.println("1,15 + 1,35 = " + add(1.15, 1.35));
        System.out.println("'Tua mãe ' + 'teu pai' = " + add("Tua mãe ", "teu pai"));
    }

    static int add(int x, int y) {
        return x + y;
    }

    static int add(int x, int y, int z) {
        return x + y + z;
    }

    static double add(double x, double y) {
        return x + y;
    }

    static String add(String x, String y) {
        return x + y;
    }
}
