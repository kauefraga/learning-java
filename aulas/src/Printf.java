public class Printf {
    public static void main(String[] args) {
        // % [flags] [precision] [width] [conversion-character]

        System.out.printf("Vai se fuder, %d vezes\n", 2);
        System.out.printf("Se fudeu? %b\n", true);
        System.out.printf("%d + %d = %d\n", 1, 2, 3);
        System.out.printf("Money: %.2f\n", 1230.1452);
    }
}
