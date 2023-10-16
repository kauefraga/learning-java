import java.util.Scanner;

public class Matematicas {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho de um cateto: ");
        x = scanner.nextDouble();

        System.out.println("Digite o tamanho do outro cateto: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));

        System.out.println("A hipotenusa mede: " + z);

        scanner.close();
    }
}
